package com.girlkun.models.boss;

import com.girlkun.consts.ConstPlayer;
import com.girlkun.models.boss.iboss.IBossNew;
import com.girlkun.models.boss.iboss.IBossOutfit;
import com.girlkun.models.boss.list_boss.AnTrom;
import com.girlkun.models.boss.list_boss.MiNuong;
import com.girlkun.models.boss.list_boss.NRD.*;
import com.girlkun.models.map.Zone;
import com.girlkun.models.player.Player;
import com.girlkun.models.skill.Skill;
import com.girlkun.server.ServerNotify;
import com.girlkun.services.EffectSkillService;
import com.girlkun.services.MapService;
import com.girlkun.services.PlayerService;
import com.girlkun.services.Service;
import com.girlkun.services.SkillService;
import com.girlkun.services.TaskService;
import com.girlkun.services.PetService;
import com.girlkun.services.func.ChangeMapService;
import com.girlkun.utils.SkillUtil;
import com.girlkun.utils.Util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Boss extends Player implements IBossNew, IBossOutfit {

    private static final Logger LOGGER = Logger.getLogger(Boss.class.getName());

    public final BossData[] data;
    public int currentLevel;
    public BossStatus bossStatus;
    protected long lastTimeChatS;
    protected int timeChatS;
    protected int indexChatS;
    protected long lastTimeChatM;
    protected int timeChatM;
    protected int indexChatM;
    protected long lastTimeChatE;
    protected int timeChatE;
    protected int indexChatE;
    protected long lastTimeRest;
    protected long lastTimeTargetPlayer;
    protected int timeTargetPlayer;
    protected Player playerTarger;
    protected Zone lastZone;
    protected Boss parentBoss;
    public Boss[][] bossAppearTogether;

    private long lastTimeRespawnNotify;
    private boolean preSpawnNotified;
    private static final long RESPAWN_NOTIFY_INTERVAL = 60 * 1000; // 1 minute
    private static final long INITIAL_NOTIFY_THRESHOLD = 5 * 60 * 1000; // 5 minutes

    public Boss(int id, BossData... data) throws Exception {
        super();
        if (data == null || data.length == 0) {
            throw new Exception("Dữ liệu boss không hợp lệ");
        }
        this.data = data;
        this.currentLevel = 0;
        this.bossStatus = BossStatus.REST;
        BossManager.gI().addBoss(this);
        this.bossAppearTogether = new Boss[this.data.length][];
        for (int i = 0; i < this.bossAppearTogether.length; i++) {
            if (this.data[i].bossJoinMapTogether != null) {
                this.bossAppearTogether[i] = new Boss[this.data[i].bossJoinMapTogether.length];
                for (int j = 0; j < this.data[i].bossJoinMapTogether.length; j++) {
                    Boss boss = BossManager.gI().createBoss(this.data[i].bossJoinMapTogether[j]);
                    if (boss != null) {
                        boss.parentBoss = this;
                        this.bossAppearTogether[i][j] = boss;
                    }
                }
            }
        }
        this.preSpawnNotified = false; // Initialize to false
    }

    @Override
    public void initBase() {
        BossData data = this.data[this.currentLevel];
        this.name = data.name + " " + Util.nextInt(0, 100);
        this.gender = data.gender;
        this.nPoint.mpg = 7_5_2002;
        this.nPoint.dameg = (long) data.dame;
        this.nPoint.hpg = (long) data.hp[Util.nextInt(0, data.hp.length - 1)];
        this.nPoint.hp = nPoint.hpg;
        this.nPoint.calPoint();
        this.initSkill();
        this.resetBase();
    }

    protected void initSkill() {
        for (Skill skill : this.playerSkill.skills) {
            skill.dispose();
        }
        this.playerSkill.skills.clear();
        this.playerSkill.skillSelect = null;
        int[][] skillTemp = data[this.currentLevel].skill;
        for (int i = 0; i < skillTemp.length; i++) {
            Skill skill = SkillUtil.createSkill(skillTemp[i][0], skillTemp[i][1]);
            if (skillTemp[i].length == 3) {
                skill.coolDown = skillTemp[i][2];
            }
            this.playerSkill.skills.add(skill);
        }
    }

    protected void resetBase() {
        this.lastTimeChatS = 0;
        this.lastTimeChatE = 0;
        this.timeChatS = 0;
        this.timeChatE = 0;
        this.indexChatS = 0;
        this.indexChatE = 0;
    }

    //.outfit.
    @Override
    public short getHead() {
        if (effectSkill != null && effectSkill.isMonkey) {
            return (short) ConstPlayer.HEADMONKEY[effectSkill.levelMonkey - 1];
        }
        return this.data[this.currentLevel].outfit[0];
    }

    @Override
    public short getBody() {
        if (effectSkill != null && effectSkill.isMonkey) {
            return 193;
        }
        return this.data[this.currentLevel].outfit[1];
    }

    @Override
    public short getLeg() {
        if (effectSkill != null && effectSkill.isMonkey) {
            return 194;
        }
        return this.data[this.currentLevel].outfit[2];

    }

    @Override
    public short getFlagBag() {
        return this.data[this.currentLevel].outfit[3];
    }

    @Override
    public byte getAura() {
        return (byte) this.data[this.currentLevel].outfit[4];
    }

    @Override
    public byte getEffFront() {
        return (byte) this.data[this.currentLevel].outfit[5];
    }

    public Zone getMapJoin() {
        int mapId = this.data[this.currentLevel].mapJoin[Util.nextInt(0, this.data[this.currentLevel].mapJoin.length - 1)];
        Zone map = MapService.gI().getMapWithRandZone(mapId);
        //to do: check boss in map

        return map;
    }

    @Override
    public void changeStatus(BossStatus status) {
        this.bossStatus = status;
    }

    @Override
    public Player getPlayerAttack() {
        if (this instanceof AnTrom && (this.playerTarger == this.pet || this.playerTarger == this.TrieuHoipet || this.playerTarger == this.newpet || Util.canDoWithTime(this.lastTimeTargetPlayer, this.timeTargetPlayer))) {
            this.playerTarger = this.zone.getRandomPlayerInMapPlayer();
            this.lastTimeTargetPlayer = System.currentTimeMillis();
            this.timeTargetPlayer = Util.nextInt(1000, 2000);
        } else {
            if (this.playerTarger != null && (this.playerTarger.isDie() || !this.zone.equals(this.playerTarger.zone))) {
                this.playerTarger = null;
            }
            if (this.playerTarger != null && this.playerTarger.effectSkin != null && this.playerTarger.effectSkin.isVoHinh) {
                this.playerTarger = null;
                this.lastTimeTargetPlayer = System.currentTimeMillis();
                this.timeTargetPlayer = Util.nextInt(1000, 2000);
            }
            if (this.playerTarger == null || Util.canDoWithTime(this.lastTimeTargetPlayer, this.timeTargetPlayer)) {
                this.playerTarger = this.zone.getRandomPlayerInMap();
                this.lastTimeTargetPlayer = System.currentTimeMillis();
                this.timeTargetPlayer = Util.nextInt(5000, 7000);
            }
        }
        return this.playerTarger;
    }

    public void setPlayerTarger(Player playerTarger) {
        this.playerTarger = playerTarger;
    }

    @Override
    public boolean isAdmin() {
        return false;
    }

    @Override
    public void changeToTypePK() {
        PlayerService.gI().changeAndSendTypePK(this, ConstPlayer.PK_ALL);
    }

    @Override
    public void changeToTypeNonPK() {
        PlayerService.gI().changeAndSendTypePK(this, ConstPlayer.NON_PK);
    }

    @Override
    public void update() {
        super.update();
//        System.out.println("this status: " + this.bossStatus + " (" + this.id + ")");
        this.nPoint.mp = this.nPoint.mpg;
        if (this.effectSkill.isHaveEffectSkill()) {
            return;
        }
        switch (this.bossStatus) {
            case REST:
                this.rest();
                break;
            case RESPAWN:
                long timeSinceRest = System.currentTimeMillis() - this.lastTimeRest;
                long totalRestTime = (long) this.data[this.currentLevel].secondsRest * 1000;
                long remainingRespawnTime = totalRestTime - timeSinceRest;

                if (remainingRespawnTime > 0) {
                    if (!this.preSpawnNotified && remainingRespawnTime <= INITIAL_NOTIFY_THRESHOLD) {
                        // Initial notification (e.g., 5 minutes before)
                        int minutes = (int) Math.ceil((double) remainingRespawnTime / (60 * 1000));
                        ServerNotify.gI().notify("BOSS " + this.name + " sẽ xuất hiện trong " + minutes + " phút tại " + this.zone.map.mapName + " khu " + this.zone.zoneId);
                        this.preSpawnNotified = true;
                        this.lastTimeRespawnNotify = System.currentTimeMillis();
                    } else if (this.preSpawnNotified && Util.canDoWithTime(this.lastTimeRespawnNotify, RESPAWN_NOTIFY_INTERVAL)) {
                        // Periodic notifications
                        int minutes = (int) Math.ceil((double) remainingRespawnTime / (60 * 1000));
                        if (minutes > 0) { // Only send if there's still time remaining
                            ServerNotify.gI().notify("BOSS " + this.name + " sẽ xuất hiện trong " + minutes + " phút tại " + this.zone.map.mapName + " khu " + this.zone.zoneId);
                        }
                        this.lastTimeRespawnNotify = System.currentTimeMillis();
                    }
                } else {
                    // Respawn is complete, proceed to join map
                    this.respawn();
                    this.changeStatus(BossStatus.JOIN_MAP);
                }
                break;
            case JOIN_MAP:
                this.joinMap();
                this.changeStatus(BossStatus.CHAT_S);
                break;
            case CHAT_S:
                if (chatS()) {
                    this.doneChatS();
                    this.lastTimeChatM = System.currentTimeMillis();
                    this.timeChatM = 5000;
                    this.changeStatus(BossStatus.ACTIVE);
                }
                break;
            case ACTIVE:
                this.chatM();
                if (this.effectSkill.isCharging && !Util.isTrue(1, 20) || this.effectSkill.useTroi) {
                    return;
                }
                this.active();
                break;
            case DIE:
                this.changeStatus(BossStatus.CHAT_E);
                break;
            case CHAT_E:
                if (chatE()) {
                    this.doneChatE();
                    this.changeStatus(BossStatus.LEAVE_MAP);
                }
                break;
            case LEAVE_MAP:
                this.leaveMap();
                break;
        }
    }

    //loop
    @Override
    public void rest() {
        int nextLevel = this.currentLevel + 1;
        if (nextLevel >= this.data.length) {
            nextLevel = 0;
        }
        if (this.data[nextLevel].typeAppear == (byte) TypeAppear.DEFAULT_APPEAR.ordinal()
                && Util.canDoWithTime(lastTimeRest, (long) this.data[this.currentLevel].secondsRest * 1000)) {
            this.changeStatus(BossStatus.RESPAWN);
        }
    }

    @Override
    public void respawn() {
        this.currentLevel++;
        if (this.currentLevel >= this.data.length) {
            this.currentLevel = 0;
        }
        this.initBase();
        this.changeToTypeNonPK();
    }

    @Override
    public void joinMap() {
        if (this.zone == null) {
            if (this.parentBoss != null) {
                this.zone = parentBoss.zone;
            } else if (this.lastZone == null) {
                this.zone = getMapJoin();
            } else {
                this.zone = this.lastZone;
            }
        }
        if (this.zone != null) {
            if (this.currentLevel == 0) {
                if (this.parentBoss == null) {
                    ChangeMapService.gI().changeMapBySpaceShip(this, this.zone, -1);
                } else {
                    ChangeMapService.gI().changeMapBySpaceShip(this, this.zone,
                            this.parentBoss.location.x + Util.nextInt(-100, 100));
                }
                this.wakeupAnotherBossWhenAppear();
            } else {
                ChangeMapService.gI().changeMap(this, this.zone, this.location.x, this.location.y);
            }
            Service.getInstance().sendFlagBag(this);
            this.notifyJoinMap();
        }
    }

    public void joinMapByZone(Player player) {
        if (player.zone != null) {
            this.zone = player.zone;
            ChangeMapService.gI().changeMapBySpaceShip(this, this.zone, -1);
        }

    }

    public void joinMapByZone(Zone zone) {
        if (zone != null) {
            this.zone = zone;
            ChangeMapService.gI().changeMapBySpaceShip(this, this.zone, -1);
        }
    }

    protected void notifyJoinMap() {
//        if (this.id >= -22 && this.id <= -20) return;
        if (this.zone.map.mapId == 140 || MapService.gI().isMapMaBu(this.zone.map.mapId)
                || MapService.gI().isMapDoanhTrai(this.zone.map.mapId)
                || MapService.gI().isMapKhiGas(this.zone.map.mapId)
                || MapService.gI().isMapBanDoKhoBau(this.zone.map.mapId)
                || MapService.gI().isMapBlackBallWar(this.zone.map.mapId)
                || this instanceof MiNuong
                || this instanceof AnTrom) {
            return;
        }
        ServerNotify.gI().notify("BOSS " + this.name + " vừa xuất hiện tại " + this.zone.map.mapName + " khu " + this.zone.zoneId);
    }

    @Override
    public boolean chatS() {
        if (Util.canDoWithTime(lastTimeChatS, timeChatS)) {
            if (this.indexChatS == this.data[this.currentLevel].textChat1.length) {
                return true;
            }
            String textChat = this.data[this.currentLevel].textChat1[this.indexChatS];
            int prefix = Integer.parseInt(textChat.substring(1, textChat.lastIndexOf("|")));
            textChat = textChat.substring(textChat.lastIndexOf("|") + 1);
            if (!this.chat(prefix, textChat)) {
                return false;
            }
            this.lastTimeChatS = System.currentTimeMillis();
            this.timeChatS = textChat.length() * 100;
            if (this.timeChatS > 2000) {
                this.timeChatS = 2000;
            }
            this.indexChatS++;
        }
        return false;
    }

    @Override
    public void doneChatS() {

    }

    @Override
    public void chatM() {
        if (this.typePk == ConstPlayer.NON_PK) {
            return;
        }
        if (this.data[this.currentLevel].textChat2.length == 0) {
            return;
        }
        if (!Util.canDoWithTime(this.lastTimeChatM, this.timeChatM)) {
            return;
        }
        String textChat = this.data[this.currentLevel].textChat2[Util.nextInt(0, this.data[this.currentLevel].textChat2.length - 1)];
        int prefix = Integer.parseInt(textChat.substring(1, textChat.lastIndexOf("|")));
        textChat = textChat.substring(textChat.lastIndexOf("|") + 1);
        this.chat(prefix, textChat);
        this.lastTimeChatM = System.currentTimeMillis();
        this.timeChatM = Util.nextInt(3000, 20000);
    }

    @Override
    public void active() {
        if (this.typePk == ConstPlayer.NON_PK) {
            this.changeToTypePK();
        }
        this.attack();
    }

    protected long lastTimeAttack;

    @Override
    public void attack() {
        if (Util.canDoWithTime(this.lastTimeAttack, 100) && this.typePk == ConstPlayer.PK_ALL) {
            this.lastTimeAttack = System.currentTimeMillis();
            try {
                Player pl = getPlayerAttack();
                if (pl == null || pl.isDie()) {
                    return;
                }
                this.playerSkill.skillSelect = this.playerSkill.skills.get(Util.nextInt(0, this.playerSkill.skills.size() - 1));
                if (Util.getDistance(this, pl) <= this.getRangeCanAttackWithSkillSelect()) {
                    if (Util.isTrue(5, 20)) {
                        if (SkillUtil.isUseSkillChuong(this)) {
                            this.moveTo(pl.location.x + (Util.getOne(-1, 1) * Util.nextInt(20, 200)),
                                    Util.nextInt(10) % 2 == 0 ? pl.location.y : pl.location.y - Util.nextInt(0, 70));
                        } else {
                            this.moveTo(pl.location.x + (Util.getOne(-1, 1) * Util.nextInt(10, 40)),
                                    Util.nextInt(10) % 2 == 0 ? pl.location.y : pl.location.y - Util.nextInt(0, 50));
                        }
                    }
                    SkillService.gI().useSkill(this, pl, null, null);
                    checkPlayerDie(pl);
                } else {
                    if (Util.isTrue(1, 2)) {
                        this.moveToPlayer(pl);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("loi ne    22    ClassCastException ");
            }
        }
    }

    @Override
    public void checkPlayerDie(Player player) {
        if (player.isDie()) {
            this.chat("Chừa nha con!!!");
        }
    }

    protected int getRangeCanAttackWithSkillSelect() {
        int skillId = this.playerSkill.skillSelect.template.id;
        if (skillId == Skill.KAMEJOKO || skillId == Skill.MASENKO || skillId == Skill.ANTOMIC) {
            return Skill.RANGE_ATTACK_CHIEU_CHUONG;
        } else if (skillId == Skill.DRAGON || skillId == Skill.DEMON || skillId == Skill.GALICK) {
            return Skill.RANGE_ATTACK_CHIEU_DAM;
        }
        return 752002;
    }

    @Override
    public void die(Player plKill) {

        if (plKill != null
                && (this.zone.map.mapId != 140 || !MapService.gI().isMapMaBu(this.zone.map.mapId)
                || !MapService.gI().isMapDoanhTrai(this.zone.map.mapId)
                || !MapService.gI().isMapKhiGas(this.zone.map.mapId)
                || !MapService.gI().isMapBanDoKhoBau(this.zone.map.mapId)
                || !MapService.gI().isMapBlackBallWar(this.zone.map.mapId) || !(this instanceof MiNuong)
                || !(this instanceof AnTrom))) {
            reward(plKill);
            ServerNotify.gI().notify(plKill.name + " vừa tiêu diệt được " + this.name + ", ghê chưa ghê chưa..");
            this.changeStatus(BossStatus.DIE);
        } else {
            if (plKill != null) {
                reward(plKill);
            }
            this.changeStatus(BossStatus.DIE);
        }

        // New logic for Super Broly
        if (this instanceof com.girlkun.models.boss.list_boss.Broly.SuperBroly) {
            if (plKill != null && plKill.pet == null) {
                PetService.gI().createNormalPet(plKill);
                Service.getInstance().sendThongBao(plKill, "Bạn vừa nhận được đệ tử từ Super Broly!");
            }
        }
    }

    @Override
    public void reward(Player plKill) {
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
    }

    @Override
    public boolean chatE() {
        if (Util.canDoWithTime(lastTimeChatE, timeChatE)) {
            if (this.indexChatE == this.data[this.currentLevel].textChat3.length) {
                return true;
            }
            String textChat = this.data[this.currentLevel].textChat3[this.indexChatE];
            int prefix = Integer.parseInt(textChat.substring(1, textChat.lastIndexOf("|")));
            textChat = textChat.substring(textChat.lastIndexOf("|") + 1);
            if (!this.chat(prefix, textChat)) {
                return false;
            }
            this.lastTimeChatE = System.currentTimeMillis();
            this.timeChatE = textChat.length() * 100;
            if (this.timeChatE > 2000) {
                this.timeChatE = 2000;
            }
            this.indexChatE++;
        }
        return false;
    }

    @Override
    public void doneChatE() {

    }

    @Override
    public void leaveMap() {
        if (this.currentLevel < this.data.length - 1) {
            this.lastZone = this.zone;
            this.changeStatus(BossStatus.RESPAWN);
        } else {
            if (this.id != BossID.SOI_HEC_QUYN && this.id != BossID.O_DO && this.id != BossID.CHA_PA && this.id != BossID.CHAN_XU
                    && this.id != BossID.JACKY_CHUN && this.id != BossID.LIU_LIU && this.id != BossID.PON_PUT
                    && this.id != BossID.TAU_PAY_PAY && this.id != BossID.THIEN_XIN_HANG
                    && this.id != BossID.THIEN_XIN_HANG_CLONE
                    && this.id != BossID.THIEN_XIN_HANG_CLONE1 && this.id != BossID.THIEN_XIN_HANG_CLONE2 && this.id != BossID.THIEN_XIN_HANG_CLONE3
                    && this.id != BossID.XINBATO && this.id != BossID.YAMCHA) {
                ChangeMapService.gI().spaceShipArrive(this, (byte) 2, ChangeMapService.DEFAULT_SPACE_SHIP);
            }
            ChangeMapService.gI().exitMap(this);
            this.lastZone = null;
            this.lastTimeRest = System.currentTimeMillis();
            this.changeStatus(BossStatus.REST);
            this.preSpawnNotified = false; // Reset for next respawn cycle
        }
        this.wakeupAnotherBossWhenDisappear();
    }
    //end loop
//    public void leaveMapDHVT() {
//        if (this.currentLevel < this.data.length - 1) {
//            this.lastZone = this.zone;
//            this.changeStatus(BossStatus.RESPAWN);
//        } else {
////            ChangeMapService.gI().spaceShipArrive(this, (byte) 2, ChangeMapService.DEFAULT_SPACE_SHIP);
//            ChangeMapService.gI().exitMap(this);
//            this.lastZone = null;
//            this.lastTimeRest = System.currentTimeMillis();
//            this.changeStatus(BossStatus.REST);
//        }
//        this.wakeupAnotherBossWhenDisappear();
//    }

    @Override
    public double injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack) {
        if (!this.isDie()) {
            if (!piercing && Util.isTrue(this.nPoint.tlNeDon - plAtt.nPoint.tlchinhxac, 1000)) {
                this.chat("Xí hụt");
                return 0;
            }
            damage = this.nPoint.subDameInjureWithDeff(damage);
            if (!piercing && effectSkill.isShielding) {
                if (damage > nPoint.hpMax) {
                    EffectSkillService.gI().breakShield(this);
                }
                damage = 1;
            }
            this.nPoint.subHP(damage);
            if (isDie()) {
                this.setDie(plAtt);
                die(plAtt);
            }
            return damage;
        } else {
            return 0;
        }
    }

    @Override
    public void moveToPlayer(Player player) {
        this.moveTo(player.location.x, player.location.y);
    }

    @Override
    public void moveTo(int x, int y) {
        byte dir = (byte) (this.location.x - x < 0 ? 1 : -1);
        byte move = (byte) Util.nextInt(40, 60);
        PlayerService.gI().playerMove(this, this.location.x + (dir == 1 ? move : -move), y + (Util.isTrue(3, 10) ? -50 : 0));
    }

    public void chat(String text) {
        Service.getInstance().chat(this, text);
    }

    protected boolean chat(int prefix, String textChat) {
        if (prefix == -1) {
            this.chat(textChat);
        } else if (prefix == -2) {
            if (this.zone == null) {
                return false;
            }
            Player plMap = this.zone.getRandomPlayerInMap();
            if (plMap != null && !plMap.isDie() && Util.getDistance(this, plMap) <= 600) {
                Service.getInstance().chat(plMap, textChat);
            } else {
                return false;
            }
        } else if (prefix == -3) {
            if (this.parentBoss != null && !this.parentBoss.isDie()) {
                this.parentBoss.chat(textChat);
            }
        } else if (prefix >= 0) {
            if (this.bossAppearTogether != null && this.bossAppearTogether[this.currentLevel] != null) {
                Boss boss = this.bossAppearTogether[this.currentLevel][prefix];
                if (!boss.isDie()) {
                    boss.chat(textChat);
                }
            } else if (this.parentBoss != null && this.parentBoss.bossAppearTogether != null
                    && this.parentBoss.bossAppearTogether[this.parentBoss.currentLevel] != null) {
                Boss boss = this.parentBoss.bossAppearTogether[this.parentBoss.currentLevel][prefix];
                if (!boss.isDie()) {
                    boss.chat(textChat);
                }
            }
        }
        return true;
    }

    @Override
    public void wakeupAnotherBossWhenAppear() {
//        if (!(this instanceof AnTrom)
//                && !(this instanceof MiNuong)) {
//            System.out.println(this.name + ":" + this.zone.map.mapName + " khu vực " + this.zone.zoneId + "(" + this.zone.map.mapId + ")");
//        }
        if (!MapService.gI().isMapMaBu(this.zone.map.mapId)
                && !MapService.gI().isMapBlackBallWar(this.zone.map.mapId)
                && !(this instanceof AnTrom)
                && !(this instanceof MiNuong)) {
            System.out.println("BOSS  " + this.name + "  :  " + this.zone.map.mapName + " khu vực " + this.zone.zoneId + "(" + this.zone.map.mapId + ")");
        }
        if (this.bossAppearTogether == null || this.bossAppearTogether[this.currentLevel] == null) {
            return;
        }
        for (Boss boss : this.bossAppearTogether[this.currentLevel]) {
            int nextLevelBoss = boss.currentLevel + 1;
            if (nextLevelBoss >= boss.data.length) {
                nextLevelBoss = 0;
            }
            if (boss.data[nextLevelBoss].getTypeAppear() == (byte) TypeAppear.CALL_BY_ANOTHER.ordinal()) {
                if (boss.zone != null) {
                    boss.leaveMap();
                }
            }
            if (boss.data[nextLevelBoss].getTypeAppear() == (byte) TypeAppear.APPEAR_WITH_ANOTHER.ordinal()) {
                if (boss.zone != null) {
                    boss.leaveMap();
                }
                boss.changeStatus(BossStatus.RESPAWN);
            }
        }
    }

    @Override
    public void wakeupAnotherBossWhenDisappear() {
//        System.out.println("wake up boss when disappear");
//        System.out.println("Boss " + this.name + " die.......");
    }

}

/**
 * Code được viết bởi Hoàng Việt Vui lòng không sao chép mã nguồn này dưới mọi
 * hình thức.
 */
