package com.girlkun.models.npc;

import com.girlkun.consts.ConstMap;
import com.girlkun.models.boss.list_boss.nappa.Kuku;
import com.girlkun.server.ServerManager;
import com.girlkun.server.io.MySession;
import com.girlkun.models.map.challenge.MartialCongressService;
import com.girlkun.services.*;
import com.girlkun.consts.ConstNpc;
import com.girlkun.consts.ConstPlayer;
import com.girlkun.consts.ConstTask;
import com.girlkun.models.map.bdkb.BanDoKhoBau;
import com.girlkun.models.map.bdkb.BanDoKhoBauService;
import com.girlkun.database.GirlkunDB;
import com.girlkun.jdbc.daos.PlayerDAO;
import com.girlkun.models.boss.Boss;
import com.girlkun.models.boss.BossData;
import com.girlkun.models.boss.BossID;
import com.girlkun.models.boss.BossManager;
import com.girlkun.models.boss.list_boss.MiNuong;
import com.girlkun.models.boss.list_boss.NhanBan;
import com.girlkun.models.clan.Clan;
import com.girlkun.models.clan.ClanMember;
import com.girlkun.models.player.Thu_TrieuHoi;

import java.util.HashMap;
import java.util.List;

import com.girlkun.services.func.ChangeMapService;
import com.girlkun.services.func.SummonDragon;

import static com.girlkun.services.func.SummonDragon.SHENRON_1_STAR_WISHES_1;
import static com.girlkun.services.func.SummonDragon.SHENRON_1_STAR_WISHES_2;
import static com.girlkun.services.func.SummonDragon.SHENRON_2_STARS_WHISHES;
import static com.girlkun.services.func.SummonDragon.SHENRON_SAY;

import com.girlkun.models.player.Player;
import com.girlkun.models.item.Item;
import com.girlkun.models.item.Item.ItemOption;
import com.girlkun.models.kygui.ShopKyGuiService;
import com.girlkun.models.map.Map;
import com.girlkun.models.map.Zone;
import com.girlkun.models.map.blackball.BlackBallWar;
import com.girlkun.models.map.MapMaBu.MapMaBu;
import com.girlkun.models.map.doanhtrai.DoanhTrai;
import com.girlkun.models.map.doanhtrai.DoanhTraiService;
import com.girlkun.models.map.gas.Gas;
import com.girlkun.models.map.gas.GasService;
import com.girlkun.models.player.Inventory;
import com.girlkun.models.player.NPoint;
import com.girlkun.models.matches.PVPService;
import com.girlkun.models.matches.pvp.DaiHoiVoThuat;
import com.girlkun.models.matches.pvp.DaiHoiVoThuatService;
import com.girlkun.models.mob.Mob;
import com.girlkun.models.shop.ShopServiceNew;
import com.girlkun.models.skill.Skill;
import com.girlkun.network.io.Message;
import com.girlkun.server.Client;
import com.girlkun.server.Maintenance;
import com.girlkun.server.Manager;
import static com.girlkun.services.NgocRongNamecService.TIME_OP;
import com.girlkun.services.func.CombineServiceNew;
import com.girlkun.services.func.Input;
import com.girlkun.services.func.LuckyRound;
//import com.girlkun.services.func.TopService;
import com.girlkun.utils.Logger;
import com.girlkun.utils.TimeUtil;
import com.girlkun.utils.Util;
import java.util.ArrayList;
import com.girlkun.services.func.ChonAiDay;
import com.girlkun.services.func.GoiRongXuong;
import static com.girlkun.services.func.GoiRongXuong.HALLOWEN_1_STAR_WISHES_1;
//import static com.girlkun.services.func.GoiRongXuong.HALLOWEN_1_STAR_WISHES_2;
import static com.girlkun.services.func.GoiRongXuong.HALLOWEN_SAY;
import com.girlkun.services.func.TaiXiu;
import com.girlkun.utils.SkillUtil;
import java.util.Random;
//import static com.girlkun.utils.SkillUtil.getSkillbyId;
//import java.util.Timer;
//import java.util.TimerTask;
//import java.util.logging.Level;

public class NpcFactory {

    private static final int COST_HD = 50000000;

    private static boolean nhanVang = false;
    private static boolean nhanDeTu = false;

    //playerid - object
    public static final java.util.Map<Long, Object> PLAYERID_OBJECT = new HashMap<Long, Object>();

    private NpcFactory() {

    }

    private static Npc trungLinhThu(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 104 || this.mapId == 5) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Đổi Trứng Linh thú cần:\b|7|X99 Hồn Linh Thú + 1 Tỷ vàng", "Đổi Trứng\nLinh thú", "Từ chối");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 104 || this.mapId == 5) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0: {
                                    Item honLinhThu = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 2029);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu.quantity < 99) {
                                        this.npcChat(player, "Bạn không đủ 99 Hồn Linh thú");
                                    } else if (player.inventory.gold < 1_000_000_000) {
                                        this.npcChat(player, "Bạn không đủ 1 Tỷ vàng");
                                    } else if (InventoryServiceNew.gI().getCountEmptyBag(player) == 0) {
                                        this.npcChat(player, "Hành trang của bạn không đủ chỗ trống");
                                    } else {
                                        player.inventory.gold -= 1_000_000_000;
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 99);
                                        Service.getInstance().sendMoney(player);
                                        Item trungLinhThu = ItemService.gI().createNewItem((short) 2028);
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "Bạn nhận được 1 Trứng Linh thú");
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    private static Npc popo(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
//                    if (player.clanMember.getNumDateFromJoinTimeToToday() < 1) {
//                        createOtherMenu(player, ConstNpc.IGNORE_MENU,
//                                "|7|KHÍ GAS\n|6|Map Khí Gas chỉ cho phép những người ở trong bang trên 1 ngày. Hẹn ngươi quay lại vào lúc khác",
//                                "OK", "Hướng\ndẫn\nthêm");
//                        return;
//                    }
                    if (player.clan == null) {
                        createOtherMenu(player, ConstNpc.IGNORE_MENU,
                                "|7|KHÍ GAS\n|6|Map Khí Gas chỉ dành cho những người có bang hội",
                                "OK", "Hướng\ndẫn\nthêm");
                        return;
                    }
                    if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {
                        if (player.getSession().is_gift_box) {
//                            this.createOtherMenu(player, ConstNpc.BASE_MENU, "|7|KHÍ GAS\n|6|Chào con, con muốn ta giúp gì nào?", "Giải tán bang hội", "Nhận quà\nđền bù");
                        } else {
                            this.createOtherMenu(player, ConstNpc.BASE_MENU, "|7|KHÍ GAS\n|6|Thượng đế vừa phát hiện 1 loại khí đang âm thầm\nhủy diệt mọi mầm sống trên Trái Đất,\nnó được gọi là Destron Gas.\nTa sẽ đưa các cậu đến nơi ấy, các cậu sẵn sàng chưa?", "Thông Tin Chi Tiết", "OK", " Bố Từ Chối");
                        }
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.isBaseMenu()) {
                        switch (select) {
                            case 1:
                                if (player.clan != null) {
                                    if (player.clan.khiGas != null) {
                                        this.createOtherMenu(player, ConstNpc.MENU_OPENED_GAS,
                                                "|7|KHÍ GAS\n|6|Bang hội của con đang đi DesTroy Gas cấp độ "
                                                + player.clan.khiGas.level + "\nCon có muốn đi theo không?",
                                                "Đồng ý", "Từ chối");
                                    } else {
                                        this.createOtherMenu(player, ConstNpc.MENU_OPEN_GAS,
                                                "|7|KHÍ GAS\n|6|Khí Gas Huỷ Diệt đã chuẩn bị tiếp nhận các đợt tấn công của quái vật\n"
                                                + "các con hãy giúp chúng ta tiêu diệt quái vật \n"
                                                + "Ở đây có ta lo\nNhớ chọn cấp độ vừa sức mình nhé",
                                                "Chọn\ncấp độ", "Từ chối");
                                    }
                                } else {
                                    this.npcChat(player, "Con phải có bang hội ta mới có thể cho con đi");
                                }
                                break;
//                            case 2:
//                                Clan clan = player.clan;
//                                if (clan != null) {
//                                    ClanMember cm = clan.getClanMember((int) player.id);
//                                    if (cm != null) {
//                                        if (clan.members.size() > 1) {
//                                            Service.gI().sendThongBao(player, "Bang phải còn một người");
//                                            break;
//                                        }
//                                        if (!clan.isLeader(player)) {
//                                            Service.gI().sendThongBao(player, "Phải là bảng chủ");
//                                            break;
//                                        }
////                                        
//                                        NpcService.gI().createMenuConMeo(player, ConstNpc.CONFIRM_DISSOLUTION_CLAN, -1, "|7|KHÍ GAS\n|6|Con có chắc chắn muốn giải tán bang hội không? Ta cho con 2 lựa chọn...",
//                                                "Yes you do!", "Từ chối!");
//                                    }
//                                    break;
//                                }
//                                Service.gI().sendThongBao(player, "Có bang hội đâu ba!!!");
//                                break;
                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_OPENED_GAS) {
                        switch (select) {
                            case 0:
                                if (player.isAdmin() || player.nPoint.power >= Gas.POWER_CAN_GO_TO_GAS) {
                                    ChangeMapService.gI().goToGas(player);
                                } else {
                                    this.npcChat(player, "Sức mạnh của con phải ít nhất phải đạt "
                                            + Util.numberToMoney(Gas.POWER_CAN_GO_TO_GAS));
                                }
                                break;

                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_OPEN_GAS) {
                        switch (select) {
                            case 0:
                                if (player.isAdmin() || player.nPoint.power >= Gas.POWER_CAN_GO_TO_GAS) {
                                    Input.gI().createFormChooseLevelGas(player);
                                } else {
                                    this.npcChat(player, "Sức mạnh của con phải ít nhất phải đạt "
                                            + Util.numberToMoney(Gas.POWER_CAN_GO_TO_GAS));
                                }
                                break;
                        }

                    } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_ACCPET_GO_TO_GAS) {
                        switch (select) {
                            case 0:
//                                 this.npcChat(player, "Chức năng đang bảo trì ");
                                if (player.chienthan.tasknow == 7) {
                                    player.chienthan.dalamduoc++;
                                }
                                GasService.gI().openKhiGas(player, Byte.parseByte(String.valueOf(PLAYERID_OBJECT.get(player.id))));
                                break;
                        }
                    }
                }
            }
        };
    }

    private static Npc Skien_trungthu(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    this.createOtherMenu(player, ConstNpc.BASE_MENU, "|7| SỰ KIỆN TRUNG THU"
                            + "\n\n|2|Nguyên liệu cần nấu bánh Trung thu"
                            + "\n|-1|- Bánh Hạt sen : 99 Hạt sen + 50 Bột nếp + 2 Mồi lửa"
                            + "\n|-1|- Bánh Đậu xanh : 99 Đậu xanh + 50 Bột nếp + 2 Mồi lửa"
                            + "\n|-1|- Bánh Thập cẩm : 99 Hạt sen + 99 Đậu xanh + 99 Bột nếp + 5 Mồi lửa"
                            + "\n|7|Làm bánh sẽ tốn phí 2Ty Vàng/lần"
                            + "\n\n|1|Điểm sự kiện : " + Util.format(player.NguHanhSonPoint) + " Điểm",
                            "Thể lệ", "Làm bánh", "Đổi điểm\nTrung thu");
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.isBaseMenu()) {
                        switch (select) {
                            case 0: {
                                this.createOtherMenu(player, 1234,
                                        "|7|SỰ KIỆN TRUNG THU NRO TABI"
                                        + "\n\n|2|Cách thức tìm nguyên liệu nấu bánh Trung thu"
                                        + "\n|4|- Hạt sen : Đánh các quái bay trên không"
                                        + "\n- Đậu xanh : Đánh các quái dưới đất"
                                        + "\n- Bột nếp : Đánh quái Sên ở Tương lai"
                                        + "\n- Mồi lửa : Giết Boss Thỏ trắng (5 phút xuất hiện 1 lần)"
                                        + "\n\n|5|Ăn bánh trung thu nhận được Điểm tích lũy Sự kiện Trung thu đổi được các phần quà hấp dẫn"
                                        + "\n|-1|- Bánh Hạt sen : Nhận 2 Điểm Sự kiện"
                                        + "\n|-1|- Bánh Đậu xanh : Nhận 2 Điểm Sự kiện"
                                        + "\n|-1|- Bánh Thập cẩm : Nhận 5 Điểm Sự kiện"
                                        + "\n|5|- Quy đổi tiền 1.000Đ nhận thêm 1 Điểm Sự kiện (Không tính đổi Xu)"
                                        + "\n\n|7|Chị hiểu hôn ???",
                                        "Đã hiểu");
                                break;
                            }
                            case 1: {
                                this.createOtherMenu(player, 1111,
                                        "|7|SỰ KIỆN TRUNG THU TABI"
                                        + "\n\n|2|Bạn muốn làm bánh gì?",
                                        "Bánh\nHạt sen", "Bánh\nĐậu xanh", "Bánh\nThập cẩm");
                                break;
                            }
                            case 2: {
                                this.createOtherMenu(player, 2222,
                                        "|7|TÍCH ĐIỂM SỰ KIỆN TRUNG THU"
                                        + "\n\n|1|Khi đổi điểm thì sẽ được cộng điểm đua top trung thu\n"
                                        + "|2|Mốc 500 Điểm\n"
                                        + "|4|200 Mảnh thiên sứ ngẫu nhiên, 50 rương thần linh, 30 Hộp quà Trung thu, 30 Thẻ gia hạn, 1 Phiếu giảm giá + 250k HN \n"
                                        + "|2|Mốc 300 Điểm\n"
                                        + "|4|100 Mảnh thiên sứ ngẫu nhiên, 40 rương thần linh, 10 Thẻ gia hạn, 15 Hộp Trung thu + 150k HN \n"
                                        + "|2|Mốc 200 Điểm\n"
                                        + "|4|50 Mảnh thiên sứ ngẫu nhiên, 30 rương thần linh, 5 Thẻ gia hạn, 10 Hộp Trung thu + 100k HN \n"
                                        + "|2|Mốc 50 Điểm\n"
                                        + "|4|10 Mảnh thiên sứ ngẫu nhiên, 5 rương thần linh + 25k HN"
                                        + "\n\n|7|Điểm sự kiện : " + Util.format(player.NguHanhSonPoint) + " Điểm"
                                        + "\n|1|Điểm Top Trung thu : " + Util.format(player.inventory.coupon) + " Điểm",
                                        "500 Điểm", "300 Điểm", "200 Điểm", "50 Điểm");
                                break;
                            }
                        }
                    } else if (player.iDMark.getIndexMenu() == 1111) {
                        switch (select) {
                            case 0: {
                                Item hatsen = null;
                                Item botnep = null;
                                Item moilua = null;
                                try {
                                    hatsen = InventoryServiceNew.gI().findItemBag(player, 1340);
                                    botnep = InventoryServiceNew.gI().findItemBag(player, 1338);
                                    moilua = InventoryServiceNew.gI().findItemBag(player, 1341);
                                } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                }
                                if (hatsen == null || hatsen.quantity < 99) {
                                    this.npcChat(player, "|7|Bạn không đủ 99 Hạt sen");
                                } else if (botnep == null || botnep.quantity < 50) {
                                    this.npcChat(player, "|7|Bạn không đủ 50 Bột nếp");
                                } else if (moilua == null || moilua.quantity < 2) {
                                    this.npcChat(player, "|7|Bạn không đủ 2 Mồi lửa");
                                } else if (player.inventory.gold < 2_000_000_000) {
                                    this.npcChat(player, "|7|Bạn không đủ 2Ty Vàng");
                                } else if (InventoryServiceNew.gI().getCountEmptyBag(player) == 0) {
                                    this.npcChat(player, "|7|Hành trang của bạn không đủ chỗ trống");
                                } else {
                                    player.inventory.gold -= 2_000_000_000;
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, hatsen, 99);
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, botnep, 50);
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, moilua, 2);
                                    Service.getInstance().sendMoney(player);
                                    Item banhtrungthu = ItemService.gI().createNewItem((short) 1336);
                                    InventoryServiceNew.gI().addItemBag(player, banhtrungthu);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    this.npcChat(player, "|4|Bạn nhận được Bánh trung thu Hạt sen");
                                }
                                break;
                            }
                            case 1: {
                                Item dauxanh = null;
                                Item botnep = null;
                                Item moilua = null;
                                try {
                                    dauxanh = InventoryServiceNew.gI().findItemBag(player, 1339);
                                    botnep = InventoryServiceNew.gI().findItemBag(player, 1338);
                                    moilua = InventoryServiceNew.gI().findItemBag(player, 1341);
                                } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                }
                                if (dauxanh == null || dauxanh.quantity < 99) {
                                    this.npcChat(player, "|7|Bạn không đủ 99 Đậu xanh");
                                } else if (botnep == null || botnep.quantity < 50) {
                                    this.npcChat(player, "|7|Bạn không đủ 50 Bột nếp");
                                } else if (moilua == null || moilua.quantity < 2) {
                                    this.npcChat(player, "|7|Bạn không đủ 2 Mồi lửa");
                                } else if (player.inventory.gold < 2_000_000_000) {
                                    this.npcChat(player, "|7|Bạn không đủ 2Ty Vàng");
                                } else if (InventoryServiceNew.gI().getCountEmptyBag(player) == 0) {
                                    this.npcChat(player, "|7|Hành trang của bạn không đủ chỗ trống");
                                } else {
                                    player.inventory.gold -= 2_000_000_000;
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, dauxanh, 99);
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, botnep, 50);
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, moilua, 2);
                                    Service.getInstance().sendMoney(player);
                                    Item banhtrungthu = ItemService.gI().createNewItem((short) 1335);
                                    InventoryServiceNew.gI().addItemBag(player, banhtrungthu);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    this.npcChat(player, "|4|Bạn nhận được Bánh trung thu Đậu xanh");
                                }
                                break;
                            }
                            case 2: {
                                Item hatsen = null;
                                Item dauxanh = null;
                                Item botnep = null;
                                Item moilua = null;
                                try {
                                    hatsen = InventoryServiceNew.gI().findItemBag(player, 1340);
                                    dauxanh = InventoryServiceNew.gI().findItemBag(player, 1339);
                                    botnep = InventoryServiceNew.gI().findItemBag(player, 1338);
                                    moilua = InventoryServiceNew.gI().findItemBag(player, 1341);
                                } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                }
                                if (hatsen == null || hatsen.quantity < 99) {
                                    this.npcChat(player, "|7|Bạn không đủ 99 Hạt sen");
                                } else if (botnep == null || botnep.quantity < 99) {
                                    this.npcChat(player, "|7|Bạn không đủ 99 Bột nếp");
                                } else if (dauxanh == null || dauxanh.quantity < 99) {
                                    this.npcChat(player, "|7|Bạn không đủ 99 Đậu xanh");
                                } else if (moilua == null || moilua.quantity < 5) {
                                    this.npcChat(player, "|7|Bạn không đủ 5 Mồi lửa");
                                } else if (player.inventory.gold < 2_000_000_000) {
                                    this.npcChat(player, "|7|Bạn không đủ 2Ty Vàng");
                                } else if (InventoryServiceNew.gI().getCountEmptyBag(player) == 0) {
                                    this.npcChat(player, "|7|Hành trang của bạn không đủ chỗ trống");
                                } else {
                                    player.inventory.gold -= 2_000_000_000;
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, hatsen, 99);
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, dauxanh, 99);
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, botnep, 99);
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, moilua, 5);
                                    Service.getInstance().sendMoney(player);
                                    Item banhtrungthu = ItemService.gI().createNewItem((short) 1337);
                                    InventoryServiceNew.gI().addItemBag(player, banhtrungthu);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    this.npcChat(player, "|4|Bạn nhận được Bánh trung thu Thập cẩm");
                                }
                                break;
                            }
                        }
                    } else if (player.iDMark.getIndexMenu() == 2222) {
                        switch (select) {
                            case 0: {
                                byte randommanh = (byte) new Random().nextInt(Manager.itemManh.length);
                                int manh = Manager.itemManh[randommanh];
                                if (player.NguHanhSonPoint < 500) {
                                    this.npcChat(player, "|7|Bạn không đủ 500 Điểm sự kiện");
                                } else if (InventoryServiceNew.gI().getCountEmptyBag(player) < 5) {
                                    this.npcChat(player, "|7|Hành trang của bạn cần ít nhất 5 ô trống");
                                } else {
                                    player.NguHanhSonPoint -= 500;
                                    player.inventory.coupon += 500;
                                    player.inventory.ruby += 250_000;
                                    Service.getInstance().sendMoney(player);
                                    Item manhthiensu = ItemService.gI().createNewItem((short) manh);
                                    Item ruongthan = ItemService.gI().createNewItem((short) 1334);
                                    Item hoptt = ItemService.gI().createNewItem((short) 1342);
                                    Item phieugg = ItemService.gI().createNewItem((short) 459);
                                    Item thegh = ItemService.gI().createNewItem((short) 1346);
                                    phieugg.itemOptions.add(new Item.ItemOption(30, 1));
                                    manhthiensu.quantity = 200;
                                    ruongthan.quantity = 50;
                                    hoptt.quantity = 30;
                                    thegh.quantity = 30;
                                    InventoryServiceNew.gI().addItemBag(player, manhthiensu);
                                    InventoryServiceNew.gI().addItemBag(player, ruongthan);
                                    InventoryServiceNew.gI().addItemBag(player, hoptt);
                                    InventoryServiceNew.gI().addItemBag(player, phieugg);
                                    InventoryServiceNew.gI().addItemBag(player, thegh);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    this.npcChat(player, "|4|Bạn nhận được 200 " + manhthiensu.template.name
                                            + ", 50 Rương thần linh, 30 Hộp Trung thu, 30 Thẻ gia hạn, 1 Phiếu giảm giá và 250k Hồng ngọc");
                                }
                                break;
                            }
                            case 1: {
                                byte randommanh = (byte) new Random().nextInt(Manager.itemManh.length);
                                int manh = Manager.itemManh[randommanh];
                                if (player.NguHanhSonPoint < 300) {
                                    this.npcChat(player, "|7|Bạn không đủ 300 Điểm sự kiện");
                                } else if (InventoryServiceNew.gI().getCountEmptyBag(player) < 4) {
                                    this.npcChat(player, "|7|Hành trang của bạn cần ít nhất 4 ô trống");
                                } else {
                                    player.NguHanhSonPoint -= 300;
                                    player.inventory.coupon += 300;
                                    player.inventory.ruby += 150_000;
                                    Service.getInstance().sendMoney(player);
                                    Item manhthiensu = ItemService.gI().createNewItem((short) manh);
                                    Item ruongthan = ItemService.gI().createNewItem((short) 1334);
                                    Item hoptt = ItemService.gI().createNewItem((short) 1342);
                                    Item thegh = ItemService.gI().createNewItem((short) 1346);
                                    manhthiensu.quantity = 100;
                                    ruongthan.quantity = 40;
                                    hoptt.quantity = 15;
                                    thegh.quantity = 10;
                                    InventoryServiceNew.gI().addItemBag(player, manhthiensu);
                                    InventoryServiceNew.gI().addItemBag(player, ruongthan);
                                    InventoryServiceNew.gI().addItemBag(player, hoptt);
                                    InventoryServiceNew.gI().addItemBag(player, thegh);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    this.npcChat(player, "|4|Bạn nhận được 100 " + manhthiensu.template.name
                                            + ", 40 Rương thần linh, 15 Hộp Trung thu, 10 Thẻ gia hạn và 150k Hồng ngọc");
                                }
                                break;
                            }
                            case 2: {
                                byte randommanh = (byte) new Random().nextInt(Manager.itemManh.length);
                                int manh = Manager.itemManh[randommanh];
                                if (player.NguHanhSonPoint < 200) {
                                    this.npcChat(player, "|7|Bạn không đủ 200 Điểm sự kiện");
                                } else if (InventoryServiceNew.gI().getCountEmptyBag(player) < 4) {
                                    this.npcChat(player, "|7|Hành trang của bạn cần ít nhất 4 ô trống");
                                } else {
                                    player.NguHanhSonPoint -= 200;
                                    player.inventory.coupon += 200;
                                    player.inventory.ruby += 100_000;
                                    Service.getInstance().sendMoney(player);
                                    Item manhthiensu = ItemService.gI().createNewItem((short) manh);
                                    Item ruongthan = ItemService.gI().createNewItem((short) 1334);
                                    Item hoptt = ItemService.gI().createNewItem((short) 1342);
                                    Item thegh = ItemService.gI().createNewItem((short) 1346);
                                    manhthiensu.quantity = 50;
                                    ruongthan.quantity = 30;
                                    hoptt.quantity = 10;
                                    thegh.quantity = 5;
                                    InventoryServiceNew.gI().addItemBag(player, manhthiensu);
                                    InventoryServiceNew.gI().addItemBag(player, ruongthan);
                                    InventoryServiceNew.gI().addItemBag(player, hoptt);
                                    InventoryServiceNew.gI().addItemBag(player, thegh);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    this.npcChat(player, "|4|Bạn nhận được 50 " + manhthiensu.template.name
                                            + ", 30 Rương thần linh, 10 Hộp Trung thu, 5 Thẻ gia hạn và 100k Hồng ngọc");
                                }
                                break;
                            }
                            case 3: {
                                byte randommanh = (byte) new Random().nextInt(Manager.itemManh.length);
                                int manh = Manager.itemManh[randommanh];
                                if (player.NguHanhSonPoint < 50) {
                                    this.npcChat(player, "|7|Bạn không đủ 50 Điểm sự kiện");
                                } else if (InventoryServiceNew.gI().getCountEmptyBag(player) < 2) {
                                    this.npcChat(player, "|7|Hành trang của bạn cần ít nhất 2 ô trống");
                                } else {
                                    player.NguHanhSonPoint -= 50;
                                    player.inventory.coupon += 50;
                                    player.inventory.ruby += 25_000;
                                    Service.getInstance().sendMoney(player);
                                    Item manhthiensu = ItemService.gI().createNewItem((short) manh);
                                    Item ruongthan = ItemService.gI().createNewItem((short) 1334);
                                    manhthiensu.quantity = 10;
                                    ruongthan.quantity = 5;
                                    InventoryServiceNew.gI().addItemBag(player, manhthiensu);
                                    InventoryServiceNew.gI().addItemBag(player, ruongthan);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    this.npcChat(player, "|4|Bạn nhận được 10 " + manhthiensu.template.name
                                            + ", 5 Rương thần linh và 25k Hồng ngọc");
                                }
                                break;
                            }
                        }
                    }
                }
            }
        };
    }

    private static Npc npcuub(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 104) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "|7| NHẬN PET"
                                + "\n\n|2|Đổi Vòng kim cô Mở ra PET cần:"
                                + "\n|5|X99 Thăng linh thạch + 10 Thỏi vàng"
                                + "\b\b|3|Khi sử dụng Vòng kim cô sẽ nhận được Pet Ngẫu nhiên với các dòng chỉ số random như sau"
                                + "\n|4|SD : 10-25%"
                                + "\nHP,KI : 15-30%"
                                + "\nHồi HP,KI/30s : 3-10%"
                                + "\n\n|7| Ngươi có chắc muốn đổi Vòng kim cô ??",
                                "Đổi Vòng\nkim cô", "Từ chối");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 104) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0: {
                                    Item honLinhThu = null;
                                    Item thoivang = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 2031);
                                        thoivang = InventoryServiceNew.gI().findItemBag(player, 457);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu.quantity < 99) {
                                        this.npcChat(player, "|7|Bạn không đủ 99 Thăng linh thạch");
                                        return;
                                    }
                                    if (thoivang == null || thoivang.quantity < 10) {
                                        this.npcChat(player, "|7|Bạn không đủ 10 Thỏi vàng");
                                        return;
                                    }
                                    if (InventoryServiceNew.gI().getCountEmptyBag(player) == 0) {
                                        this.npcChat(player, "|7|Hành trang của bạn không đủ chỗ trống");
                                        return;
                                    }
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 99);
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, thoivang, 10);
                                    Service.getInstance().sendMoney(player);
                                    Item trungLinhThu = ItemService.gI().createNewItem((short) 543);
                                    trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                    InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    this.npcChat(player, "|1|Bạn nhận được 1 Vòng kim cô");
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    private static Npc fide(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 104 || this.mapId == 5) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Đổi Trứng con cua cần:\b|7|X1 Lọ nước phép + 1 Tỷ vàng", "Đổi con\ncua", "Từ chối");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 104 || this.mapId == 5) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0: {
                                    Item honLinhThu = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 1029);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu.quantity < 1) {
                                        this.npcChat(player, "Bạn không đủ 1 Lọ nước phép");
                                    } else if (player.inventory.gold < 1_000_000_000) {
                                        this.npcChat(player, "Bạn không đủ 1 Tỷ vàng");
                                    } else if (InventoryServiceNew.gI().getCountEmptyBag(player) == 0) {
                                        this.npcChat(player, "Hành trang của bạn không đủ chỗ trống");
                                    } else {
                                        player.inventory.gold -= 1_000_000_000;
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 1);
                                        Service.getInstance().sendMoney(player);
                                        Item trungLinhThu = ItemService.gI().createNewItem((short) 697);
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "Bạn nhận được 1 con cua");
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc thodaika(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    createOtherMenu(player, ConstNpc.BASE_MENU,
                            "Đưa cho ta thỏi vàng và ngươi sẽ giúp ngươi làm giàu\nCá cược Tài Xỉu không bao giờ chán!!!\b|7|Thắng ngươi sẽ được x1.8 lần số Hồng ngọc cược\nThua thì còn cái nịt haha\b|5| Điều kiện được tham gia: Nhiệm vụ 24 trở lên\b|4|(Cược tối thiểu 10.000 Hồng ngọc)",
                            "Xỉu", "Tài");
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 5) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_24_0) {
                                        Input.gI().XIU(player);
                                    } else {
                                        Service.getInstance().sendThongBao(player, "Bạn chưa đủ điều kiện để chơi");
                                    }
                                    break;
                                case 1:
                                    if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_24_0) {
                                        Input.gI().TAI(player);
                                    } else {
                                        Service.getInstance().sendThongBao(player, "Bạn chưa đủ điều kiện để chơi");
                                    }
                                    break;

                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc GhiDanh(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            String[] menuselect = new String[]{};

            @Override
            public void openBaseMenu(Player pl) {
                if (canOpenNpc(pl)) {
                    if (this.mapId == 52) {
                        createOtherMenu(pl, 0, DaiHoiVoThuatService.gI(DaiHoiVoThuat.gI().getDaiHoiNow()).Giai(pl), "Thông tin\nChi tiết", DaiHoiVoThuatService.gI(DaiHoiVoThuat.gI().getDaiHoiNow()).CanReg(pl) ? "Đăng ký" : "OK", "Đại Hội\nVõ Thuật\nLần thứ\n23");
                    } else if (this.mapId == 129) {
//                        int goldchallenge = pl.goldChallenge;
                        if (pl.levelWoodChest == 0) {
                            menuselect = new String[]{"Thi đấu\n" + 200 + " Hồng ngọc", "Về\nĐại Hội\nVõ Thuật"};
                        } else {
                            menuselect = new String[]{"Thi đấu\n" + 200 + " Hồng ngọc", "Nhận thưởng\nRương cấp\n" + pl.levelWoodChest, "Về\nĐại Hội\nVõ Thuật"};
                        }
                        this.createOtherMenu(pl, ConstNpc.BASE_MENU, "Đại hội võ thuật lần thứ 23\nDiễn ra bất kể ngày đêm,ngày nghỉ ngày lễ\nPhần thưởng vô cùng quý giá\nNhanh chóng tham gia nào", menuselect, "Từ chối");

                    } else {
                        super.openBaseMenu(pl);
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 52) {
                        switch (select) {
                            case 0:
                                Service.gI().sendPopUpMultiLine(player, tempId, avartar, DaiHoiVoThuat.gI().Info());
                                break;
                            case 1:
                                if (DaiHoiVoThuatService.gI(DaiHoiVoThuat.gI().getDaiHoiNow()).CanReg(player)) {
                                    DaiHoiVoThuatService.gI(DaiHoiVoThuat.gI().getDaiHoiNow()).Reg(player);
                                }
                                break;
                            case 2:

//                                Service.getInstance().sendThongBao(player, "Chức năng đang bảo trì");
                                ChangeMapService.gI().changeMapNonSpaceship(player, 129, player.location.x, 360);
                                break;
                        }
                    } else if (this.mapId == 129) {
//                            int goldchallenge = player.goldChallenge;
                        if (player.levelWoodChest == 0) {
                            switch (select) {
                                case 0:
//                                        if (MartialCongressService.gI().check == false){
                                    if (InventoryServiceNew.gI().finditemWoodChest(player)) {
                                        if (player.inventory.ruby >= 200) {
                                            MartialCongressService.gI().startChallenge(player);
//                                            Service.getInstance().sendThongBao(player, "Chức năng đang bảo trì");
                                        } else {
                                            Service.getInstance().sendThongBao(player, "Không đủ hồng ngọc, còn thiếu " + Util.numberToMoney(200 - player.inventory.ruby) + " Hồng ngọc");
                                        }
                                    } else {
                                        Service.getInstance().sendThongBao(player, "Hãy mở rương báu vật trước");
                                    }
//                                        } else {
//                                            Service.getInstance().sendThongBao(player, "Vui lòng chờ lượt sau");
//                                        }
                                    break;
                                case 1:
                                    ChangeMapService.gI().changeMapNonSpaceship(player, 52, player.location.x, 336);
                                    break;
                            }
                        } else {
                            switch (select) {
                                case 0:
//                                        if (MartialCongressService.gI().check == false){
                                    if (InventoryServiceNew.gI().finditemWoodChest(player)) {
                                        if (player.inventory.ruby >= 200) {
//                                            Service.getInstance().sendThongBao(player, "Chức năng đang bảo trì");
                                            MartialCongressService.gI().startChallenge(player);
                                            player.goldChallenge += 200;
                                        } else {
                                            Service.getInstance().sendThongBao(player, "Không đủ vàng, còn thiếu " + Util.numberToMoney(200 - player.inventory.ruby) + " vàng");
                                        }
                                    } else {
                                        Service.getInstance().sendThongBao(player, "Hãy mở rương báu vật trước");
                                    }
//                                        } else {
//                                            Service.getInstance().sendThongBao(player, "Vui lòng chờ lượt sau");
//                                        }
                                    break;
                                case 1:
                                    if (!player.receivedWoodChest) {
                                        if (InventoryServiceNew.gI().getCountEmptyBag(player) > 0) {
                                            Item it = ItemService.gI().createNewItem((short) 570);
                                            it.itemOptions.add(new Item.ItemOption(72, player.levelWoodChest));
                                            it.itemOptions.add(new Item.ItemOption(30, 0));
                                            it.createTime = System.currentTimeMillis();
                                            InventoryServiceNew.gI().addItemBag(player, it);
                                            InventoryServiceNew.gI().sendItemBags(player);

                                            player.receivedWoodChest = true;
                                            player.levelWoodChest = 0;
                                            Service.getInstance().sendThongBao(player, "Bạn nhận được rương gỗ");
                                        } else {
                                            this.npcChat(player, "Hành trang đã đầy");
                                        }
                                    } else {
                                        Service.getInstance().sendThongBao(player, "Mỗi ngày chỉ có thể nhận rương báu 1 lần");
                                    }
                                    break;
                                case 2:
                                    ChangeMapService.gI().changeMapNonSpaceship(player, 52, player.location.x, 336);
                                    break;
                            }
                        }
                    }
                }
            }
        };
    }

    private static Npc monaito(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 104 || this.mapId == 5) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Đổi Lấy Đá Cầu Vòng:\b|7|X99 đá ngũ sắc + 1 Tỷ vàng", "Đổi Cầu\nVòng", "Từ chối");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 104 || this.mapId == 5) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0: {
                                    Item honLinhThu = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 674);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu.quantity < 99) {
                                        this.npcChat(player, "Bạn không đủ 99 đá ngũ sắc");
                                    } else if (player.inventory.gold < 1_000_000_000) {
                                        this.npcChat(player, "Bạn không đủ 1 Tỷ vàng");
                                    } else if (InventoryServiceNew.gI().getCountEmptyBag(player) == 0) {
                                        this.npcChat(player, "Hành trang của bạn không đủ chỗ trống");
                                    } else {
                                        player.inventory.gold -= 1_000_000_000;
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 99);
                                        Service.getInstance().sendMoney(player);
                                        Item trungLinhThu = ItemService.gI().createNewItem((short) 1083);
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "Bạn nhận được 1 Đá Cầu Vòng");
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    private static Npc jiren(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 5) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Sự kiện đánh quái Sên 8 ra bùa Giải, Khai, Phong\nMua Quả đào tại Shop Bunma đảo Kame đổi bùa Ấn\nTHÔNG TIN ĐỔI VẬT PHẨM\b|7|Đổi 1 Quả hồng đào => 1 bùa Ấn\nĐổi x99 4 loại bùa Giải, Khai, Phong, Ấn được cải trang chỉ số 400% TNSM\b|5|x99 Mảnh cải trang => CT Broly 1000%TNSm 1 Ngày\nx99 Mảnh CT + 100k hngoc => CT Broly Vĩnh viễn\b|7|Đổi Đá ngũ sắc cần x99 Đá ma thuật",
                                "Nhận bùa Ấn", "Cải trang Inosuke", "Cải trang Zenitsu", "Cải trang Nezuko", "Cải trang Tanjiro", "CT Broly\n1 Ngày", "CT Broly\nVĩnh viễn", "Đá ngũ sắc", "Từ chối");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 5) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0: {
                                    Item honLinhThu = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 541);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu.quantity < 1) {
                                        this.npcChat(player, "Bạn không đủ Quả hồng đào");

                                    } else if (InventoryServiceNew.gI().getCountEmptyBag(player) == 0) {
                                        this.npcChat(player, "Hành trang của bạn không đủ chỗ trống");
                                    } else {

                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 1);
                                        Service.getInstance().sendMoney(player);
                                        Item trungLinhThu = ItemService.gI().createNewItem((short) 540);
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "Bạn nhận được x1 Bùa Ấn");
                                    }
                                    break;
                                }
                                case 1: {
                                    Item honLinhThu = null;
                                    Item honLinhThu1 = null;
                                    Item honLinhThu2 = null;
                                    Item honLinhThu3 = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 537);
                                        honLinhThu1 = InventoryServiceNew.gI().findItemBag(player, 538);
                                        honLinhThu2 = InventoryServiceNew.gI().findItemBag(player, 539);
                                        honLinhThu3 = InventoryServiceNew.gI().findItemBag(player, 540);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu1 == null || honLinhThu2 == null || honLinhThu3 == null || honLinhThu.quantity < 99 || honLinhThu1.quantity < 99 || honLinhThu2.quantity < 99 || honLinhThu3.quantity < 99) {
                                        this.npcChat(player, "Bạn không đủ vật phẩm");
                                    } else {

                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu1, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu2, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu3, 99);
                                        Service.getInstance().sendMoney(player);
                                        Item trungLinhThu = ItemService.gI().createNewItem((short) 1089);
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(50, 30));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(77, 20));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(101, 400));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "Bạn nhận được Cải trang Inosuke");
                                    }
                                    break;
                                }
                                case 2: {
                                    Item honLinhThu = null;
                                    Item honLinhThu1 = null;
                                    Item honLinhThu2 = null;
                                    Item honLinhThu3 = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 537);
                                        honLinhThu1 = InventoryServiceNew.gI().findItemBag(player, 538);
                                        honLinhThu2 = InventoryServiceNew.gI().findItemBag(player, 539);
                                        honLinhThu3 = InventoryServiceNew.gI().findItemBag(player, 540);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu1 == null || honLinhThu2 == null || honLinhThu3 == null || honLinhThu.quantity < 99 || honLinhThu1.quantity < 99 || honLinhThu2.quantity < 99 || honLinhThu3.quantity < 99) {
                                        this.npcChat(player, "Bạn không đủ vật phẩm");
                                    } else {

                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu1, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu2, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu3, 99);
                                        Service.getInstance().sendMoney(player);
                                        Item trungLinhThu = ItemService.gI().createNewItem((short) 1090);
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(50, 30));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(77, 20));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(101, 400));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "Bạn nhận được Cải trang Zenitsu");
                                    }
                                    break;
                                }
                                case 3: {
                                    Item honLinhThu = null;
                                    Item honLinhThu1 = null;
                                    Item honLinhThu2 = null;
                                    Item honLinhThu3 = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 537);
                                        honLinhThu1 = InventoryServiceNew.gI().findItemBag(player, 538);
                                        honLinhThu2 = InventoryServiceNew.gI().findItemBag(player, 539);
                                        honLinhThu3 = InventoryServiceNew.gI().findItemBag(player, 540);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu1 == null || honLinhThu2 == null || honLinhThu3 == null || honLinhThu.quantity < 99 || honLinhThu1.quantity < 99 || honLinhThu2.quantity < 99 || honLinhThu3.quantity < 99) {
                                        this.npcChat(player, "Bạn không đủ vật phẩm");
                                    } else {

                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu1, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu2, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu3, 99);
                                        Service.getInstance().sendMoney(player);
                                        Item trungLinhThu = ItemService.gI().createNewItem((short) 1091);
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(50, 30));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(77, 20));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(101, 400));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "Bạn nhận được Cải trang Nezuko");
                                    }
                                    break;
                                }
                                case 4: {
                                    Item honLinhThu = null;
                                    Item honLinhThu1 = null;
                                    Item honLinhThu2 = null;
                                    Item honLinhThu3 = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 537);
                                        honLinhThu1 = InventoryServiceNew.gI().findItemBag(player, 538);
                                        honLinhThu2 = InventoryServiceNew.gI().findItemBag(player, 539);
                                        honLinhThu3 = InventoryServiceNew.gI().findItemBag(player, 540);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu1 == null || honLinhThu2 == null || honLinhThu3 == null || honLinhThu.quantity < 99 || honLinhThu1.quantity < 99 || honLinhThu2.quantity < 99 || honLinhThu3.quantity < 99) {
                                        this.npcChat(player, "Bạn không đủ vật phẩm");
                                    } else {

                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu1, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu2, 99);
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu3, 99);
                                        Service.getInstance().sendMoney(player);
                                        Item trungLinhThu = ItemService.gI().createNewItem((short) 1087);
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(50, 30));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(77, 20));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(101, 400));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "Bạn nhận được Cải trang Tanjiro");
                                    }
                                    break;
                                }
                                case 5: {
                                    Item honLinhThu = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 720);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu.quantity < 99) {
                                        this.npcChat(player, "Bạn không đủ Mảnh CT");

                                    } else if (InventoryServiceNew.gI().getCountEmptyBag(player) == 0) {
                                        this.npcChat(player, "Hành trang của bạn không đủ chỗ trống");
                                    } else {
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 99);
                                        Service.getInstance().sendMoney(player);
                                        Item trungLinhThu = ItemService.gI().createNewItem((short) 1214);
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(50, 60));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(77, 40));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(103, 40));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(101, 1000));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(93, 1));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "Bạn nhận được CT Broly Huyền thoại");
                                    }
                                    break;
                                }
                                case 6: {
                                    Item honLinhThu = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 720);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu.quantity < 99) {
                                        this.npcChat(player, "Bạn không đủ Mảnh CT");

                                    } else if (player.inventory.ruby < 100_000) {
                                        this.npcChat(player, "Bạn không đủ 100k hồng ngọc");
                                    } else if (InventoryServiceNew.gI().getCountEmptyBag(player) == 0) {
                                        this.npcChat(player, "Hành trang của bạn không đủ chỗ trống");
                                    } else {
                                        player.inventory.ruby -= 100_000;
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 99);
                                        Service.getInstance().sendMoney(player);
                                        Item trungLinhThu = ItemService.gI().createNewItem((short) 1214);
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(50, 60));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(77, 40));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(103, 40));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(95, 5));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(96, 5));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(101, 1000));
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "Bạn nhận được CT Broly Huyền thoại");
                                    }
                                    break;
                                }
                                case 7: {
                                    Item honLinhThu = null;
                                    try {
                                        honLinhThu = InventoryServiceNew.gI().findItemBag(player, 2030);
                                    } catch (Exception e) {
//                                        throw new RuntimeException(e);
                                    }
                                    if (honLinhThu == null || honLinhThu.quantity < 99) {
                                        this.npcChat(player, "Bạn không đủ Đá ma thuật");

                                    } else if (InventoryServiceNew.gI().getCountEmptyBag(player) == 0) {
                                        this.npcChat(player, "Hành trang của bạn không đủ chỗ trống");
                                    } else {
                                        InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 99);
                                        Service.getInstance().sendMoney(player);
                                        Item trungLinhThu = ItemService.gI().createNewItem((short) 674);
                                        trungLinhThu.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, trungLinhThu);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "Bạn nhận được Đá ngũ sắc");
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    private static Npc chuyensinh(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {

            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 50) {
                        this.createOtherMenu(player, 0,
                                "|7|CHUYỂN SINH"
                                + "\n\n|1|Yêu cầu Sức mạnh đạt 200 tỷ"
                                + "\nĐã học Skill " + player.tenskill9(player.gender)
                                + "\n\n|2|Sau khi chuyển sinh Thành công sẽ"
                                + "\n|5|-Nhân vật sẽ CHUYỂN HÀNH TINH KHÁC"
                                + "\n-Các Kỹ năng sẽ được Reset về cấp 1"
                                + "\n-Sức mạnh trở về 1,5 Triệu"
                                + "\n-Cấp chuyển sinh tăng 1 Cấp"
                                + "\n\n|1|Sức Mạnh: " + Util.getFormatNumber(player.nPoint.power) + "/" + "200Tỷ"
                                + "\n|3|=>Cấp Chuyển sinh càng cao sẽ được công thêm HP,KI,SD càng cao"
                                + "\n\n|7|Chuyển sinh Thất bại sẽ trừ đi Hồng ngọc và Giảm 20 Tỷ Sức mạnh"
                                + "\nMAX cấp Chuyển sinh là 30 Cấp",
                                "Chuyển sinh", "Thông tin\nchuyển sinh",
                                "Đóng");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 50) {
                        if (player.iDMark.getIndexMenu() == 0) { // 
                            switch (select) {
                                case 0:
                                    int percent = 100;
                                    int hongngoc = 0;
                                    if (player.taixiu.chuyensinh <= 10) {
                                        hongngoc = 10000;
                                    }
                                    if (player.taixiu.chuyensinh <= 20 && player.taixiu.chuyensinh > 10) {
                                        hongngoc = 20000;
                                    }
                                    if (player.taixiu.chuyensinh > 20) {
                                        hongngoc = 30000;
                                    }
                                    if (player.taixiu.chuyensinh >= 10) {
                                        percent -= (player.taixiu.chuyensinh) * 3;
                                    }
                                    this.createOtherMenu(player, 987,
                                            "|7|CHUYỂN SINH"
                                            + "\n\n|5|Bạn đang chuyển sinh : " + player.taixiu.chuyensinh
                                            + " \nCấp tiếp theo với tỉ lệ : " + (100 - player.taixiu.chuyensinh * 3)
                                            + "% \n Mức giá chuyển sinh : " + Util.format(hongngoc) + " Hồng ngọc \n\n|7|Bạn có muốn chuyển sinh ?",
                                            "Đồng ý", "Từ chối");
                                    break; // 
                                case 1:
                                    int hp = 0,
                                     dame = 0;
                                    if (player.taixiu.chuyensinh > 0) {
                                        if (player.taixiu.chuyensinh <= 10) {
                                            dame += (15000) * player.taixiu.chuyensinh;
                                            hp += (100000) * player.taixiu.chuyensinh;
                                        }
                                        if (player.taixiu.chuyensinh <= 20 && player.taixiu.chuyensinh > 10) {
                                            dame += (25000) * (player.taixiu.chuyensinh);
                                            hp += (200000) * (player.taixiu.chuyensinh);
                                        }
                                        if (player.taixiu.chuyensinh > 20) {
                                            dame += (35000) * (player.taixiu.chuyensinh);
                                            hp += (400000) * (player.taixiu.chuyensinh);
                                        }
                                    }
                                    Service.gI().sendThongBaoOK(player, "Bạn đang cấp chuyển sinh: " + player.taixiu.chuyensinh
                                            + "\n HP : +" + Util.format(hp) + "\n KI : +" + Util.format(hp) + "\n Sức đánh : +" + Util.format(dame));

                                    break;
                                case 2:
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == 987) {
                            if (player.taixiu.chuyensinh >= 30) {
                                npcChat(player, "|7| Cấp Chuyển sinh đạt MAX là 30 Cấp");
                                return;
                            }
                            if (player.playerSkill.skills.get(7).point == 0) {
                                npcChat(player, "|7|Yêu cầu phải học kỹ năng " + player.tenskill9(player.gender));
                                return;
                            }
                            if (player.nPoint.power < 200000000000L) {
                                npcChat(player, "|7|Bạn chưa đủ sức mạnh yêu cầu để Chuyển sinh");
                            } else {
                                int hongngoc = 0;
                                if (player.taixiu.chuyensinh <= 10) {
                                    hongngoc = 10000;
                                }
                                if (player.taixiu.chuyensinh <= 20 && player.taixiu.chuyensinh > 10) {
                                    hongngoc = 20000;
                                }
                                if (player.taixiu.chuyensinh > 20) {
                                    hongngoc = 30000;
                                }
                                if (player.inventory.ruby < hongngoc) {
                                    npcChat(player, "Bạn chưa đủ hồng ngọc để chuyển sinh");
                                    return;
                                }
                                int percent = 100;
                                if (player.taixiu.chuyensinh >= 10) {
                                    percent = percent - (player.taixiu.chuyensinh) * 3;
                                }
                                if (InventoryServiceNew.gI().getCountEmptyBag(player) > 0) {
                                    if (player.inventory.itemsBody.get(0).quantity < 1
                                            && player.inventory.itemsBody.get(1).quantity < 1
                                            && player.inventory.itemsBody.get(2).quantity < 1
                                            && player.inventory.itemsBody.get(3).quantity < 1
                                            && player.inventory.itemsBody.get(4).quantity < 1) {
                                        player.inventory.ruby -= hongngoc;
                                        if (Util.nextInt(0, 100) < (percent)) {
                                            player.gender += 1;
                                            player.nPoint.power = 1500000;
                                            player.taixiu.chuyensinh++;
                                            if (player.gender > 2) {
                                                player.gender = 0;
                                            }
                                            short[] headtd = {30, 31, 64};
                                            short[] headnm = {9, 29, 32};
                                            short[] headxd = {27, 28, 6};
                                            player.playerSkill.skills.clear();
                                            for (Skill skill : player.playerSkill.skills) {
                                                skill.point = 1;
                                            }
                                            int[] skillsArr = player.gender == 0 ? new int[]{0, 1, 6, 9, 10, 20, 22, 24, 19}
                                                    : player.gender == 1 ? new int[]{2, 3, 7, 11, 12, 17, 18, 26, 19}
                                                    : new int[]{4, 5, 8, 13, 14, 21, 23, 25, 19};
                                            for (int i = 0; i < skillsArr.length; i++) {
                                                player.playerSkill.skills.add(SkillUtil.createSkill(skillsArr[i], 1));
                                            }
                                            player.playerIntrinsic.intrinsic = IntrinsicService.gI().getIntrinsicById(0);
                                            player.playerIntrinsic.intrinsic.param1 = 0;
                                            player.playerIntrinsic.intrinsic.param2 = 0;
                                            player.playerIntrinsic.countOpen = 0;
                                            switch (player.gender) {
                                                case 0:
                                                    player.head = headtd[Util.nextInt(headtd.length)];
                                                    break;
                                                case 1:
                                                    player.head = headnm[Util.nextInt(headnm.length)];
                                                    break;
                                                case 2:
                                                    player.head = headxd[Util.nextInt(headxd.length)];
                                                    break;
                                                default:
                                                    break;
                                            }
                                            npcChat(player, "|1|Chuyển sinh thành công \n cấp hiện tại :" + player.taixiu.chuyensinh);
                                            Service.gI().player(player);
                                            Service.getInstance().sendFlagBag(player);
                                            Service.getInstance().Send_Caitrang(player);
                                            PlayerService.gI().sendInfoHpMpMoney(player);
                                            Service.gI().Send_Info_NV(player);
                                        } else {
                                            npcChat(player, "|7|Chuyển sinh thất bại \n cấp hiện tại :" + player.taixiu.chuyensinh);
                                            player.nPoint.power -= 20000000000L;
                                        }
                                    } else {
                                        Service.gI().sendThongBao(player, "Tháo hết 5 món đầu đang mặc ra nha");
                                    }
                                } else {
                                    Service.gI().sendThongBao(player, "Balo đầy");
                                }
                                Service.gI().player(player);
                                Service.getInstance().sendFlagBag(player);
                                Service.getInstance().Send_Caitrang(player);
                                PlayerService.gI().sendInfoHpMpMoney(player);
                                Service.gI().Send_Info_NV(player);
                                InventoryServiceNew.gI().sendItemBags(player);
                                Service.gI().sendMoney(player);
                            }
                        }
                    }
                }
            }
        };
    }

    private static Npc poTaGe(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 140) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Đa vũ trụ song song \b|7|Con muốn gọi con trong đa vũ trụ \b|1|Với giá 200tr vàng không?", "Gọi Boss\nNhân bản", "Từ chối");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 140) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0: {

//                                    Service.getInstance().sendThongBao(player, "Chức năng đang bảo trì");
                                    Boss oldBossClone = BossManager.gI().getBossById(Util.createIdBossClone((int) player.id));
                                    if (oldBossClone != null) {
                                        this.npcChat(player, "Nhà ngươi hãy tiêu diệt Boss lúc trước gọi ra đã, con boss đó đang ở khu " + oldBossClone.zone.zoneId);
                                    } else if (player.inventory.gold < 200_000_000) {
                                        this.npcChat(player, "Nhà ngươi không đủ 200 Triệu vàng ");
                                    } else {
                                        List<Skill> skillList = new ArrayList<>();
                                        for (byte i = 0; i < player.playerSkill.skills.size(); i++) {
                                            Skill skill = player.playerSkill.skills.get(i);
                                            if (skill.point > 0) {
                                                skillList.add(skill);
                                            }
                                        }
                                        int[][] skillTemp = new int[skillList.size()][3];
                                        for (byte i = 0; i < skillList.size(); i++) {
                                            Skill skill = skillList.get(i);
                                            if (skill.point > 0) {
                                                skillTemp[i][0] = skill.template.id;
                                                skillTemp[i][1] = skill.point;
                                                skillTemp[i][2] = skill.coolDown;
                                            }
                                        }
                                        BossData bossDataClone = new BossData(
                                                "Nhân Bản" + player.name,
                                                player.gender,
                                                new short[]{player.getHead(), player.getBody(), player.getLeg(), player.getFlagBag(), player.getAura(), player.getEffFront()},
                                                player.nPoint.dame,
                                                new double[]{player.nPoint.hpMax},
                                                new int[]{140},
                                                skillTemp,
                                                new String[]{"|-2|Boss nhân bản đã xuất hiện rồi"}, //text chat 1
                                                new String[]{"|-1|Ta sẽ chiếm lấy thân xác của ngươi hahaha!"}, //text chat 2
                                                new String[]{"|-1|Lần khác ta sẽ xử đẹp ngươi"}, //text chat 3
                                                60
                                        );

                                        try {
                                            new NhanBan(Util.createIdBossClone((int) player.id), bossDataClone, player.zone, player);
                                        } catch (Exception e) {
                                            System.out.println("ccccc");
                                        }
                                        //trừ vàng khi gọi boss
                                        player.inventory.gold -= 200_000_000;
                                        Service.getInstance().sendMoney(player);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    private static Npc quyLaoKame(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {
                        if (player.getSession().is_gift_box) {
                            this.createOtherMenu(player, ConstNpc.BASE_MENU, "Chào con, con muốn ta giúp gì nào?", "Đổi\nHồng ngọc", "Đổi\nThỏi vàng", "Giải tán bang hội", "Lãnh địa\nbang hội", "Kho báu\ndưới biển", "Nhận quà\nđền bù");
                        } else {
                            this.createOtherMenu(player, ConstNpc.BASE_MENU, "Chào con, con muốn ta giúp gì nào?", "Đổi\nHồng ngọc", "Đổi\nThỏi vàng", "Giải tán bang hội", "Lãnh địa\nbang hội", "Kho báu\ndưới biển");
                        }
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.isBaseMenu()) {
                        switch (select) {
                            case 0:
                                if (Manager.KHUYEN_MAI_NAP != 1) {
                                    this.createOtherMenu(player, ConstNpc.QUY_DOI_HN,
                                            "|7|QUY ĐỔI HỒNG NGỌC\n|6|Quy đổi Hồng ngọc, giới hạn đổi không quá 1.000.000đ\n\n|1|Tiền hiện còn : " + " " + Util.format(player.getSession().vnd)
                                            + "\n\n|5|Nhập 10.000Đ được 10.000 Hồng ngọc"
                                            + "\n\n|3| Server đang x" + Manager.KHUYEN_MAI_NAP + " Quy đổi "
                                            + "(10.000Đ = " + Util.format(Manager.KHUYEN_MAI_NAP * 10000) + " Hồng ngọc)"
                                            + "\n\n|7|(>= 500.000đ Được tặng Vé chuyển Hồng ngọc)",
                                            "Đồng ý", "Từ chối");
                                } else if (Manager.SUKIEN == 1) {
                                    this.createOtherMenu(player, ConstNpc.QUY_DOI_HN,
                                            "|7|QUY ĐỔI HỒNG NGỌC\n|6|Quy đổi Hồng ngọc, giới hạn đổi không quá 1.000.000đ\n\n|1|Tiền hiện còn : " + " " + Util.format(player.getSession().vnd)
                                            + "\n\n|5|Nhập 10.000Đ được 10.000 Hồng ngọc và được 10 Điểm Sự kiện" + "\n\n|7|(>= 500.000đ Được tặng Vé chuyển Hồng ngọc)",
                                            "Đồng ý", "Từ chối");
                                } else {
                                    this.createOtherMenu(player, ConstNpc.QUY_DOI_HN,
                                            "|7|QUY ĐỔI HỒNG NGỌC\n|6|Quy đổi Hồng ngọc, giới hạn đổi không quá 1.000.000đ\n\n|1|Tiền hiện còn : " + " " + Util.format(player.getSession().vnd)
                                            + "\n\n|5|Nhập 10.000Đ được 10.000 Hồng ngọc" + "\n\n|7|(>= 500.000đ được x2 Hồng ngọc và Được tặng Vé chuyển Hồng ngọc)",
                                            "Đồng ý", "Từ chối");
                                }
                                break;
                            case 1:
                                if (Manager.KHUYEN_MAI_NAP != 1) {
                                    this.createOtherMenu(player, ConstNpc.QUY_DOI_TV,
                                            "|7|QUY ĐỔI THỎI VÀNG\n|6|Quy đổi Thỏi vàng, giới hạn đổi không quá 1.000.000đ\n\n|1|Tiền hiện còn : " + " " + Util.format(player.getSession().vnd)
                                            + "\n\n|5|Nhập 10.000Đ được 50 Thỏi vàng"
                                            + "\n\n|3| Server đang x" + Manager.KHUYEN_MAI_NAP + " Quy đổi "
                                            + "(10.000Đ = " + Util.format(Manager.KHUYEN_MAI_NAP * 50) + " Thỏi vàng)"
                                            + "\n\n|7|(>= 500.000đ Được tặng Vé chuyển Hồng ngọc)",
                                            "Đồng ý", "Từ chối");
                                } else if (Manager.SUKIEN == 1) {
                                    this.createOtherMenu(player, ConstNpc.QUY_DOI_TV,
                                            "|7|QUY ĐỔI THỎI VÀNG\n|6|Quy đổi Thỏi vàng, giới hạn đổi không quá 1.000.000đ\n\n|1|Tiền hiện còn : " + " " + Util.format(player.getSession().vnd)
                                            + "\n\n|5|Nhập 10.000Đ được 50 Thỏi vàng ",
                                            "Đồng ý", "Từ chối");
                                } else {
                                    this.createOtherMenu(player, ConstNpc.QUY_DOI_TV,
                                            "|7|QUY ĐỔI THỎI VÀNG\n|6|Quy đổi Thỏi vàng, giới hạn đổi không quá 1.000.000đ\n\n|1|Tiền hiện còn : " + " " + Util.format(player.getSession().vnd)
                                            + "\n\n|5|Nhập 10.000Đ được 50 Thỏi vàng",
                                            "Đồng ý", "Từ chối");
                                }
                                break;
                            case 2:
                                Clan clan = player.clan;
                                if (clan != null) {
                                    ClanMember cm = clan.getClanMember((int) player.id);
                                    if (cm != null) {
                                        if (clan.members.size() > 1) {
                                            Service.getInstance().sendThongBao(player, "Bang phải còn một người");
                                            break;
                                        }
                                        if (!clan.isLeader(player)) {
                                            Service.getInstance().sendThongBao(player, "Phải là bảng chủ");
                                            break;
                                        }
//                                        
                                        NpcService.gI().createMenuConMeo(player, ConstNpc.CONFIRM_DISSOLUTION_CLAN, -1, "Con có chắc chắn muốn giải tán bang hội không? Ta cho con 2 lựa chọn...",
                                                "Yes you do!", "Từ chối!");
                                    }
                                    break;
                                }
                                Service.getInstance().sendThongBao(player, "Có bang hội đâu ba!!!");
                                break;
                            case 3:
                                if (player.clan != null) {
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 153, -1, -1);
                                } else {
                                    Service.getInstance().sendThongBao(player, "Yêu cầu có bang hội !!!");
                                }
                                break;
                            case 4:
//                                if (player.clan == null) {
//                                    this.createOtherMenu(player, ConstNpc.IGNORE_MENU,
//                                            "|7|BẢN ĐỒ KHO BÁU\n|6|Vào bang hội trước", "Đóng");
//                                    break;
//                                }
//                                    if (player.clan.getMembers().size() < BanDoKhoBau.N_PLAYER_CLAN) {
//                                        this.createOtherMenu(player, ConstNpc.IGNORE_MENU,
//                                                "|7|BẢN ĐỒ KHO BÁU\n|6|Bang hội phải có ít nhất 5 thành viên mới có thể mở", "Đóng");
//                                        break;
//                                    }
//                                    if (player.clanMember.getNumDateFromJoinTimeToToday() < 1) {
//                                        createOtherMenu(player, ConstNpc.IGNORE_MENU,
//                                                "|7|BẢN ĐỒ KHO BÁU\n|6|Bản đồ kho báu chỉ cho phép những người ở trong bang trên 1 ngày. Hẹn ngươi quay lại vào lúc khác",
//                                                "OK");
//                                        break;
//                                    }
//
//                                    if (player.bdkb_countPerDay >= 3) {
//                                        createOtherMenu(player, ConstNpc.IGNORE_MENU,
//                                                "|7|BẢN ĐỒ KHO BÁU\n|6|Con đã đạt giới hạn lượt đi trong ngày",
//                                                "OK");
//                                        break;
//                                    }

                                if (player.clan != null) {
                                    if (player.clan.banDoKhoBau != null) {
                                        this.createOtherMenu(player, ConstNpc.MENU_OPENED_BDKB,
                                                "|7|BẢN ĐỒ KHO BÁU\n|6|Bang hội của con đang đi Bản đồ Kho báu cấp độ "
                                                + player.clan.banDoKhoBau.level + "\nCon có muốn đi theo không?",
                                                "Đồng ý", "Từ chối");
                                    } else {
                                        this.createOtherMenu(player, ConstNpc.MENU_OPEN_BDKB,
                                                "|7|BẢN ĐỒ KHO BÁU\n|6|Bản đồ Kho báu đã chuẩn bị tiếp nhận các đợt tấn công của quái vật\n"
                                                + "các con hãy giúp chúng ta tiêu diệt quái vật \n"
                                                + "Ở đây có ta lo\nNhớ chọn cấp độ vừa sức mình nhé",
                                                "Chọn\ncấp độ", "Từ chối");
                                    }
                                } else {
                                    this.npcChat(player, "Con phải có bang hội ta mới có thể cho con đi");
                                }
                                break;
                            case 5:
                                if (player.getSession().is_gift_box) {
                                    if (PlayerDAO.setIs_gift_box(player)) {
                                        player.getSession().is_gift_box = false;
                                        player.inventory.coupon += 5;
                                        Service.getInstance().sendThongBao(player, "Bạn vừa nhận được 5 điểm Coupon");
                                        Service.getInstance().sendMoney(player);
                                    }
                                }
                                break;
//                            case ConstNpc.MENU_OPENED_DBKB:
//                                if (select == 0) {
//                                    BanDoKhoBauService.gI().joinBDKB(player);
//                                }
//                                break;
//                            case ConstNpc.MENU_ACCEPT_GO_TO_BDKB:
//                                if (select == 0) {
//                                    Object level = PLAYERID_OBJECT.get(player.id);
//                                    BanDoKhoBauService.gI().openBDKB(player, (int) level);
//                                }
//                            break;
                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_OPENED_BDKB) {
                        switch (select) {
                            case 0:
                                if (player.isAdmin() || player.nPoint.power >= BanDoKhoBau.POWER_CAN_GO_TO_BDKB) {
                                    BanDoKhoBauService.gI().joinBDKB(player);
                                } else {
                                    this.npcChat(player, "Sức mạnh của con phải ít nhất phải đạt "
                                            + Util.numberToMoney(BanDoKhoBau.POWER_CAN_GO_TO_BDKB));
                                }
                                break;
                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_OPEN_BDKB) {
                        switch (select) {
                            case 0:
                                if (player.isAdmin() || player.nPoint.power >= BanDoKhoBau.POWER_CAN_GO_TO_BDKB) {
                                    Input.gI().createFormChooseLevelBDKB(player);
                                } else {
                                    this.npcChat(player, "Sức mạnh của con phải ít nhất phải đạt "
                                            + Util.numberToMoney(BanDoKhoBau.POWER_CAN_GO_TO_BDKB));
                                }
                                break;
                        }

                    } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_ACCPET_GO_TO_BDKB) {
                        switch (select) {
                            case 0:
                                if (player.chienthan.tasknow == 8) {
                                    player.chienthan.dalamduoc++;
                                }
                                BanDoKhoBauService.gI().openBanDoKhoBau(player, Byte.parseByte(String.valueOf(PLAYERID_OBJECT.get(player.id))));
                                break;
                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.QUY_DOI_HN) {
                        switch (select) {
                            case 0:
                                Input.gI().createFormQDHN(player);
                                break;

                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.QUY_DOI_TV) {
                        switch (select) {
                            case 0:
                                Input.gI().createFormQDTV(player);
                                break;

                        }
                    }
                }
            }
        };
    }

    public static Npc truongLaoGuru(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {
                        super.openBaseMenu(player);
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {

                }
            }
        };
    }

    public static Npc vuaVegeta(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {
                        super.openBaseMenu(player);
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {

                }
            }
        };
    }

    public static Npc ongGohan_ongMoori_ongParagus(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    String checkvnd;
                    int thoivang;
                    if (player.vnd >= 0 && player.vnd < 500000) {
                        checkvnd = "Tân Thủ";
                        thoivang = 15;
                    } else if (player.vnd > 500000 && player.vnd < 1000000) {
                        checkvnd = "VIP";
                        thoivang = 50;
                    } else {
                        checkvnd = "SVIP";
                        thoivang = 80;
                    }
                    if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Cố Gắng Có Làm Mới Có Ăn Con, đừng lo lắng cho ta.\n"
                                        .replaceAll("%1", player.gender == ConstPlayer.TRAI_DAT ? "Quy lão Kamê"
                                                : player.gender == ConstPlayer.NAMEC ? "Trưởng lão Guru" : "Vua Vegeta") + "Ta đang giữ tiền tiết kiệm của con\n|1| Hiện tại con đang có: " + player.getSession().goldBar + " Thỏi vàng"
                                + "\n\n|7| Cấp VIP được tính như sau:"
                                + "\n|2| Quy đổi tiền <500.000đ = Tân Thủ (Nhận 15 Thỏi vàng/Ngày)"
                                + "\n Quy đổi tiền >500.000đ và <1.000.000đ = VIP (Nhận 50 Thỏi vàng/Ngày)"
                                + "\n Quy đổi tiền >1.000.000đ = SVIP (Nhận 80 Thỏi vàng/Ngày)"
                                + "\n|3|TỔNG QUY ĐỔI : " + Util.format(player.vnd) + "đ"
                                + "\n\n|7|Cấp VIP hiện tại của bạn là : " + checkvnd + "\n|1| Điểm danh hằng ngày sẽ nhận được " + thoivang + " Thỏi vàng",
                                "Đổi Mật Khẩu", "Nhận 20tr Ngọc xanh", "Nhận đệ tử", "Nhận\nVàng", "Giftcode", "Điểm danh\nngày", "Đến\n Khu Test Dame");

                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.isBaseMenu()) {
                        switch (select) {
                            case 0:
                                Input.gI().createFormChangePassword(player);
                                break;
                            case 1:
                                if (player.inventory.gem >= 200000000) {
                                    this.npcChat(player, "Tham Lam");
                                    break;
                                }
                                player.inventory.gem = 200000000;
                                Service.getInstance().sendMoney(player);
                                Service.getInstance().sendThongBao(player, "|1|Bạn vừa nhận được 20tr Ngọc xanh");
                                break;
                            case 2:
                                if (player.pet == null) {
                                    PetService.gI().createNormalPet(player);
                                    Service.getInstance().sendThongBao(player, "Bạn vừa nhận được đệ tử");
                                } else {
                                    this.npcChat(player, "Tham Lam");
                                }
                                break;
                            case 3:
                                if (Maintenance.isRuning) {
                                    break;
                                }
                                if (player.getSession().goldBar > 0) {
                                    if (InventoryServiceNew.gI().getCountEmptyBag(player) > 0) {
                                        int quantity = player.getSession().goldBar;
                                        if (PlayerDAO.subGoldBar(player, player.getSession().goldBar)) {
                                            Item goldBar = ItemService.gI().createNewItem((short) 457, quantity);
                                            InventoryServiceNew.gI().addItemBag(player, goldBar);
                                            InventoryServiceNew.gI().sendItemBags(player);
                                            this.npcChat(player, "Ta đã gửi " + quantity + " thỏi vàng vào hành trang của con\n con hãy kiểm tra ");
                                        } else {
                                            this.npcChat(player, "Lỗi vui lòng báo admin...");
                                        }
                                    } else {
                                        this.npcChat(player, "Hãy chừa cho ta 1 ô trống");
                                    }
                                } else {
                                    this.npcChat(player, "Con đang không có thỏi vàng hãy ib AD để được buff !!!");
                                }
                                break;

                            case 4:
                                Input.gI().createFormGiftCode(player);
                                break;
                            case 5:
                                if (player.diemdanh == 0) {
                                    int thoivang1;
                                    if (player.vnd >= 0 && player.vnd < 500000) {
                                        thoivang1 = 15;
                                    } else if (player.vnd > 500000 && player.vnd < 1000000) {
                                        thoivang1 = 50;
                                    } else {
                                        thoivang1 = 80;
                                    }
                                    Item thoivang = ItemService.gI().createNewItem((short) 457, thoivang1);
                                    InventoryServiceNew.gI().addItemBag(player, thoivang);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    player.diemdanh = System.currentTimeMillis();
                                    Service.getInstance().sendThongBao(player, "|7|Bạn vừa nhận được " + thoivang1 + " Thỏi vàng");
                                } else {
                                    this.npcChat(player, "Hôm nay đã nhận rồi mà !!!");
                                }
                                break;
                            case 6:
                                ChangeMapService.gI().changeMapBySpaceShip(player, 170, -1, -1);
                                break;
                        }
                    }
                } else if (player.iDMark.getIndexMenu() == ConstNpc.QUA_TAN_THU) {
                    switch (select) {
                        case 0:
//                                        if (!player.gift.gemTanThu) {
                            if (true) {
                                player.inventory.gem = 100000;
                                Service.getInstance().sendMoney(player);
                                Service.getInstance().sendThongBao(player, "Bạn vừa nhận được 100K ngọc xanh");
                                player.gift.gemTanThu = true;
                            } else {
                                this.createOtherMenu(player, ConstNpc.IGNORE_MENU, "Con đã nhận phần quà này rồi mà",
                                        "Đóng");
                            }
                            break;
//                            case 1:
//                                if (nhanVang) {
//                                    player.inventory.gold = Inventory.LIMIT_GOLD;
//                                    Service.getInstance().sendMoney(player);
//                                    Service.getInstance().sendThongBao(player, "Bạn vừa nhận được 2 tỉ vàng");
//                                } else {
//                                    this.npcChat("");
//                                }
//                                break;
                        case 1:
                            if (nhanDeTu) {
                                if (player.pet == null) {
                                    PetService.gI().createNormalPet(player);
                                    Service.getInstance().sendThongBao(player, "Bạn vừa nhận được đệ tử");
                                } else {
                                    this.npcChat("Con đã nhận đệ tử rồi");
                                }
                            }
                            break;
                    }
                } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_PHAN_THUONG) {
                    switch (select) {
                        case 0:
                            ShopServiceNew.gI().opendShop(player, "ITEMS_REWARD", true);
                            break;
//                            case 1:
//                                if (player.getSession().goldBar > 0) {
//                                    if (InventoryServiceNew.gI().getCountEmptyBag(player) > 0) {
//                                        int quantity = player.getSession().goldBar;
//                                        Item goldBar = ItemService.gI().createNewItem((short) 457, quantity);
//                                        InventoryServiceNew.gI().addItemBag(player, goldBar);
//                                        InventoryServiceNew.gI().sendItemBags(player);
//                                        this.npcChat(player, "Ông đã để " + quantity + " thỏi vàng vào hành trang con rồi đấy");
//                                        PlayerDAO.subGoldBar(player, quantity);
//                                        player.getSession().goldBar = 0;
//                                    } else {
//                                        this.npcChat(player, "Con phải có ít nhất 1 ô trống trong hành trang ông mới đưa cho con được");
//                                    }
//                                }
//                                break;
                    }
                } else if (player.iDMark.getIndexMenu() == ConstNpc.NAP_THE) {
                    Input.gI().createFormNapThe(player, (byte) select);
                }
            }
        };
    }

    public static Npc bulmaQK(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Cậu cần trang bị gì cứ đến chỗ tôi nhé", "Cửa\nhàng");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.isBaseMenu()) {
                        switch (select) {
                            case 0://Shop
                                if (player.gender == ConstPlayer.TRAI_DAT) {
                                    ShopServiceNew.gI().opendShop(player, "BUNMA", true);
                                } else {
                                    this.createOtherMenu(player, ConstNpc.IGNORE_MENU, "Xin lỗi cưng, chị chỉ bán đồ cho người Trái Đất", "Đóng");
                                }
                                break;
                        }
                    }
                }
            }
        };
    }

    public static Npc dende(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {

                        int nPlSameClan1 = 0;
                        for (Player pl : player.zone.getPlayers()) {
                            if (!pl.equals(player) && pl.clan != null
                                    && pl.clan.equals(player.clan) && pl.location.x >= 53
                                    && pl.location.x <= 1188 && pl.idNRNM != -1) {
                                nPlSameClan1++;
                            }
                        }
                        if (player.zone.map.mapId == 7 && nPlSameClan1 < 6 && player.idNRNM != -1) {
                            createOtherMenu(player, ConstNpc.IGNORE_MENU,
                                    "Ngươi phải có ít nhất đồng đội cùng bang đứng gần mới có thể\nvào\n"
                                    + "tuy nhiên ta khuyên ngươi nên đi cùng với 7 người để khỏi chết.\n"
                                    + "Hahaha.", "OK", "Hướng\ndẫn\nthêm");
                            return;
                        } else if (player.zone.map.mapId == 7 && nPlSameClan1 >= 6 && player.idNRNM != -1 && player.idNRNM == 353) {

                            this.createOtherMenu(player, 1, "Ồ, ngọc rồng namếc, bạn thật là may mắn\nnếu tìm đủ 7 viên sẽ được Rồng Thiêng Namếc ban cho điều ước", "Hướng\ndẫn\nGọi Rồng", "Gọi rồng", "Từ chối");
                        } //                        if (player.idNRNM != -1) {
                        //                            if (player.zone.map.mapId == 7) {
                        //                                this.createOtherMenu(player, 1, "Ồ, ngọc rồng namếc, bạn thật là may mắn\nnếu tìm đủ 7 viên sẽ được Rồng Thiêng Namếc ban cho điều ước", "Hướng\ndẫn\nGọi Rồng", "Gọi rồng", "Từ chối");
                        //                            }
                        //                        } 
                        else {
                            this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                    "Anh cần trang bị gì cứ đến chỗ em nhé", "Cửa\nhàng");
                        }
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.isBaseMenu()) {
                        switch (select) {
                            case 0://Shop
                                if (player.gender == ConstPlayer.NAMEC) {
                                    ShopServiceNew.gI().opendShop(player, "DENDE", true);
                                } else {
                                    this.createOtherMenu(player, ConstNpc.IGNORE_MENU, "Xin lỗi anh, em chỉ bán đồ cho dân tộc Namếc", "Đóng");
                                }
                                break;
                        }
                    } else if (player.iDMark.getIndexMenu() == 1) {
                        if (player.zone.map.mapId == 7 && player.idNRNM != -1) {
                            if (player.idNRNM == 353) {
                                NgocRongNamecService.gI().firstNrNamec = true;
                                NgocRongNamecService.gI().timeNrNamec = 0;
                                NgocRongNamecService.gI().doneDragonNamec();
                                NgocRongNamecService.gI().initNgocRongNamec((byte) 1);
                                NgocRongNamecService.gI().reInitNrNamec((long) TIME_OP);
                                SummonDragon.gI().summonNamec(player);
                            } else {
                                Service.getInstance().sendThongBao(player, "Anh phải có viên ngọc rồng Namếc 1 sao");
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc appule(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Ngươi cần trang bị gì cứ đến chỗ ta nhé", "Cửa\nhàng");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.isBaseMenu()) {
                        switch (select) {
                            case 0://Shop
                                if (player.gender == ConstPlayer.XAYDA) {
                                    ShopServiceNew.gI().opendShop(player, "APPULE", true);
                                } else {
                                    this.createOtherMenu(player, ConstNpc.IGNORE_MENU, "Về hành tinh hạ đẳng của ngươi mà mua đồ cùi nhé. Tại đây ta chỉ bán đồ cho người Xayda thôi", "Đóng");
                                }
                                break;
                        }
                    }
                }
            }
        };
    }

    public static Npc drDrief(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player pl) {
                if (canOpenNpc(pl)) {
                    if (this.mapId == 84) {
                        this.createOtherMenu(pl, ConstNpc.BASE_MENU,
                                "Tàu Vũ Trụ của ta có thể đưa cậu đến hành tinh khác chỉ trong 3 giây. Cậu muốn đi đâu?",
                                pl.gender == ConstPlayer.TRAI_DAT ? "Đến\nTrái Đất" : pl.gender == ConstPlayer.NAMEC ? "Đến\nNamếc" : "Đến\nXayda");
                    } else if (!TaskService.gI().checkDoneTaskTalkNpc(pl, this)) {
                        if (pl.playerTask.taskMain.id == 7) {
                            NpcService.gI().createTutorial(pl, this.avartar, "Hãy lên đường cứu đứa bé nhà tôi\n"
                                    + "Chắc bây giờ nó đang sợ hãi lắm rồi");
                        } else {
                            this.createOtherMenu(pl, ConstNpc.BASE_MENU,
                                    "Tàu Vũ Trụ của ta có thể đưa cậu đến hành tinh khác chỉ trong 3 giây. Cậu muốn đi đâu?",
                                    "Đến\nNamếc", "Đến\nXayda", "Siêu thị");
                        }
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 84) {
                        ChangeMapService.gI().changeMapBySpaceShip(player, player.gender + 24, -1, -1);
                    } else if (player.iDMark.isBaseMenu()) {
                        switch (select) {
                            case 0:
                                ChangeMapService.gI().changeMapBySpaceShip(player, 25, -1, -1);
                                break;
                            case 1:
                                ChangeMapService.gI().changeMapBySpaceShip(player, 26, -1, -1);
                                break;
                            case 2:
                                ChangeMapService.gI().changeMapBySpaceShip(player, 84, -1, -1);
                                break;
                        }
                    }
                }
            }
        };
    }

    public static Npc cargo(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player pl) {
                if (canOpenNpc(pl)) {
                    if (!TaskService.gI().checkDoneTaskTalkNpc(pl, this)) {
                        if (pl.playerTask.taskMain.id == 7) {
                            NpcService.gI().createTutorial(pl, this.avartar, "Hãy lên đường cứu đứa bé nhà tôi\n"
                                    + "Chắc bây giờ nó đang sợ hãi lắm rồi");
                        } else {
                            this.createOtherMenu(pl, ConstNpc.BASE_MENU,
                                    "Tàu Vũ Trụ của ta có thể đưa cậu đến hành tinh khác chỉ trong 3 giây. Cậu muốn đi đâu?",
                                    "Đến\nTrái Đất", "Đến\nXayda", "Siêu thị");
                        }
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.isBaseMenu()) {
                        switch (select) {
                            case 0:
                                ChangeMapService.gI().changeMapBySpaceShip(player, 24, -1, -1);
                                break;
                            case 1:
                                ChangeMapService.gI().changeMapBySpaceShip(player, 26, -1, -1);
                                break;
                            case 2:
                                ChangeMapService.gI().changeMapBySpaceShip(player, 84, -1, -1);
                                break;
                        }
                    }
                }
            }
        };
    }

    public static Npc cui(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {

            private final int COST_FIND_BOSS = 50000000;

            @Override
            public void openBaseMenu(Player pl) {
                if (canOpenNpc(pl)) {
                    if (!TaskService.gI().checkDoneTaskTalkNpc(pl, this)) {
                        if (pl.playerTask.taskMain.id == 7) {
                            NpcService.gI().createTutorial(pl, this.avartar, "Hãy lên đường cứu đứa bé nhà tôi\n"
                                    + "Chắc bây giờ nó đang sợ hãi lắm rồi");
                        } else {
                            if (this.mapId == 19) {

                                int taskId = TaskService.gI().getIdTask(pl);
                                switch (taskId) {
                                    case ConstTask.TASK_19_0:
                                        this.createOtherMenu(pl, ConstNpc.MENU_FIND_KUKU,
                                                "Đội quân của Fide đang ở Thung lũng Nappa, ta sẽ đưa ngươi đến đó",
                                                "Đến chỗ\nKuku\n(" + Util.numberToMoney(COST_FIND_BOSS) + " vàng)", "Đến Cold", "Đến\nNappa", "Từ chối");
                                        break;
                                    case ConstTask.TASK_19_1:
                                        this.createOtherMenu(pl, ConstNpc.MENU_FIND_MAP_DAU_DINH,
                                                "Đội quân của Fide đang ở Thung lũng Nappa, ta sẽ đưa ngươi đến đó",
                                                "Đến chỗ\nMập đầu đinh\n(" + Util.numberToMoney(COST_FIND_BOSS) + " vàng)", "Đến Cold", "Đến\nNappa", "Từ chối");
                                        break;
                                    case ConstTask.TASK_19_2:
                                        this.createOtherMenu(pl, ConstNpc.MENU_FIND_RAMBO,
                                                "Đội quân của Fide đang ở Thung lũng Nappa, ta sẽ đưa ngươi đến đó",
                                                "Đến chỗ\nRambo\n(" + Util.numberToMoney(COST_FIND_BOSS) + " vàng)", "Đến Cold", "Đến\nNappa", "Từ chối");
                                        break;
                                    default:
                                        this.createOtherMenu(pl, ConstNpc.BASE_MENU,
                                                "Đội quân của Fide đang ở Thung lũng Nappa, ta sẽ đưa ngươi đến đó",
                                                "Đến Cold", "Đến\nNappa", "Từ chối");

                                        break;
                                }
                            } else if (this.mapId == 68) {
                                this.createOtherMenu(pl, ConstNpc.BASE_MENU,
                                        "Ngươi muốn về Thành Phố Vegeta", "Đồng ý", "Từ chối");
                            } else {
                                this.createOtherMenu(pl, ConstNpc.BASE_MENU,
                                        "Tàu vũ trụ Xayda sử dụng công nghệ mới nhất, "
                                        + "có thể đưa ngươi đi bất kỳ đâu, chỉ cần trả tiền là được.",
                                        "Đến\nTrái Đất", "Đến\nNamếc", "Siêu thị");
                            }
                        }
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 26) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 24, -1, -1);
                                    break;
                                case 1:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 25, -1, -1);
                                    break;
                                case 2:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 84, -1, -1);
                                    break;
                            }
                        }
                    }
                    if (this.mapId == 19) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 109, -1, 295);
                                    break;
                                case 1:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 68, -1, 90);
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_FIND_KUKU) {
                            switch (select) {
                                case 0:
                                    Boss boss = BossManager.gI().getBossById(BossID.KUKU);
                                    if (boss != null && !boss.isDie()) {
                                        if (player.inventory.gold >= COST_FIND_BOSS) {
                                            Zone z = MapService.gI().getMapCanJoin(player, boss.zone.map.mapId, boss.zone.zoneId);
                                            if (z.getNumOfPlayers() < z.maxPlayer) {
                                                player.inventory.gold -= COST_FIND_BOSS;
                                                ChangeMapService.gI().changeMap(player, boss.zone, boss.location.x, boss.location.y);
                                                Service.getInstance().sendMoney(player);
                                            } else {
                                                Service.getInstance().sendThongBao(player, "Khu vực đang full.");
                                            }
                                        } else {
                                            Service.getInstance().sendThongBao(player, "Không đủ vàng, còn thiếu "
                                                    + Util.numberToMoney(COST_FIND_BOSS - player.inventory.gold) + " vàng");
                                        }
                                        break;
                                    }
                                    Service.getInstance().sendThongBao(player, "Chết rồi ba...");
                                    break;
                                case 1:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 109, -1, 295);
                                    break;
                                case 2:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 68, -1, 90);
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_FIND_MAP_DAU_DINH) {
                            switch (select) {
                                case 0:
                                    Boss boss = BossManager.gI().getBossById(BossID.MAP_DAU_DINH);
                                    if (boss != null && !boss.isDie()) {
                                        if (player.inventory.gold >= COST_FIND_BOSS) {
                                            Zone z = MapService.gI().getMapCanJoin(player, boss.zone.map.mapId, boss.zone.zoneId);
                                            if (z.getNumOfPlayers() < z.maxPlayer) {
                                                player.inventory.gold -= COST_FIND_BOSS;
                                                ChangeMapService.gI().changeMap(player, boss.zone, boss.location.x, boss.location.y);
                                                Service.getInstance().sendMoney(player);
                                            } else {
                                                Service.getInstance().sendThongBao(player, "Khu vực đang full.");
                                            }
                                        } else {
                                            Service.getInstance().sendThongBao(player, "Không đủ vàng, còn thiếu "
                                                    + Util.numberToMoney(COST_FIND_BOSS - player.inventory.gold) + " vàng");
                                        }
                                        break;
                                    }
                                    Service.getInstance().sendThongBao(player, "Chết rồi ba...");
                                    break;
                                case 1:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 109, -1, 295);
                                    break;
                                case 2:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 68, -1, 90);
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_FIND_RAMBO) {
                            switch (select) {
                                case 0:
                                    Boss boss = BossManager.gI().getBossById(BossID.RAMBO);
                                    if (boss != null && !boss.isDie()) {
                                        if (player.inventory.gold >= COST_FIND_BOSS) {
                                            Zone z = MapService.gI().getMapCanJoin(player, boss.zone.map.mapId, boss.zone.zoneId);
                                            if (z.getNumOfPlayers() < z.maxPlayer) {
                                                player.inventory.gold -= COST_FIND_BOSS;
                                                ChangeMapService.gI().changeMap(player, boss.zone, boss.location.x, boss.location.y);
                                                Service.getInstance().sendMoney(player);
                                            } else {
                                                Service.getInstance().sendThongBao(player, "Khu vực đang full.");
                                            }
                                        } else {
                                            Service.getInstance().sendThongBao(player, "Không đủ vàng, còn thiếu "
                                                    + Util.numberToMoney(COST_FIND_BOSS - player.inventory.gold) + " vàng");
                                        }
                                        break;
                                    }
                                    Service.getInstance().sendThongBao(player, "Chết rồi ba...");
                                    break;
                                case 1:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 109, -1, 295);
                                    break;
                                case 2:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 68, -1, 90);
                                    break;
                            }
                        }
                    }
                    if (this.mapId == 68) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 19, -1, 1100);
                                    break;
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc santa(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    createOtherMenu(player, ConstNpc.BASE_MENU,
                            "Xin chào, ta có một số vật phẩm đặt biệt cậu có muốn xem không?",
                            "Cửa hàng", "Tiệm\nhồng ngọc", "Shop\n phụ kiện", "Shop Pet");
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 5 || this.mapId == 13 || this.mapId == 20) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0: //shop
                                    ShopServiceNew.gI().opendShop(player, "SANTA", false);
                                    break;
                                case 1: //tiệm hồng ngọc
                                    ShopServiceNew.gI().opendShop(player, "SANTA_RUBY", false);
                                    break;
                                case 2:
                                    ShopServiceNew.gI().opendShop(player, "BUNMA_LINHTHU", true);
                                    break;
                                case 3: //tiệm hớt tóc
                                    ShopServiceNew.gI().opendShop(player, "PET", true);
                                    break;
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc uron(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player pl) {
                if (canOpenNpc(pl)) {
                    ShopServiceNew.gI().opendShop(pl, "URON", false);
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {

                }
            }
        };
    }

    public static Npc baHatMit(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 5 || this.mapId == 13) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Ngươi tìm ta có việc gì?",
                                "Ép sao\ntrang bị",
                                "Pha lê\nhóa\ntrang bị",
                                "Tinh ấn\ntrang bị",
                                "Pháp sư hoá\ntrang bị",
                                "Tẩy\npháp sư",
                                "Chân mệnh",
                                "Chuyển hóa\nđồ Hủy diệt",
                                "Chuyển hóa\nSKH",
                                "Gia Hạn\nvật phẩm");
                    } else if (this.mapId == 121) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Ngươi tìm ta có việc gì?",
                                "Về đảo\nrùa");

                    } else {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Ngươi tìm ta có việc gì?",
                                "Cửa hàng\nBùa", "Nâng cấp\nVật phẩm",
                                "Nhập\nNgọc Rồng",
                                "Nâng cấp\nBông tai\nPorata",
                                "Mở chỉ số\n bông tai 2",
                                "Mở chỉ số\n bông tai 3",
                                "Mở chỉ số\n bông tai 4");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 5 || this.mapId == 13) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.EP_SAO_TRANG_BI);
                                    break;
                                case 1:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.PHA_LE_HOA_TRANG_BI);
                                    break;
                                case 2:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.AN_TRANG_BI);
                                    break;
                                case 3:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.PHAP_SU_HOA);
                                    break;
                                case 4:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.TAY_PHAP_SU);
                                    break;
                                case 5: //nâng cấp Chân mệnh
                                    this.createOtherMenu(player, 5701,
                                            "|7|CHÂN MỆNH"
                                            + "\n\n|1|Bạn đang có: " + Util.format(player.inventory.event) + " Điểm Săn Boss"
                                            + "\n\n|5|Bạn Được Hiếu Tặng Free  Chân Mệnh cấp 1 Bú Nhanh"
                                            + "\n|3| Lưu ý: Chỉ được nhận Chân mệnh 1 lần (Hành trang chỉ tồn tại 1 Chân mệnh)"
                                            + "\nNếu đã có Chân mệnh. Ta sẽ giúp ngươi nâng cấp bậc lên với các dòng chỉ số cao hơn",
                                            "Nhận Chân mệnh", "Nâng cấp Chân mệnh", "Shop\nChân mệnh");
                                    break;
                                case 6:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.CHUYEN_HOA_DO_HUY_DIET);
                                    break;
                                case 7:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.RANDOM_SKH);
                                    break;
                                case 8:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.GIA_HAN_VAT_PHAM);
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == 5701) {
                            switch (select) {
                                case 0:
                                    for (int i = 0; i < 9; i++) {
                                        Item findItemBag = InventoryServiceNew.gI().findItemBag(player, 1300 + i);
                                        Item findItemBody = InventoryServiceNew.gI().findItemBody(player, 1300 + i);
                                        if (findItemBag != null || findItemBody != null) {
                                            Service.gI().sendThongBao(player, "|7|Ngươi đã có Chân mệnh rồi mà");
                                            return;
                                        }
                                    }
                                    if (player.inventory.event >= 0) {
                                        player.inventory.event -= 0;
                                        Item chanmenh = ItemService.gI().createNewItem((short) 1300);
                                        chanmenh.itemOptions.add(new Item.ItemOption(50, 15));
                                        chanmenh.itemOptions.add(new Item.ItemOption(77, 20));
                                        chanmenh.itemOptions.add(new Item.ItemOption(103, 20));
                                        chanmenh.itemOptions.add(new Item.ItemOption(30, 1));
                                        InventoryServiceNew.gI().addItemBag(player, chanmenh);
                                        Service.getInstance().sendMoney(player);
                                        InventoryServiceNew.gI().sendItemBags(player);
                                        this.npcChat(player, "|1|Bạn nhận được Chân mệnh Cấp 1");
                                    } else {
                                        this.npcChat(player, "|1|Kiểm Tra Hành Trang Của Ngươi Đi");
                                    }
                                    break;
                                case 1:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.NANG_CAP_CHAN_MENH);
                                    break;
                                case 2:
                                    ShopServiceNew.gI().opendShop(player, "CHAN MENH", true);
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_START_COMBINE) {
                            switch (player.combineNew.typeCombine) {
                                case CombineServiceNew.EP_SAO_TRANG_BI:
                                case CombineServiceNew.AN_TRANG_BI:
                                case CombineServiceNew.PHA_LE_HOA_TRANG_BI:
                                case CombineServiceNew.CHUYEN_HOA_TRANG_BI:
                                case CombineServiceNew.PHAP_SU_HOA:
                                case CombineServiceNew.TAY_PHAP_SU:
                                case CombineServiceNew.NANG_CAP_CHAN_MENH:
                                case CombineServiceNew.CHUYEN_HOA_DO_HUY_DIET:
                                case CombineServiceNew.RANDOM_SKH:
                                case CombineServiceNew.GIA_HAN_VAT_PHAM:
                                    if (select == 0) {
                                        CombineServiceNew.gI().startCombine(player);
                                    }
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_CHUYEN_HOA_DO_HUY_DIET) {
                            if (select == 0) {
                                CombineServiceNew.gI().startCombine(player);
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_RANDOM_SKH) {
                            if (select == 0) {
                                CombineServiceNew.gI().startCombine(player);
                            }
                        }
                    } else if (this.mapId == 112) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 5, -1, 1156);
                                    break;
                            }
                        }
                    } else if (this.mapId == 42 || this.mapId == 43 || this.mapId == 44 || this.mapId == 84) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0: //shop bùa
                                    createOtherMenu(player, ConstNpc.MENU_OPTION_SHOP_BUA,
                                            "Bùa của ta rất lợi hại, nhìn ngươi yếu đuối thế này, chắc muốn mua bùa để "
                                            + "mạnh mẽ à, mua không ta bán cho, xài rồi lại thích cho mà xem.",
                                            "Bùa\n1 giờ", "Bùa\n8 giờ", "Bùa\n1 tháng", "Đóng");
                                    break;
                                case 1:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.NANG_CAP_VAT_PHAM);
                                    break;
                                case 2:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.NHAP_NGOC_RONG);
                                    break;
                                case 3: //nâng cấp bông tai
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.NANG_CAP_BONG_TAI);
                                    break;
                                case 4: //làm phép nhập đá
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.MO_CHI_SO_BONG_TAI_2);
                                    break;
                                case 5: //làm phép nhập đá
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.MO_CHI_SO_BONG_TAI_3);
                                    break;
                                case 6: //làm phép nhập đá
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.MO_CHI_SO_BONG_TAI_4);
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_OPTION_SHOP_BUA) {
                            switch (select) {
                                case 0:
                                    ShopServiceNew.gI().opendShop(player, "BUA_1H", true);
                                    break;
                                case 1:
                                    ShopServiceNew.gI().opendShop(player, "BUA_8H", true);
                                    break;
                                case 2:
                                    ShopServiceNew.gI().opendShop(player, "BUA_1M", true);
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_START_COMBINE) {
                            switch (player.combineNew.typeCombine) {
                                case CombineServiceNew.NANG_CAP_VAT_PHAM:
                                case CombineServiceNew.NANG_CAP_BONG_TAI:
                                case CombineServiceNew.LAM_PHEP_NHAP_DA:
                                case CombineServiceNew.NHAP_NGOC_RONG:
                                case CombineServiceNew.PHAN_RA_DO_THAN_LINH:
                                case CombineServiceNew.NANG_CAP_SKH_VIP:
                                case CombineServiceNew.MO_CHI_SO_BONG_TAI_2:
                                case CombineServiceNew.MO_CHI_SO_BONG_TAI_3:
                                case CombineServiceNew.MO_CHI_SO_BONG_TAI_4:
                                    if (select == 0) {
                                        CombineServiceNew.gI().startCombine(player);
                                    }
                                    break;
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc whisdots(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 154) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "|7|NÂNG CẤP ĐỒ THIÊN SỨ\n|6| Mang cho ta Công thức + Đá cầu vòng và 999 Mảnh thiên sứ ta sẽ chế tạo đồ Thiên sứ cho ngươi"
                                + "\nĐồ Thiên sứ khi chế tạo sẽ random chỉ số 0-15%"
                                + "\n|2|(Khi mang đủ 5 món Hủy diệt ngươi hãy theo Osin qua Hành tinh ngục tù tìm kiếm Mảnh thiên sứ và săn BOSS Thiên sứ để thu thập Đá cầu vòng)"
                                + "\n|1| Ngươi có muốn nâng cấp không?",
                                "Hướng dẫn", "Nâng Cấp \nĐồ Thiên Sứ", "Shop\n Thiên sứ", "Đóng");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 154) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    NpcService.gI().createTutorial(player, this.avartar, ConstNpc.HUONG_DAN_DO_TS);
                                    break;
                                case 1:
                                    CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.NANG_CAP_DO_TS);
                                    break;
                                case 2:
                                    ShopServiceNew.gI().opendShop(player, "THIEN_SU", true);
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_START_COMBINE) {
                            switch (player.combineNew.typeCombine) {
                                case CombineServiceNew.NANG_CAP_DO_TS:
                                    if (select == 0) {
                                        CombineServiceNew.gI().startCombine(player);
                                    }
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_NANG_CAP_DO_TS) {
                            if (select == 0) {
                                CombineServiceNew.gI().startCombine(player);
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc ruongDo(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {

            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    InventoryServiceNew.gI().sendItemBox(player);
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {

                }
            }
        };
    }

    public static Npc duongtank(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {

            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (mapId == 0 || mapId == 5) {
                        this.createOtherMenu(player, 0, "Ngũ Hàng Sơn x2 Tnsm\nHỗ trợ cho Ae Từ\b|1|Dưới 1tr5 SM dến 100 Tỷ SM?", "OK", "Oéo");
                    }
                    if (mapId == 123) {
                        this.createOtherMenu(player, 0, "Bạn Muốn Quay Trở Lại Làng Ảru?", "OK", "Từ chối");

                    }
                    if (mapId == 122) {
                        this.createOtherMenu(player, 0, "Xia xia thua phùa\b|7|Thí chủ đang có: " + player.NguHanhSonPoint + " điểm ngũ hành sơn\b|1|Thí chủ muốn đổi cải trang x4 chưởng ko?", "Âu kê", "Top Ngu Hanh Son", "No");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    switch (select) {
                        case 0:
                            if (mapId == 48 || mapId == 5 || mapId == 0) {
                                if (player.nPoint.power < 1500000 || player.nPoint.power >= 100000000000L) {
                                    Service.getInstance().sendThongBao(player, "Sức mạnh bạn không phù hợp để qua map!");
                                    return;
                                }
                                ChangeMapService.gI().changeMapInYard(player, 123, -1, -1);
                            }
                            if (mapId == 123) {
                                ChangeMapService.gI().changeMapInYard(player, 0, -1, -1);
                            }
                            if (mapId == 122) {
                                if (select == 0) {
                                    if (player.NguHanhSonPoint >= 500) {
                                        player.NguHanhSonPoint -= 500;
                                        Item item = ItemService.gI().createNewItem((short) (711));
                                        item.itemOptions.add(new Item.ItemOption(49, 80));
                                        item.itemOptions.add(new Item.ItemOption(77, 80));
                                        item.itemOptions.add(new Item.ItemOption(103, 50));
                                        item.itemOptions.add(new Item.ItemOption(207, 0));
                                        item.itemOptions.add(new Item.ItemOption(33, 0));
//                                      
                                        InventoryServiceNew.gI().addItemBag(player, item);
                                        Service.getInstance().sendThongBao(player, "Chúc Mừng Bạn Đổi Vật Phẩm Thành Công !");
                                    } else {
                                        Service.getInstance().sendThongBao(player, "Không đủ điểm, bạn còn " + (500 - player.pointPvp) + " điểm nữa");
                                    }
                                } else if (select == 1) {
                                    Service.gI().showListTop(player, Manager.topSD
                                    );
                                }
                            }
                            break;
                    }
                }
            }
        };
    }

    public static Npc dauThan(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    player.magicTree.openMenuTree();
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    TaskService.gI().checkDoneTaskConfirmMenuNpc(player, this, (byte) select);
                    switch (player.iDMark.getIndexMenu()) {
                        case ConstNpc.MAGIC_TREE_NON_UPGRADE_LEFT_PEA:
                            if (select == 0) {
                                player.magicTree.harvestPea();
                            } else if (select == 1) {
                                if (player.magicTree.level == 10) {
                                    player.magicTree.fastRespawnPea();
                                } else {
                                    player.magicTree.showConfirmUpgradeMagicTree();
                                }
                            } else if (select == 2) {
                                player.magicTree.fastRespawnPea();
                            }
                            break;
                        case ConstNpc.MAGIC_TREE_NON_UPGRADE_FULL_PEA:
                            if (select == 0) {
                                player.magicTree.harvestPea();
                            } else if (select == 1) {
                                player.magicTree.showConfirmUpgradeMagicTree();
                            }
                            break;
                        case ConstNpc.MAGIC_TREE_CONFIRM_UPGRADE:
                            if (select == 0) {
                                player.magicTree.upgradeMagicTree();
                            }
                            break;
                        case ConstNpc.MAGIC_TREE_UPGRADE:
                            if (select == 0) {
                                player.magicTree.fastUpgradeMagicTree();
                            } else if (select == 1) {
                                player.magicTree.showConfirmUnuppgradeMagicTree();
                            }
                            break;
                        case ConstNpc.MAGIC_TREE_CONFIRM_UNUPGRADE:
                            if (select == 0) {
                                player.magicTree.unupgradeMagicTree();
                            }
                            break;
                    }
                }
            }
        };
    }

    public static Npc calick(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            private final byte COUNT_CHANGE = 50;
            private int count;

            private void changeMap() {
                if (this.mapId != 102) {
                    count++;
                    if (this.count >= COUNT_CHANGE) {
                        count = 0;
                        this.map.npcs.remove(this);
                        Map map = MapService.gI().getMapForCalich();
                        this.mapId = map.mapId;
                        this.cx = Util.nextInt(100, map.mapWidth - 100);
                        this.cy = map.yPhysicInTop(this.cx, 0);
                        this.map = map;
                        this.map.npcs.add(this);
                    }
                }
            }

            @Override
            public void openBaseMenu(Player player) {
                player.iDMark.setIndexMenu(ConstNpc.BASE_MENU);
                if (TaskService.gI().getIdTask(player) < ConstTask.TASK_20_0) {
                    Service.getInstance().hideWaitDialog(player);
                    Service.getInstance().sendThongBao(player, "Không thể thực hiện");
                    return;
                }
                if (this.mapId != player.zone.map.mapId) {
                    Service.getInstance().sendThongBao(player, "Calích đã rời khỏi map!");
                    Service.getInstance().hideWaitDialog(player);
                    return;
                }

                if (this.mapId == 102) {
                    this.createOtherMenu(player, ConstNpc.BASE_MENU,
                            "Chào chú, cháu có thể giúp gì?",
                            "Kể\nChuyện", "Quay về\nQuá khứ");
                } else {
                    this.createOtherMenu(player, ConstNpc.BASE_MENU,
                            "Chào chú, cháu có thể giúp gì?", "Kể\nChuyện", "Đi đến\nTương lai", "Từ chối");
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (this.mapId == 102) {
                    if (player.iDMark.isBaseMenu()) {
                        if (select == 0) {
                            //kể chuyện
                            NpcService.gI().createTutorial(player, this.avartar, ConstNpc.CALICK_KE_CHUYEN);
                        } else if (select == 1) {
                            //về quá khứ
                            ChangeMapService.gI().goToQuaKhu(player);
                        }
                    }
                } else if (player.iDMark.isBaseMenu()) {
                    if (select == 0) {
                        //kể chuyện
                        NpcService.gI().createTutorial(player, this.avartar, ConstNpc.CALICK_KE_CHUYEN);
                    } else if (select == 1) {
                        //đến tương lai
//                                    changeMap();
                        if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_20_0) {
                            ChangeMapService.gI().goToTuongLai(player);
                        }
                    } else {
                        Service.getInstance().sendThongBao(player, "Không thể thực hiện");
                    }
                }
            }
        };
    }

    public static Npc jaco(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 24) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "|7| KHU VỰC BOSS NHÂN BẢN"
                                + "\n\n|6|Gô Tên, Calich và Monaka đang gặp chuyện ở hành tinh Potaufeu"
                                + "\nĐánh bại những kẻ giả mạo ngươi sẽ nhận được những phần thưởng hấp dẫn"
                                + "\n|3|Hạ Boss Nhân Bản sẽ nhận được Item Siêu cấp"
                                + "\n|2|Hãy đến đó ngay",
                                "Đến \nPotaufeu");
                    } else if (this.mapId == 139 || this.mapId == 170) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Người muốn trở về?", "Quay về", "Từ chối");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 24) {
                        if (player.iDMark.isBaseMenu()) {
                            if (select == 0) {
                                //đến potaufeu
                                ChangeMapService.gI().goToPotaufeu(player);
                            }
                        }
                    } else if (this.mapId == 139 || this.mapId == 170) {
                        if (player.iDMark.isBaseMenu()) {
                            if (select == 0) {
                                ChangeMapService.gI().changeMapBySpaceShip(player, 0, -1, 354);
                            }
                        }
                    }
                }
            }
        };
    }

public static Npc Potage(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 149) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "tét", "Gọi nhân bản");
                    }
                }
            }
            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                   if (select == 0){
                        BossManager.gI().createBoss(-214);
                   }
                }
            }
        };
    }
    public static Npc npclytieunuong54(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                createOtherMenu(player, 0, "Trò chơi Chọn ai đây đang được diễn ra, nếu bạn tin tưởng mình đang tràn đầy may mắn thì có thể tham gia thử", "Thể lệ", "Chọn\nHồng ngọc");
            }

            @Override
            public void confirmMenu(Player pl, int select) {
                if (canOpenNpc(pl)) {
                    String time = ((ChonAiDay.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) + " giây";
                    if (pl.iDMark.getIndexMenu() == 0) {
                        if (select == 0) {
                            createOtherMenu(pl, ConstNpc.IGNORE_MENU, "Thời gian giữa các giải là 5 phút\nKhi hết giờ, hệ thống sẽ ngẫu nhiên chọn ra 1 người may mắn.\nLưu ý: Số Hồng ngọc nhận được sẽ bị nhà cái lụm đi 5%!Trong quá trình diễn ra khi đặt cược nếu thoát game mọi phần đặt đều sẽ bị hủy", "Ok");
                        } else if (select == 1) {
                            createOtherMenu(pl, 1, "Tổng giải thường: " + ChonAiDay.gI().goldNormar + " Hồng ngọc, cơ hội trúng của bạn là: " + pl.percentGold(0) + "%\nTổng giải VIP: " + ChonAiDay.gI().goldVip + " Hồng ngọc, cơ hội trúng của bạn là: " + pl.percentGold(1) + "%\nSố Hồng ngọc đặt thường: " + pl.goldNormar + "\nSố Hồng ngọc đặt VIP: " + pl.goldVIP + "\n Thời gian còn lại: " + time, "Cập nhập", "Thường\n2000 hồng\nngọc", "VIP\n20000 hồng\nngọc", "Đóng");
                        }
                    } else if (pl.iDMark.getIndexMenu() == 1) {
                        if (((ChonAiDay.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0) {
                            switch (select) {
                                case 0:
                                    createOtherMenu(pl, 1, "Tổng giải thường: " + ChonAiDay.gI().goldNormar + " hồng ngọc, cơ hội trúng của bạn là: " + pl.percentGold(0) + "%\nTổng giải VIP: " + ChonAiDay.gI().goldVip + " hồng ngọc, cơ hội trúng của bạn là: " + pl.percentGold(1) + "%\nSố hồng ngọc đặt thường: " + pl.goldNormar + "\nSố thỏi vàng đặt VIP: " + pl.goldVIP + "\n Thời gian còn lại: " + time, "Cập nhập", "Thường\n2000 hồng\nngọc", "VIP\n200 hồng\nngọc", "Đóng");
                                    break;
                                case 1: {
                                    if (pl.inventory.ruby >= 2000) {
                                        pl.inventory.ruby -= 2000;
                                        Service.getInstance().sendMoney(pl);
                                        pl.goldNormar += 2000;
                                        ChonAiDay.gI().goldNormar += 2000;
                                        ChonAiDay.gI().addPlayerNormar(pl);
                                        createOtherMenu(pl, 1, "Tổng giải thường: " + ChonAiDay.gI().goldNormar + " hồng ngọc, cơ hội trúng của bạn là: " + pl.percentGold(0) + "%\nTổng giải VIP: " + ChonAiDay.gI().goldVip + " hồng ngọc, cơ hội trúng của bạn là: " + pl.percentGold(1) + "%\nSố hồng ngọc đặt thường: " + pl.goldNormar + "\nSố hồng ngọc đặt VIP: " + pl.goldVIP + "\n Thời gian còn lại: " + time, "Cập nhập", "Thường\n2000 hồng\nngọc", "VIP\n20000 hồng\nngọc", "Đóng");
                                    } else {
                                        Service.getInstance().sendThongBao(pl, "Bạn không đủ hồng ngọc");
                                    }
                                }
                                break;
                                case 2: {
                                    if (pl.inventory.ruby >= 20000) {
                                        pl.inventory.ruby -= 20000;
                                        Service.getInstance().sendMoney(pl);
                                        pl.goldVIP += 20000;
                                        ChonAiDay.gI().goldVip += 20000;
                                        ChonAiDay.gI().addPlayerVIP(pl);
                                        createOtherMenu(pl, 1, "Tổng giải thường: " + ChonAiDay.gI().goldNormar + " hồng ngọc, cơ hội trúng của bạn là: " + pl.percentGold(0) + "%\nTổng giải VIP: " + ChonAiDay.gI().goldVip + " hồng ngọc, cơ hội trúng của bạn là: " + pl.percentGold(1) + "%\nSố hồng ngọc đặt thường: " + pl.goldNormar + "\nSố hồng ngọc đặt VIP: " + pl.goldVIP + "\n Thời gian còn lại: " + time, "Cập nhập", "Thường\n2000 hồng\nngọc", "VIP\n20000 hồng\nngọc", "Đóng");
                                    } else {
                                        Service.getInstance().sendThongBao(pl, "Bạn không đủ hồng ngọc");
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc npcChienthan(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (TaskService.gI().getIdTask(player) < ConstTask.TASK_24_0) {
                    // chưa thỏa dkien để nhận nhiệm vụ
                    createOtherMenu(player, 0, "|7|NHẬN CHIẾN THẦN"
                            + "\n\n|5|Ngươi muốn có được Chiến Thần để trở nên mạnh hơn?"
                            + "\nTa không thể để các vị Thần mạnh mẽ đi theo kẻ yếu kém được"
                            + "\n|3|Để nhận được Chiến Thần ngươi cần đạt đến Nhiệm vụ 24 và Phải hoàn thành 10 nhiệm vụ ngoại tuyến mà ta đưa ra !!"
                            + "\n|5|Hãy tiếp tục cố gắng để trở nên mạnh hơn nhé",
                            "Đóng");
                }
                // đã hoàn thành nhiệm vụ thứ...=> trả nhiệm vụ, menu 100
                if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_24_0 && player.chienthan.dalamduoc >= player.chienthan.maxcount && player.chienthan.maxcount != 0 && player.chienthan.tasknow < 10) {
                    createOtherMenu(player, 100, "|7|NHẬN CHIẾN THẦN"
                            + "\n\n|1|Nhiệm vụ hiện tại: " + player.nhiemvuchienthan(player.chienthan.tasknow)
                            + "\n\n|2|Đã hoàn thành: " + player.chienthan.dalamduoc + "/" + player.chienthan.maxcount
                            + "\n|3|Tiến độ: " + player.chienthan.tasknow + "/" + player.chienthan.maxtask + " (Nhiệm vụ)"
                            + "\n|7| Đã xong nhiệm vụ thứ " + player.chienthan.tasknow,
                            "Trả nhiệm vụ", "Đóng");
                }
                // chưa hoàn thành nhiệm vụ, menu 100
                if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_24_0 && player.chienthan.dalamduoc < player.chienthan.maxcount && player.chienthan.maxcount != 0 && player.chienthan.tasknow != 10) {
                    createOtherMenu(player, 100, "|7|NHẬN CHIẾN THẦN"
                            + "\n\n|1|Nhiệm vụ hiện tại: " + player.nhiemvuchienthan(player.chienthan.tasknow)
                            + "\n\n|2|Đã hoàn thành: " + player.chienthan.dalamduoc + "/" + player.chienthan.maxcount
                            + "\n|3|Tiến độ: " + player.chienthan.tasknow + "/" + player.chienthan.maxtask + " (Nhiệm vụ)",
                            "Đóng");
                }
                // Nhận nhiệm vụ tiếp theo
                if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_24_0 && player.chienthan.maxcount == 0 && player.chienthan.tasknow < 10) {
                    createOtherMenu(player, 101, "|7|NHẬN CHIẾN THẦN"
                            + "\n\n|5|Ngươi muốn có được Chiến Thần để trở nên mạnh hơn?"
                            + "\nTa không thể để các vị Thần mạnh mẽ đi theo kẻ yếu kém được"
                            + "\n|3|Để nhận được Chiến Thần ngươi cần đạt đến Nhiệm vụ 24 và Phải hoàn thành 10 nhiệm vụ ngoại tuyến mà ta đưa ra !!"
                            + "\n|5|Hãy tiếp tục cố gắng để trở nên mạnh hơn nhé"
                            + "\n|1|Tiến độ: " + player.chienthan.tasknow + "/" + player.chienthan.maxtask + " (Nhiệm vụ)",
                            "Nhận nhiệm vụ", "Đóng");
                }
                // Hoàn thành hết => Nhận Chiến thần
                if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_24_0 && player.chienthan.dalamduoc >= player.chienthan.maxcount && player.chienthan.tasknow == 10) {// && player.chienthan.dalamduoc >= player.chienthan.maxcount
                    createOtherMenu(player, 104, "|7|NHẬN CHIẾN THẦN"
                            + "\n\n|1|Nhiệm vụ hiện tại: " + player.nhiemvuchienthan(player.chienthan.tasknow)
                            + "\n\n|2|Đã hoàn thành: " + player.chienthan.dalamduoc + "/" + player.chienthan.maxcount
                            + "\n|3|Tiến độ: " + player.chienthan.tasknow + "/" + player.chienthan.maxtask + " (Nhiệm vụ)"
                            + "\n|7|Bạn đã hoàn thành tất cả nhiệm vụ",
                            "Nhận Chiến Thần", "Đóng");
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player != null && player.iDMark.getIndexMenu() == 100) {
                        // đã hoàn thành nhiệm vụ thứ...=> trả nhiệm vụ
                        if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_24_0 && player.chienthan.dalamduoc >= player.chienthan.maxcount && player.chienthan.maxcount != 0) {
                            if (select == 0) {
                                if (player.chienthan.tasknow < 10) {
                                    player.chienthan.dalamduoc = 0;
                                    player.chienthan.maxcount = 0;
                                    if (player.chienthan.tasknow != 0 && player.chienthan.maxcount == 0 && player.chienthan.tasknow < 10) {
                                        createOtherMenu(player, 101, "|7|NHẬN CHIẾN THẦN"
                                                + "\n\n|5|Ngươi muốn có được Chiến Thần để trở nên mạnh hơn?"
                                                + "\nTa không thể để các vị Thần mạnh mẽ đi theo kẻ yếu kém được"
                                                + "\n|3|Để nhận được Chiến Thần ngươi cần đạt đến Nhiệm vụ 24 và Phải hoàn thành 10 nhiệm vụ ngoại tuyến mà ta đưa ra !!"
                                                + "\n|5|Hãy tiếp tục cố gắng để trở nên mạnh hơn nhé"
                                                + "\n|1|Tiến độ: " + player.chienthan.tasknow + "/" + player.chienthan.maxtask + " (Nhiệm vụ)",
                                                "Nhận nhiệm vụ", "Đóng");
                                    }
                                } else if (player.chienthan.tasknow == 10 && player.chienthan.dalamduoc >= player.chienthan.maxcount) { //&& player.chienthan.dalamduoc >= player.chienthan.maxcount
                                    createOtherMenu(player, 104, "|7|NHẬN CHIẾN THẦN"
                                            + "\n\n|1|Nhiệm vụ hiện tại: " + player.nhiemvuchienthan(player.chienthan.tasknow)
                                            + "\n\n|2|Đã hoàn thành: " + player.chienthan.dalamduoc + "/" + player.chienthan.maxcount
                                            + "\n|3|Tiến độ: " + player.chienthan.tasknow + "/" + player.chienthan.maxtask + " (Nhiệm vụ)"
                                            + "\n|7|Đã hoàn thành tất cả nhiệm vụ",
                                            "Nhận Chiến Thần", "Đóng");
                                }
                            }
                        }
                    } else if (player != null && player.iDMark.getIndexMenu() == 101) {
                        // Nhận nhiệm vụ tiếp theo
                        if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_24_0) {
                            if (select == 0) {
                                player.chienthan.tasknow++;
                                if (player.chienthan.tasknow != 0 && player.chienthan.tasknow != player.chienthan.maxcount && player.chienthan.tasknow <= 10) {
                                    createOtherMenu(player, 103, "|7|NHẬN CHIẾN THẦN"
                                            + "\n\n|1|Nhiệm vụ hiện tại: " + player.nhiemvuchienthan(player.chienthan.tasknow)
                                            + "\n\n|2|Đã hoàn thành: " + player.chienthan.dalamduoc + "/" + player.chienthan.maxcount
                                            + "\n|3|Tiến độ: " + player.chienthan.tasknow + "/" + player.chienthan.maxtask + " (Nhiệm vụ)",
                                            "Đóng");
                                } else if (player.chienthan.tasknow == 10 && player.chienthan.dalamduoc >= player.chienthan.maxcount) {// && player.chienthan.dalamduoc >= player.chienthan.maxcount
                                    createOtherMenu(player, 104, "|7|NHẬN CHIẾN THẦN"
                                            + "\n\n|1|Nhiệm vụ hiện tại: " + player.nhiemvuchienthan(player.chienthan.tasknow)
                                            + "\n\n|2|Đã hoàn thành: " + player.chienthan.dalamduoc + "/" + player.chienthan.maxcount
                                            + "\n|3|Tiến độ: " + player.chienthan.tasknow + "/" + player.chienthan.maxtask + " (Nhiệm vụ)"
                                            + "\n|7|Đã hoàn thành tất cả nhiệm vụ",
                                            "Nhận Chiến Thần", "Đóng");
                                }
                            }
                        }
                    } else if (player != null && player.iDMark.getIndexMenu() == 104) {
                        if (select == 0) {
                            if (player.chienthan.donechienthan == 0) {
                                Input.gI().TAOPET(player);
                            } else {
                                this.npcChat(player, "|7|Bạn đã nhận Chiến Thần rồi mà !!!");
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc minuong(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
//            public void Npcchat(Player player) {
//                String[] chat = {
//                    "Giúp Ta đẫn Bé Quỳnh Về Nha",
//                    "Em buông tay anh vì lí do gì ",
//                    "Người hãy nói đi , đừng Bắt Anh phải nghĩ suy"
//                };
//                Timer timer = new Timer();
//                timer.scheduleAtFixedRate(new TimerTask() {
//                    int index = 0;
//
//                    @Override
//                    public void run() {
//                        npcChat(player, chat[index]);
//                        index = (index + 1) % chat.length;
//                    }
//                }, 6000, 6000);
//            }

            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    createOtherMenu(player, ConstNpc.BASE_MENU,
                            "|7|HỘ TỐNG BUNMA NGOẠI QUỐC"
                            + "\n\n|1|BUNMA đang muốn đi kham phá vùng đất ngọc rồng ngươi hãy giúp ta đưa nàng đến nơi bunma cần \n Ta trao thưởng quà Hậu hĩnh !!"
                            + "\n\n|2|Hôm nay đã hộ tống: " + player.taixiu.hotong + " lần",
                            "Hướng dẫn\n Hộ Tống Bunma", "Hộ Tống", "Shop Đổi Xu", "Mua Xu");//, " Shop Xu" ,"Đóng")
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
//                Npcchat(player);
                if (canOpenNpc(player)) {
                    if (this.mapId == 42) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    this.createOtherMenu(player, 1, "|2|Gặp Npc Mị Nương: Chọn Hộ Tống Rồi Dắt BUNMA đến Vị Trí được chỉ định\n"
                                            + "Phần quà Random 30 Thỏi vàng và Random 1-5 Xu hộ tống. Phí hộ tống là 1k Ngọc Hồng\n|7|Mỗi ngày chỉ được Hộ tống tối đa 2 lần", "Hiểu rồi");
                                    break;
                                case 1:
                                    if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_20_0) {
                                        this.createOtherMenu(player, 12345,
                                                "|7|Bạn có chắc muốn dùng 1000 Hồng ngọc để Hộ tống Bunma đến điểm đích để nhận được phần quà hấp dẫn không?", "Đồng ý", "Từ chối");
                                    } else {
                                        this.npcChat(player, "|7|Vui lòng làm đến nhiệm vụ Gặp Tiểu đội sát thủ");
                                    }
                                    break;
                                case 2:
                                    ShopServiceNew.gI().opendShop(player, "MI NUONG", true);
                                    break;
                                case 3:
                                    this.createOtherMenu(player, 997,
                                            "|7|MUA XU"
                                            + "\n\n|1|Bạn đang có: " + Util.format(player.getSession().vnd) + " vnd"
                                            + "\n\n|2|Giá trị quy đổi như sau\n 1000vnđ = 1 Xu"
                                            + "\n\n|5|Bạn có Muốn Mua Xu hộ tống?"
                                            + "\n|6|------------~o~------------"
                                            + "\n|7|Lưu ý phải có Xu hộ tống trong hành trang mới có thể mua\nQuy đổi 1 lần không quá 10.000 Xu",
                                            "Đổi Xu", "Từ chối");
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == 997) {
                            switch (select) {
                                case 0:
                                    Input.gI().DoixuHotong(player);
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == 12345) {
                            switch (select) {
                                case 0:
                                    if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_20_0) {
                                        Boss oldDuongTank = BossManager.gI().getBossById(Util.createIdDuongTank((int) player.id));
                                        if (oldDuongTank != null) {
                                            this.npcChat(player, "|7|Bunma ả rập xê út đang được hộ tống " + oldDuongTank.zone.zoneId);
                                        } else if (player.inventory.ruby < 1000) {
                                            this.npcChat(player, "|7|Nhà ngươi không đủ 1k Hồng Ngọc");
                                        } else if (player.taixiu.hotong >= 2) {
                                            this.npcChat(player, "|7|Mỗi ngày chỉ được Hộ tống tối đa 2 lần");
                                        } else {
                                            BossData bossDataClone = new BossData(
                                                    "Bunma ả rập xê út được " + player.name + " hộ tống",
                                                    (byte) 2,
                                                    new short[]{1396, 1397, 1398, 48, -1, -1},
                                                    100000,
                                                    new double[]{player.nPoint.hpMax * 2},
                                                    new int[]{103},
                                                    new int[][]{
                                                        {Skill.TAI_TAO_NANG_LUONG, 7, 15000}},
                                                    new String[]{}, //text chat 1
                                                    new String[]{}, //text chat 2
                                                    new String[]{}, //text chat 3
                                                    60
                                            );
                                            try {
                                                MiNuong dt = new MiNuong(Util.createIdDuongTank((int) player.id), bossDataClone, player.zone, player.location.x - 20, player.location.y);
                                                dt.playerTarger = player;
                                                int[] mapcuoi = {6, 29, 30, 4, 5, 27, 28};
                                                dt.mapHoTong = mapcuoi[Util.nextInt(mapcuoi.length)];
                                                player.haveBeQuynh = true;
                                                player.lastTimeHoTong = System.currentTimeMillis();
                                            } catch (Exception e) {
                                            }
                                            //trừ vàng khi gọi boss
                                            player.inventory.ruby -= 1000;
                                            Service.getInstance().sendMoney(player);
                                            break;
                                        }
                                    } else {
                                        this.npcChat(player, "|7|Vui lòng làm đến nhiệm vụ Găp Tiểu đội sát thủ");
                                    }
                                    break;
                            }
                        }
                    }
                }
            }
        };
    }

//    public static Npc meothantai(int mapId, int status, int cx, int cy, int tempId, int avartar) {
//        return new Npc(mapId, status, cx, cy, tempId, avartar) {
//            @Override
//            public void openBaseMenu(Player player) {
//                createOtherMenu(player, 0, "\b|8|Trò chơi Tài Xỉu đang được diễn ra\n\n|6|Thử vận may của bạn với trò chơi Tài Xỉu! Đặt cược và dự đoán đúng"
//                        + "\n kết quả, bạn sẽ được nhận thưởng lớn. Hãy tham gia ngay và\n cùng trải nghiệm sự hồi hộp, thú vị trong trò chơi này!"
//                        + "\n\n|7|(Điều kiện tham gia : Nhiệm vụ 24)\n\n|2|Đặt tối thiểu: 1.000 Hồng ngọc\n Tối đa: 100.000 Hồng ngọc"
//                        + "\n\n|7| Lưu ý : Thoát game khi chốt Kết quả sẽ MẤT Tiền cược và Tiền thưởng", "Thể lệ", "Tham gia");
//            }
//
//            @Override
//            public void confirmMenu(Player pl, int select) {
//                if (canOpenNpc(pl)) {
//                    String time = ((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) + " giây";
//                    if (pl.iDMark.getIndexMenu() == 0) {
//                        if (select == 0) {
//                            createOtherMenu(pl, ConstNpc.IGNORE_MENU, "|5|Có 2 nhà cái Tài và Xĩu, bạn chỉ được chọn 1 nhà để tham gia"
//                                    + "\n\n|6|Sau khi kết thúc thời gian đặt cược. Hệ thống sẽ tung xí ngầu để biết kết quả Tài Xỉu"
//                                    + "\n\nNếu Tổng số 3 con xí ngầu <=10 : XỈU\nNếu Tổng số 3 con xí ngầu >10 : TÀI\nNếu 3 Xí ngầu cùng 1 số : TAM HOA (Nhà cái lụm hết)"
//                                    + "\n\n|7|Lưu ý: Số Hồng ngọc nhận được sẽ bị nhà cái lụm đi 20%. Trong quá trình diễn ra khi đặt cược nếu thoát game trong lúc phát thưởng phần quà sẽ bị HỦY", "Ok");
//                        } else if (select == 1) {
//                            if (TaiXiu.gI().baotri == false){
//                            if(pl.goldTai==0 && pl.goldXiu==0){
//                                createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z +
//                                        "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                        + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time, "Cập nhập", "Theo TÀI", "Theo XỈU", "Đóng");
//                            } 
//                            else if(pl.goldTai > 0){
//                                createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z +
//                                        "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                        + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time +"\n\n|7|Bạn đã cược Tài : " + Util.format(pl.goldTai) + " Hồng ngọc", "Cập nhập", "Đóng");
//                            } 
//                            else {
//                                createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z +
//                                        "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                        + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time +"\n\n|7|Bạn đã cược Xỉu : " + Util.format(pl.goldXiu) + " Hồng ngọc", "Cập nhập", "Đóng");
//                                }
//                            } else {
//                                if(pl.goldTai==0 && pl.goldXiu==0){
//                                    createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z +
//                                            "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time + "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
//                                } else if(pl.goldTai > 0){
//                                    createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z +
//                                            "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time +"\n\n|7|Bạn đã cược Tài : " + Util.format(pl.goldTai) + " Hồng ngọc" + "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
//                                } else {
//                                    createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI-XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z +
//                                            "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time +"\n\n|7|Bạn đã cược Xỉu : " + Util.format(pl.goldXiu) + " Hồng ngọc" + "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
//                                }
//                            }
//                        }
//                    } else if (pl.iDMark.getIndexMenu() == 1) {
//                        if (((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && pl.goldTai==0 && pl.goldXiu==0 && TaiXiu.gI().baotri == false) {
//                            switch (select) {
//                                case 0:
//                                    createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z +
//                                            "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time, "Cập nhập", "Theo TÀI", "Theo XỈU", "Đóng");
//                                    break;
//                                case 1:
//                                    if (TaskService.gI().getIdTask(pl) >= ConstTask.TASK_24_0){
//                                        Input.gI().TAI_taixiu(pl);
//                                    } else {
//                                        Service.getInstance().sendThongBao(pl, "Bạn chưa đủ điều kiện để chơi");
//                                    }
//                                    break;
//                                case 2:
//                                    if (TaskService.gI().getIdTask(pl) >= ConstTask.TASK_24_0){
//                                        Input.gI().XIU_taixiu(pl);
//                                    } else {
//                                        Service.getInstance().sendThongBao(pl, "Bạn chưa đủ điều kiện để chơi");
//                                    }
//                                    break;
//                            }
//                        } else if(((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && pl.goldTai > 0 && TaiXiu.gI().baotri == false){
//                            switch (select) {
//                                case 0:
//                                    createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z + 
//                                            "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time+"\n\n|7|Bạn đã cược Tài : " + Util.format(pl.goldTai) + " Hồng ngọc", "Cập nhập", "Đóng");
//                                    break;
//                            }
//                        }else if(((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && pl.goldXiu > 0 && TaiXiu.gI().baotri == false){
//                            switch (select) {
//                                case 0:
//                                    createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z + 
//                                            "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time+"\n\n|7|Bạn đã cược Xỉu : " + Util.format(pl.goldXiu) + " Hồng ngọc", "Cập nhập", "Đóng");
//                                    break;
//                            }
//                        }else if(((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && pl.goldTai > 0 && TaiXiu.gI().baotri == true){
//                            switch (select) {
//                                case 0:
//                                    createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z + 
//                                            "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time+"\n\n|7|Bạn đã cược Tài : " + Util.format(pl.goldTai) + " Hồng ngọc" + "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
//                                    break;
//                            }
//                        }else if(((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && pl.goldXiu > 0 && TaiXiu.gI().baotri == true){
//                            switch (select) {
//                                case 0:
//                                    createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z + 
//                                            "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time+"\n\n|7|Bạn đã cược Xỉu : " + Util.format(pl.goldXiu) + " Hồng ngọc" + "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
//                                    break;
//                            }
//                        }else if(((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && pl.goldXiu == 0 && pl.goldTai == 0 && TaiXiu.gI().baotri == true){
//                            switch (select) {
//                                case 0:
//                                    createOtherMenu(pl, 1, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " +  TaiXiu.gI().y + " : " +  TaiXiu.gI().z + 
//                                            "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
//                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time+ "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
//                                    break;
//                            }
//                        }
//                    }
//                }
//            }
//        };
//    }

    public static Npc thuongDe(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {

            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 45) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Con muốn làm gì nào", "Đến Kaio");
                    }
//                    if (this.mapId == 0) {
//                        this.createOtherMenu(player, 0,
//                                "Con muốn gì nào?\nCon đang còn : " + player.pointPvp + " điểm PvP Point", "Đến DHVT", "Đổi Cải trang sự kiên", "Top PVP");
//                    }
                    if (this.mapId == 129 || this.mapId == 141) {
                        this.createOtherMenu(player, 0,
                                "Con muốn gì nào?", "Quay về");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
//                    if (this.mapId == 0) {
//                        if (player.iDMark.getIndexMenu() == 0) { // 
//                            switch (select) {
//                                case 0:
//                                    ChangeMapService.gI().changeMapBySpaceShip(player, 129, -1, 354);
//                                    Service.getInstance().changeFlag(player, Util.nextInt(8));
//                                    break; // qua dhvt
//                                case 1:  // 
//                                    this.createOtherMenu(player, 1,
//                                            "Bạn có muốn đổi 500 điểm PVP lấy \n|6|Cải trang Mèo Kid Lân với tất cả chỉ số là 80%\n ", "Ok", "Tu choi");
//                                    // bat menu doi item
//                                    break;
//
//                                case 2:  // 
//                                    Util.showListTop(player, (byte) 3);
//                                    // mo top pvp
//                                    break;
//
//                            }
//                        }
//                        if (player.iDMark.getIndexMenu() == 1) { // action doi item
//                            switch (select) {
//                                case 0: // trade
//                                    if (player.pointPvp >= 500) {
//                                        player.pointPvp -= 500;
//                                        Item item = ItemService.gI().createNewItem((short) (1104));
//                                        item.itemOptions.add(new Item.ItemOption(49, 80));
//                                        item.itemOptions.add(new Item.ItemOption(77, 80));
//                                        item.itemOptions.add(new Item.ItemOption(103, 50));
//                                        item.itemOptions.add(new Item.ItemOption(207, 0));
//                                        item.itemOptions.add(new Item.ItemOption(33, 0));
////                                      
//                                        InventoryServiceNew.gI().addItemBag(player, item);
//                                        Service.getInstance().sendThongBao(player, "Chúc Mừng Bạn Đổi Cải Trang Thành Công !");
//                                    } else {
//                                        Service.getInstance().sendThongBao(player, "Không đủ điểm bạn còn " + (500 - player.pointPvp) + " Điểm nữa");
//                                    }
//                                    break;
//                            }
//                        }
//                    }
                    if (this.mapId == 129) {
                        switch (select) {
                            case 0: // quay ve
                                ChangeMapService.gI().changeMapBySpaceShip(player, 0, -1, 354);
                                break;
                        }
                    }
                    if (this.mapId == 141) {
                        switch (select) {
                            case 0: // quay ve
                                ChangeMapService.gI().changeMapBySpaceShip(player, 48, -1, 354);
                                break;
                        }
                    }
                    if (this.mapId == 45) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 48, -1, 354);
                                    break;
//                                case 1:
//                                    this.createOtherMenu(player, ConstNpc.MENU_CHOOSE_LUCKY_ROUND,
//                                            "Con muốn làm gì nào?", "Quay bằng\nvàng",
//                                            "Rương phụ\n("
//                                            + (player.inventory.itemsBoxCrackBall.size()
//                                            - InventoryServiceNew.gI().getCountEmptyListItem(player.inventory.itemsBoxCrackBall))
//                                            + " món)",
//                                            "Xóa hết\ntrong rương", "Đóng");
//                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_CHOOSE_LUCKY_ROUND) {
                            switch (select) {
                                case 0:
                                    LuckyRound.gI().openCrackBallUI(player, LuckyRound.USING_GOLD);
                                    break;
                                case 1:
                                    ShopServiceNew.gI().opendShop(player, "ITEMS_LUCKY_ROUND", true);
                                    break;
                                case 2:
                                    NpcService.gI().createMenuConMeo(player,
                                            ConstNpc.CONFIRM_REMOVE_ALL_ITEM_LUCKY_ROUND, this.avartar,
                                            "Con có chắc muốn xóa hết vật phẩm trong rương phụ? Sau khi xóa "
                                            + "sẽ không thể khôi phục!",
                                            "Đồng ý", "Hủy bỏ");
                                    break;
                            }
                        }
                    }

                }
            }
        };
    }

    public static Npc thanVuTru(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 48 || this.mapId == 0) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Con muốn làm gì nào", "Di chuyển");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 48 || this.mapId == 0) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    this.createOtherMenu(player, ConstNpc.MENU_DI_CHUYEN,
                                            "Con muốn đi đâu?", "Về\nthần điện", "Thánh địa\nKaio", "Con\nđường\nrắn độc", "Từ chối");
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_DI_CHUYEN) {
                            switch (select) {
                                case 0:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 45, -1, 354);
                                    break;
                                case 1:
                                    ChangeMapService.gI().changeMap(player, 50, -1, 318, 336);
                                    break;
                                case 2:
                                    ChangeMapService.gI().changeMap(player, 141, -1, 318, 336);//con đường rắn độc
                                    break;
                            }
                        }
                    }
                }
            }

        };
    }

    public static Npc zamasu(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 52) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Đề đến khu săn Đệ tử Super Broly Huyền thoại bạn cần Đạt các điều kiện:\n|7|1.Mang Cải trang DCTT\n2.Sức mạnh trên 300ty\n3.Có Đệ tử Berus\n4.Đã qua nhiệm vụ 24", "Di chuyển");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 5) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    this.createOtherMenu(player, ConstNpc.MENU_DI_CHUYEN,
                                            "Cùng chiền boss nhận Đệ tử Super Broly Huyền thoại nào?", "Đến\nChiến trường");
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_DI_CHUYEN) {
                            switch (select) {
                                case 0:
                                    if (player.isPl() && player.getSession().player.nPoint.power >= 300000000000L && player.inventory.haveOption(player.inventory.itemsBody, 5, 33) && (player.pet.typePet >= 2) && TaskService.gI().getIdTask(player) > ConstTask.TASK_24_0) {
                                        ChangeMapService.gI().changeMap(player, 169, -1, 318, 336);//con đường rắn độc
                                    } else {
                                        this.npcChat(player, "Bạn chưa đủ điều kiện để vào");
                                    }
                            }
                        }
                    }
                }

            }
        };
    }

    public static Npc kibit(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 50) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Ta có thể giúp gì cho ngươi ?",
                                "Đến\nKaio", "Từ chối");
                    }
                    if (this.mapId == 114) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Ta có thể giúp gì cho ngươi ?",
                                "Từ chối");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 50) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    ChangeMapService.gI().changeMap(player, 48, -1, 354, 240);
                                    break;
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc giuma(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 6 || this.mapId == 25 || this.mapId == 26) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Gô Tên, Calich và Monaka đang gặp chuyện ở hành tinh Potaufeu \n Hãy đến đó ngay", "Đến \nPotaufeu");
                    } else if (this.mapId == 139) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Người muốn trở về?", "Quay về", "Từ chối");
                    }//lãnh địa bang
                    else if (this.mapId == 153) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Theo ta, ta sẽ đưa ngươi đến Khu vực Thánh địa\nNơi đây ngươi sẽ truy tìm mảnh bông tai cấp 2 và Hồn bông tai để mở chỉ số Bông tai Cấp 3."
                                + "\n|7|Ngươi có muốn đến đó không?", "Đến\nThánh địa", "Từ chối");
                    } else if (this.mapId == 156) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Người muốn trở về?", "Quay về", "Từ chối");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 24 || this.mapId == 25 || this.mapId == 26) {
                        if (player.iDMark.isBaseMenu()) {
                            if (select == 0) {
                                //đến potaufeu
                                ChangeMapService.gI().goToPotaufeu(player);
                            }
                        }
                    } else if (this.mapId == 139) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                //về trạm vũ trụ
                                case 0:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 24 + player.gender, -1, -1);
                                    break;
                            }
                        }
                    } else if (this.mapId == 153) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                //lãnh địa bang
                                case 0:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 156, -1, -1);
                                    break;
                            }
                        }
                    } else if (this.mapId == 156) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                //về trạm vũ trụ
                                case 0:
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 21 + player.gender, -1, -1);
                                    break;
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc osin(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 50) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Ta có thể giúp gì cho ngươi ?",
                                "Đến\nKaio", "Đến\nhành tinh\nBill", "Từ chối");
                    } else if (this.mapId == 154) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Ta có thể giúp gì cho ngươi ?"
                                + "\n|3| Để đến được Hành tinh ngục tù và farm quái ra Mảnh Thiên sứ\n Yêu cầu : Mang 5 món Hủy diệt lên người",
                                "Về thánh địa", "Đến\nhành tinh\nngục tù", "Từ chối");
                    } else if (this.mapId == 155) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Ta có thể giúp gì cho ngươi ?",
                                "Quay về", "Từ chối");
                    } else if (this.mapId == 52) {
                        try {
                            MapMaBu.gI().setTimeJoinMapMaBu();
                            if (this.mapId == 52) {
                                long now = System.currentTimeMillis();
                                if (now > MapMaBu.TIME_OPEN_MABU && now < MapMaBu.TIME_CLOSE_MABU) {
                                    this.createOtherMenu(player, ConstNpc.MENU_OPEN_MMB, "Đại chiến Ma Bư đã mở, "
                                            + "ngươi có muốn tham gia không?",
                                            "Hướng dẫn\nthêm", "Tham gia", "Từ chối");
                                } else {
                                    this.createOtherMenu(player, ConstNpc.MENU_NOT_OPEN_MMB,
                                            "Ta có thể giúp gì cho ngươi?", "Hướng dẫn", "Từ chối");
                                }

                            }
                        } catch (Exception ex) {
                            Logger.error("Lỗi mở menu osin");
                        }

                    } else if (this.mapId >= 114 && this.mapId < 120 && this.mapId != 116) {
                        if (player.fightMabu.pointMabu >= player.fightMabu.POINT_MAX) {
                            this.createOtherMenu(player, ConstNpc.GO_UPSTAIRS_MENU, "Ta có thể giúp gì cho ngươi ?",
                                    "Lên Tầng!", "Quay về", "Từ chối");
                        } else {
                            this.createOtherMenu(player, ConstNpc.BASE_MENU, "Ta có thể giúp gì cho ngươi ?",
                                    "Quay về", "Từ chối");
                        }
                    } else if (this.mapId == 120 || this.mapId == 170) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Ta có thể giúp gì cho ngươi ?",
                                "Quay về", "Từ chối");
                    } else {
                        super.openBaseMenu(player);
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 50) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    ChangeMapService.gI().changeMap(player, 48, -1, 354, 240);
                                    break;
                                case 1:
                                    ChangeMapService.gI().changeMap(player, 154, -1, 200, 312);
                                    break;
                            }
                        }
                    } else if (this.mapId == 154) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    ChangeMapService.gI().changeMap(player, 50, -1, 318, 336);
                                    break;
                                case 1:
                                    if (player.setClothes.setDHD == 5) {
                                        ChangeMapService.gI().changeMap(player, 155, -1, 111, 792);
                                    } else {
                                        this.createOtherMenu(player, ConstNpc.IGNORE_MENU, "Yêu cầu mang đủ 5 món đồ Hủy diệt", "Đóng");
                                    }
                                    break;
                            }
                        }
                    } else if (this.mapId == 155) {
                        if (player.iDMark.isBaseMenu()) {
                            if (select == 0) {
                                ChangeMapService.gI().changeMap(player, 154, -1, 200, 312);
                            }
                        }
                    } else if (this.mapId == 52) {
                        switch (player.iDMark.getIndexMenu()) {
                            case ConstNpc.MENU_REWARD_MMB:
                                break;
                            case ConstNpc.MENU_OPEN_MMB:
                                if (select == 0) {
                                    NpcService.gI().createTutorial(player, this.avartar, ConstNpc.HUONG_DAN_MAP_MA_BU);
                                } else if (select == 1) {
//                                    if (!player.getSession().actived) {
//                                        Service.getInstance().sendThongBao(player, "Vui lòng kích hoạt tài khoản để sử dụng chức năng này");
//                                    } else
                                    ChangeMapService.gI().changeMap(player, 114, -1, 318, 336);
                                }
                                break;
                            case ConstNpc.MENU_NOT_OPEN_BDW:
                                if (select == 0) {
                                    NpcService.gI().createTutorial(player, this.avartar, ConstNpc.HUONG_DAN_MAP_MA_BU);
                                }
                                break;
                        }
                    } else if (this.mapId >= 114 && this.mapId < 120 && this.mapId != 116) {
                        if (player.iDMark.getIndexMenu() == ConstNpc.GO_UPSTAIRS_MENU) {
                            if (select == 0) {
                                player.fightMabu.clear();
                                ChangeMapService.gI().changeMap(player, this.map.mapIdNextMabu((short) this.mapId), -1, this.cx, this.cy);
                            } else if (select == 1) {
                                ChangeMapService.gI().changeMapBySpaceShip(player, player.gender + 21, 0, -1);
                            }
                        } else {
                            if (select == 0) {
                                ChangeMapService.gI().changeMapBySpaceShip(player, player.gender + 21, 0, -1);
                            }
                        }
                    } else if (this.mapId == 120 || this.mapId == 170) {
                        if (player.iDMark.getIndexMenu() == ConstNpc.BASE_MENU) {
                            if (select == 0) {
                                ChangeMapService.gI().changeMapBySpaceShip(player, player.gender + 21, 0, -1);
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc docNhan(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (player.clan == null) {
                        this.createOtherMenu(player, ConstNpc.IGNORE_MENU,
                                "Chỉ tiếp các bang hội, miễn tiếp khách vãng lai", "Đóng");
                        return;
                    }
                    if (player.clan.doanhTrai_haveGone) {
                        createOtherMenu(player, ConstNpc.IGNORE_MENU,
                                "Ta đã thả ngọc rồng ở tất cả các map,mau đi nhặt đi. Hẹn ngươi quay lại vào ngày mai", "OK");
                        return;
                    }

                    boolean flag = true;
                    for (Mob mob : player.zone.mobs) {
                        if (!mob.isDie()) {
                            flag = false;
                        }
                    }
                    for (Player boss : player.zone.getBosses()) {
                        if (!boss.isDie()) {
                            flag = false;
                        }
                    }

//                    if (flag) {
//                        player.clan.doanhTrai_haveGone = true;
//                        player.clan.doanhTrai.setLastTimeOpen(System.currentTimeMillis() + 290_000);
//                        player.clan.doanhTrai.DropNgocRong();
//                        for (Player pl : player.clan.membersInGame) {
//                            ItemTimeService.gI().sendTextTime(pl, (byte) 0, "Doanh trại độc nhãn sắp kết thúc : ", 300);
//                        }
//                        player.clan.doanhTrai.timePickDragonBall = true;
//                        createOtherMenu(player, ConstNpc.IGNORE_MENU,
//                                "Ta đã thả ngọc rồng ở tất cả các map,mau đi nhặt đi. Hẹn ngươi quay lại vào ngày mai", "OK");
//                    } else {
//                        createOtherMenu(player, ConstNpc.IGNORE_MENU,
//                                "Hãy tiêu diệt hết quái và boss trong map", "OK");
//                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    switch (player.iDMark.getIndexMenu()) {
                        case ConstNpc.MENU_JOIN_DOANH_TRAI:
                            if (select == 0) {
                                DoanhTraiService.gI().joinDoanhTrai(player);
                            } else if (select == 2) {
                                NpcService.gI().createTutorial(player, this.avartar, ConstNpc.HUONG_DAN_DOANH_TRAI);
                            }
                            break;
                        case ConstNpc.IGNORE_MENU:
                            if (select == 1) {
                                NpcService.gI().createTutorial(player, this.avartar, ConstNpc.HUONG_DAN_DOANH_TRAI);
                            }
                            break;
                    }
                }
            }
        };
    }

    public static Npc linhCanh(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (player.clan == null) {
                        this.createOtherMenu(player, ConstNpc.IGNORE_MENU,
                                "Chỉ tiếp các bang hội, miễn tiếp khách vãng lai", "Đóng");
                        return;
                    }
                    if (player.clan.getMembers().size() < DoanhTrai.N_PLAYER_CLAN) {
                        this.createOtherMenu(player, ConstNpc.IGNORE_MENU,
                                "Bang hội phải có ít nhất 5 thành viên mới có thể mở", "Đóng");
                        return;
                    }
                    if (player.clan.doanhTrai != null && player.clanMember.getNumDateFromJoinTimeToToday() >= 2 && !player.clan.doanhTrai_haveGone) {
                        createOtherMenu(player, ConstNpc.MENU_JOIN_DOANH_TRAI,
                                "Bang hội của ngươi đang đánh trại độc nhãn\n"
                                + "Thời gian còn lại là "
                                + TimeUtil.getMinLeft(player.clan.doanhTrai.getLastTimeOpen(), DoanhTrai.TIME_DOANH_TRAI / 1000)
                                + " Phút" + ". Ngươi có muốn tham gia không?",
                                "Tham gia", "Không", "Hướng\ndẫn\nthêm");
                        return;
                    }
                    int nPlSameClan = 0;
                    for (Player pl : player.zone.getPlayers()) {
                        if (!pl.equals(player) && pl.clan != null
                                && pl.clan.equals(player.clan) && pl.location.x >= 1285
                                && pl.location.x <= 1645) {
                            nPlSameClan++;
                        }
                    }
                    if (nPlSameClan < DoanhTrai.N_PLAYER_MAP) {
                        createOtherMenu(player, ConstNpc.IGNORE_MENU,
                                "Ngươi phải có ít nhất " + DoanhTrai.N_PLAYER_MAP + " đồng đội cùng bang đứng gần mới có thể\nvào\n"
                                + "tuy nhiên ta khuyên ngươi nên đi cùng với 3-4 người để khỏi chết.\n"
                                + "Hahaha.", "OK", "Hướng\ndẫn\nthêm");
                        return;
                    }
                    if (player.clanMember.getNumDateFromJoinTimeToToday() < 2 || (player.clan.doanhTrai != null && player.clanMember.getNumDateFromJoinTimeToToday() < 2)) {
                        createOtherMenu(player, ConstNpc.IGNORE_MENU,
                                "Doanh trại chỉ cho phép những người ở trong bang trên 2 ngày. Hẹn ngươi quay lại vào lúc khác",
                                "OK", "Hướng\ndẫn\nthêm");
                        return;
                    }

                    if (!player.clan.doanhTrai_haveGone) {
                        player.clan.doanhTrai_haveGone = (new java.sql.Date(player.clan.doanhTrai_lastTimeOpen)).getDay() == (new java.sql.Date(System.currentTimeMillis())).getDay();
                    }
                    if (player.clan.doanhTrai_haveGone) {
                        createOtherMenu(player, ConstNpc.IGNORE_MENU,
                                "Bang hội của ngươi đã đi trại lúc " + TimeUtil.formatTime(player.clan.doanhTrai_lastTimeOpen, "HH:mm:ss") + " hôm nay. Người mở\n"
                                + "(" + player.clan.doanhTrai_playerOpen + "). Hẹn ngươi quay lại vào ngày mai", "OK", "Hướng\ndẫn\nthêm");
                        return;
                    }
                    createOtherMenu(player, ConstNpc.MENU_JOIN_DOANH_TRAI,
                            "Hôm nay bang hội của ngươi chưa vào trại lần nào. Ngươi có muốn vào\n"
                            + "không?\nĐể vào, ta khuyên ngươi nên có 3-4 người cùng bang đi cùng",
                            "Vào\n(miễn phí)", "Không", "Hướng\ndẫn\nthêm");
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    switch (player.iDMark.getIndexMenu()) {
                        case ConstNpc.MENU_JOIN_DOANH_TRAI:
                            if (select == 0) {
                                if (player.clan.doanhTrai != null && TimeUtil.getMinLeft(player.clan.doanhTrai.getLastTimeOpen(), DoanhTrai.TIME_DOANH_TRAI / 1000) == 0) {
                                    Service.getInstance().sendThongBao(player, "Hết 30p gòi, đợi mai đê !!!!");
                                } else if (player.clan.doanhTrai == null) {
                                    DoanhTraiService.gI().joinDoanhTrai(player);
                                } else if (player.clan.doanhTrai != null && TimeUtil.getMinLeft(player.clan.doanhTrai.getLastTimeOpen(), DoanhTrai.TIME_DOANH_TRAI / 1000) > 0) {
                                    ChangeMapService.gI().changeMapInYard(player, 53, -1, 60);
                                    ItemTimeService.gI().sendTextDoanhTrai(player);

                                }
                            } else if (select == 2) {
                                NpcService.gI().createTutorial(player, this.avartar, ConstNpc.HUONG_DAN_DOANH_TRAI);
                            }
                            break;
                        case ConstNpc.IGNORE_MENU:
                            if (select == 1) {
                                NpcService.gI().createTutorial(player, this.avartar, ConstNpc.HUONG_DAN_DOANH_TRAI);
                            }
                            break;
                    }
                }
            }
        };
    }

    public static Npc quaTrung(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {

            private final int COST_AP_TRUNG_NHANH = 1000000000;

            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    player.mabuEgg.sendMabuEgg();
                    if (player.mabuEgg.getSecondDone() != 0) {
                        this.createOtherMenu(player, ConstNpc.CAN_NOT_OPEN_EGG, "Bư bư bư...",
                                "Hủy bỏ\ntrứng", "Ấp nhanh\n" + Util.numberToMoney(COST_AP_TRUNG_NHANH) + " vàng", "Đóng");
                    } else {
                        this.createOtherMenu(player, ConstNpc.CAN_OPEN_EGG, "Bư bư bư...", "Nở", "Hủy bỏ\ntrứng", "Đóng");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    switch (player.iDMark.getIndexMenu()) {
                        case ConstNpc.CAN_NOT_OPEN_EGG:
                            if (select == 0) {
                                this.createOtherMenu(player, ConstNpc.CONFIRM_DESTROY_EGG,
                                        "Bạn có chắc chắn muốn hủy bỏ trứng Mabư?", "Đồng ý", "Từ chối");
                            } else if (select == 1) {
                                if (player.inventory.gold >= COST_AP_TRUNG_NHANH) {
                                    player.inventory.gold -= COST_AP_TRUNG_NHANH;
                                    player.mabuEgg.timeDone = 0;
                                    Service.getInstance().sendMoney(player);
                                    player.mabuEgg.sendMabuEgg();
                                } else {
                                    Service.getInstance().sendThongBao(player,
                                            "Bạn không đủ vàng để thực hiện, còn thiếu "
                                            + Util.numberToMoney((COST_AP_TRUNG_NHANH - player.inventory.gold)) + " vàng");
                                }
                            }
                            break;
                        case ConstNpc.CAN_OPEN_EGG:
                            switch (select) {
                                case 0:
                                    this.createOtherMenu(player, ConstNpc.CONFIRM_OPEN_EGG,
                                            "Bạn có chắc chắn cho trứng nở?\n"
                                            + "Đệ tử của bạn sẽ được thay thế bằng đệ Mabư",
                                            "Đệ mabư\nTrái Đất", "Đệ mabư\nNamếc", "Đệ mabư\nXayda", "Từ chối");
                                    break;
                                case 1:
                                    this.createOtherMenu(player, ConstNpc.CONFIRM_DESTROY_EGG,
                                            "Bạn có chắc chắn muốn hủy bỏ trứng Mabư?", "Đồng ý", "Từ chối");
                                    break;
                            }
                            break;
                        case ConstNpc.CONFIRM_OPEN_EGG:
                            switch (select) {
                                case 0:
                                    player.mabuEgg.openEgg(ConstPlayer.TRAI_DAT);
                                    break;
                                case 1:
                                    player.mabuEgg.openEgg(ConstPlayer.NAMEC);
                                    break;
                                case 2:
                                    player.mabuEgg.openEgg(ConstPlayer.XAYDA);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case ConstNpc.CONFIRM_DESTROY_EGG:
                            if (select == 0) {
                                player.mabuEgg.destroyEgg();
                            }
                            break;
                    }
                }
            }
        };
    }

    public static Npc duahau(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    player.timedua.sendTimedua();
                    if (player.timedua.getSecondDone() != 0) {
                        this.createOtherMenu(player, ConstNpc.CAN_NOT_OPEN_DUA, "Thu hoạch dưa hấu nhận 15000 Hồng ngọc",
                                "Hủy bỏ\nDưa hấu", "Đóng");
                    } else {
                        this.createOtherMenu(player, ConstNpc.CAN_OPEN_DUA, "Dưa chín rồi nè", "Thu hoạch", "Hủy bỏ\nDưa hấu", "Đóng");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    switch (player.iDMark.getIndexMenu()) {
                        case ConstNpc.CAN_NOT_OPEN_DUA:
                            if (select == 0) {
                                this.createOtherMenu(player, ConstNpc.CONFIRM_DESTROY_DUA,
                                        "Bạn có chắc chắn muốn hủy bỏ Dưa hấu?", "Đồng ý", "Từ chối");
                            }
                            break;
                        case ConstNpc.CAN_OPEN_DUA:
                            switch (select) {
                                case 0:
                                    this.createOtherMenu(player, ConstNpc.CONFIRM_OPEN_DUA,
                                            "Bạn có chắc chắn THU HOẠCH DƯA?\n"
                                            + "Sẽ nhận được 15000 hồng ngọc",
                                            "Thu hoạch");
                                    break;
                                case 1:
                                    this.createOtherMenu(player, ConstNpc.CONFIRM_DESTROY_DUA,
                                            "Bạn có chắc chắn muốn hủy bỏ dưa hấu?", "Đồng ý", "Từ chối");
                                    break;
                            }
                            break;
                        case ConstNpc.CONFIRM_OPEN_DUA:
                            switch (select) {
                                case 0:
                                    player.inventory.ruby += 15000;
                                    Service.getInstance().sendMoney(player);
                                    this.npcChat(player, "Bạn nhận được 15000 hồng ngọc");
                                    break;

                            }

                        case ConstNpc.CONFIRM_DESTROY_DUA:
                            if (select == 0) {
                                player.timedua.destroydua();
                            }
                            break;
                    }
                }
            }
        };
    }

    public static Npc quocVuong(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {

            @Override
            public void openBaseMenu(Player player) {
                this.createOtherMenu(player, ConstNpc.BASE_MENU,
                        "Con muốn nâng giới hạn sức mạnh cho bản thân hay đệ tử?",
                        "Bản thân", "Đệ tử", "Từ chối");
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.isBaseMenu()) {
                        switch (select) {
                            case 0:
                                if (player.nPoint.limitPower < 9) {
                                    this.createOtherMenu(player, ConstNpc.OPEN_POWER_MYSEFT,
                                            "Ta sẽ truền năng lượng giúp con mở giới hạn sức mạnh của bản thân lên "
                                            + Util.numberToMoney(player.nPoint.getPowerNextLimit()),
                                            "Nâng ngay\n" + Util.numberToMoney(OpenPowerService.COST_SPEED_OPEN_LIMIT_POWER) + " vàng", "Đóng");
                                } else if (player.nPoint.limitPower == 9) {
                                    this.createOtherMenu(player, ConstNpc.OPEN_POWER_MYSEFT,
                                            "Ta sẽ truền năng lượng giúp con mở giới hạn sức mạnh của bản thân lên "
                                            + "400 tỷ Sức mạnh",
                                            "Nâng ngay\n" + "66.000" + " hồng ngọc", "Đóng");
                                } else {
                                    this.createOtherMenu(player, ConstNpc.IGNORE_MENU,
                                            "Sức mạnh của con đã đạt tới giới hạn",
                                            "Đóng");
                                }
                                break;
                            case 1:
                                if (player.pet != null) {
                                    if (player.pet.nPoint.limitPower < 9) {
                                        this.createOtherMenu(player, ConstNpc.OPEN_POWER_PET,
                                                "Ta sẽ truền năng lượng giúp con mở giới hạn sức mạnh của đệ tử lên "
                                                + Util.numberToMoney(player.pet.nPoint.getPowerNextLimit()),
                                                "Nâng ngay\n" + Util.numberToMoney(OpenPowerService.COST_SPEED_OPEN_LIMIT_POWER) + " vàng", "Đóng");
                                    } else if (player.pet.nPoint.limitPower == 9) {
                                        this.createOtherMenu(player, ConstNpc.OPEN_POWER_PET,
                                                "Ta sẽ truền năng lượng giúp con mở giới hạn sức mạnh của Đệ tử lên "
                                                + "300 tỷ Sức mạnh",
                                                "Nâng ngay\n" + "66.000" + " hồng ngọc", "Đóng");
                                    } else {
                                        this.createOtherMenu(player, ConstNpc.IGNORE_MENU,
                                                "Sức mạnh của đệ con đã đạt tới giới hạn",
                                                "Đóng");
                                    }
                                } else {
                                    Service.getInstance().sendThongBao(player, "Không thể thực hiện");
                                }
                                //giới hạn đệ tử
                                break;
                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.OPEN_POWER_MYSEFT && player.nPoint.limitPower < 9) {
                        switch (select) {
                            case 0:
                                if (player.inventory.gold >= OpenPowerService.COST_SPEED_OPEN_LIMIT_POWER) {
                                    if (OpenPowerService.gI().openPowerSpeed(player)) {
                                        player.inventory.gold -= OpenPowerService.COST_SPEED_OPEN_LIMIT_POWER;
                                        Service.getInstance().sendMoney(player);
                                    }
                                } else {
                                    Service.getInstance().sendThongBao(player,
                                            "Bạn không đủ vàng để mở, còn thiếu "
                                            + Util.numberToMoney((OpenPowerService.COST_SPEED_OPEN_LIMIT_POWER - player.inventory.gold)) + " vàng");
                                }
                                break;
                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.OPEN_POWER_MYSEFT && player.nPoint.limitPower == 9) {
                        switch (select) {
                            case 0:
                                if (player.inventory.ruby >= 66000) {
                                    if (OpenPowerService.gI().openPowerSpeed(player)) {
                                        player.inventory.ruby -= 66000;
                                        Service.getInstance().sendMoney(player);
                                    }
                                } else {
                                    Service.getInstance().sendThongBao(player,
                                            "Bạn không đủ hồng ngọc để mở, còn thiếu "
                                            + Util.numberToMoney((66000 - player.inventory.ruby)) + " hồng ngọc");
                                }
                                break;
                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.OPEN_POWER_PET && player.pet.nPoint.limitPower < 9) {
                        if (select == 0) {
                            if (player.inventory.gold >= OpenPowerService.COST_SPEED_OPEN_LIMIT_POWER) {
                                if (OpenPowerService.gI().openPowerSpeed(player.pet)) {
                                    player.inventory.gold -= OpenPowerService.COST_SPEED_OPEN_LIMIT_POWER;
                                    Service.getInstance().sendMoney(player);
                                }
                            } else {
                                Service.getInstance().sendThongBao(player,
                                        "Bạn không đủ vàng để mở, còn thiếu "
                                        + Util.numberToMoney((OpenPowerService.COST_SPEED_OPEN_LIMIT_POWER - player.inventory.gold)) + " vàng");
                            }
                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.OPEN_POWER_PET && player.pet.nPoint.limitPower == 9) {
                        switch (select) {
                            case 0:
                                if (player.inventory.ruby >= 66000) {
                                    if (OpenPowerService.gI().openPowerSpeed(player.pet)) {
                                        player.inventory.ruby -= 66000;
                                        Service.getInstance().sendMoney(player);
                                    }
                                } else {
                                    Service.getInstance().sendThongBao(player,
                                            "Bạn không đủ hồng ngọc để mở, còn thiếu "
                                            + Util.numberToMoney((66000 - player.inventory.ruby)) + " hồng ngọc");
                                }
                                break;
                        }
                    }
                }
            }
        };
    }

    public static Npc bulmaTL(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 104 || this.mapId == 5) {
                        if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {
                            this.createOtherMenu(player, ConstNpc.BASE_MENU, "Shop VIP nè, đốt xèng vô đê?", "Cửa hàng", "Đóng");
                        }
                    } else if (this.mapId == 104 || this.mapId == 102) {
                        if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {
                            this.createOtherMenu(player, ConstNpc.BASE_MENU, "Chụy chỉ bán những vật phẩm tương lai thui!!", "Cửa hàng", "Đóng");
                        }
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
//                    if (this.mapId == 104 || this.mapId == 5) {
//                        if (player.iDMark.isBaseMenu()) {
//                            if (select == 0) {
//                                ShopServiceNew.gI().opendShop(player, "BUNMA_LINHTHU", true);
//                            }
//                        }
//                    } else 
                    if (this.mapId == 102) {
                        if (player.iDMark.isBaseMenu()) {
                            if (select == 0) {
                                ShopServiceNew.gI().opendShop(player, "TUONG_LAI", true);
                            }
                        }
                    }
                }
            }
        };
    }

    private static Npc kyGui(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    createOtherMenu(player, 0, "|7|CỬA HÀNG KÝ GỬI\n|6|Cửa hàng chúng tôi chuyên mua bán hàng hiệu, hàng độc, cảm ơn bạn đã ghé thăm.\n|7|Lưu ý : Vật phẩm ký gửi nếu không được mua sẽ được Hoàn trả và xóa khỏi Shop sau 2 ngày tính từ lúc đăng bán", "Hướng\ndẫn\nthêm", "Mua bán\nKý gửi", "Từ chối");
                }
            }

            @Override
            public void confirmMenu(Player pl, int select) {
                if (canOpenNpc(pl)) {
                    switch (select) {
                        case 0:
                            Service.getInstance().sendPopUpMultiLine(pl, tempId, avartar, "Cửa hàng chuyên nhận ký gửi mua bán vật phẩm\bChỉ với 5 hồng ngọc\bGiá trị ký gửi là hồngngọc\bMột người bán, vạn người mua, mại dô, mại dô");
                            break;
                        case 1:
                            if (pl.nPoint.power < 1500000000000L || pl.playerTask.taskMain.id < 20) {
                                Service.gI().sendThongBaoOK(pl, "Cần 150 Tỷ Và Qua Nhiệm Vụ 20");
                                return;
                            }
                            ShopKyGuiService.gI().openShopKyGui(pl);
                            break;
                    }
                }
            }
        };
    }

    public static Npc caythong(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
//                    if (this.mapId == 104 || this.mapId == 5) {
//                        if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {
//                            this.createOtherMenu(player, ConstNpc.BASE_MENU, "Shop VIP nè, đốt xèng vô đê?", "Cửa hàng", "Đóng");
//                        }
//                    } else 
                    if (this.mapId == 104) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Kính chào Ngài Linh thú sư!", "Cửa hàng", "Đóng");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 104 || this.mapId == 5) {
                        if (player.iDMark.isBaseMenu()) {
                            if (select == 0) {
                                ShopServiceNew.gI().opendShop(player, "PET", true);
                            }
                        }
                    } else if (this.mapId == 104 || this.mapId == 5) {
                        if (player.iDMark.isBaseMenu()) {
                            if (select == 0) {
//                                ShopServiceNew.gI().opendShop(player, "BUNMA_LINHTHU", true);
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc rongOmega(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    BlackBallWar.gI().setTime();
                    if (this.mapId == 24 || this.mapId == 25 || this.mapId == 26) {
                        try {
                            long now = System.currentTimeMillis();
                            if (now > BlackBallWar.TIME_OPEN && now < BlackBallWar.TIME_CLOSE) {
                                this.createOtherMenu(player, ConstNpc.MENU_OPEN_BDW, "Đường đến với ngọc rồng sao đen đã mở, "
                                        + "ngươi có muốn tham gia không?",
                                        "Hướng dẫn\nthêm", "Tham gia", "Từ chối");
                            } else {
                                String[] optionRewards = new String[7];
                                int index = 0;
                                for (int i = 0; i < 7; i++) {
                                    if (player.rewardBlackBall.timeOutOfDateReward[i] > System.currentTimeMillis()) {
                                        String quantily = player.rewardBlackBall.quantilyBlackBall[i] > 1 ? "x" + player.rewardBlackBall.quantilyBlackBall[i] + " " : "";
                                        optionRewards[index] = quantily + (i + 1) + " sao";
                                        index++;
                                    }
                                }
                                if (index != 0) {
                                    String[] options = new String[index + 1];
                                    for (int i = 0; i < index; i++) {
                                        options[i] = optionRewards[i];
                                    }
                                    options[options.length - 1] = "Từ chối";
                                    this.createOtherMenu(player, ConstNpc.MENU_REWARD_BDW, "Ngươi có một vài phần thưởng ngọc "
                                            + "rồng sao đen đây!",
                                            options);
                                } else {
                                    this.createOtherMenu(player, ConstNpc.MENU_NOT_OPEN_BDW,
                                            "Ta có thể giúp gì cho ngươi?", "Hướng dẫn", "Từ chối");
                                }
                            }
                        } catch (Exception ex) {
                            Logger.error("Lỗi mở menu rồng Omega");
                        }
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    switch (player.iDMark.getIndexMenu()) {
                        case ConstNpc.MENU_REWARD_BDW:
                            player.rewardBlackBall.getRewardSelect((byte) select);
                            break;
                        case ConstNpc.MENU_OPEN_BDW:
                            if (select == 0) {
                                NpcService.gI().createTutorial(player, this.avartar, ConstNpc.HUONG_DAN_BLACK_BALL_WAR);
                            } else if (select == 1) {
//                                if (!player.getSession().actived) {
//                                    Service.getInstance().sendThongBao(player, "Vui lòng kích hoạt tài khoản để sử dụng chức năng này");
//
//                                } else
                                player.iDMark.setTypeChangeMap(ConstMap.CHANGE_BLACK_BALL);
                                ChangeMapService.gI().openChangeMapTab(player);
//                                BlackBallWar.gI().reInitNrd();
                            }
                            break;
                        case ConstNpc.MENU_NOT_OPEN_BDW:
                            if (select == 0) {
                                NpcService.gI().createTutorial(player, this.avartar, ConstNpc.HUONG_DAN_BLACK_BALL_WAR);
                            }
                            break;
                    }
                }
            }

        };
    }

    public static Npc rong1_to_7s(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.isHoldBlackBall()) {
                        this.createOtherMenu(player, ConstNpc.MENU_PHU_HP, "Ta có thể giúp gì cho ngươi?", "Phù hộ", "Từ chối");
                    } else {
                        if (BossManager.gI().existBossOnPlayer(player)
                                || player.zone.items.stream().anyMatch(itemMap -> ItemMapService.gI().isBlackBall(itemMap.itemTemplate.id))
                                || player.zone.getPlayers().stream().anyMatch(p -> p.iDMark.isHoldBlackBall())) {
                            this.createOtherMenu(player, ConstNpc.MENU_OPTION_GO_HOME, "Ta có thể giúp gì cho ngươi?", "Về nhà", "Từ chối");
                        } else {
                            this.createOtherMenu(player, ConstNpc.MENU_OPTION_GO_HOME, "Ta có thể giúp gì cho ngươi?", "Về nhà", "Từ chối", "Gọi BOSS");
                        }
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.getIndexMenu() == ConstNpc.MENU_PHU_HP) {
                        if (select == 0) {
                            this.createOtherMenu(player, ConstNpc.MENU_OPTION_PHU_HP,
                                    "Ta sẽ giúp ngươi tăng HP lên mức kinh hoàng, ngươi chọn đi",
                                    "x3 HP\n" + Util.numberToMoney(BlackBallWar.COST_X3) + " vàng",
                                    "x5 HP\n" + Util.numberToMoney(BlackBallWar.COST_X5) + " vàng",
                                    "x7 HP\n" + Util.numberToMoney(BlackBallWar.COST_X7) + " vàng",
                                    "Từ chối"
                            );
                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_OPTION_GO_HOME) {
                        if (select == 0) {
                            ChangeMapService.gI().changeMapBySpaceShip(player, player.gender + 21, -1, 250);
                        } else if (select == 2) {
                            BossManager.gI().callBoss(player, mapId);
                        } else if (select == 1) {
                            this.npcChat(player, "Để ta xem ngươi trụ được bao lâu");
                        }
                    } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_OPTION_PHU_HP) {
                        if (player.effectSkin.xHPKI > 1) {
                            Service.getInstance().sendThongBao(player, "Bạn đã được phù hộ rồi!");
                            return;
                        }
                        switch (select) {
                            case 0:
                                BlackBallWar.gI().xHPKI(player, BlackBallWar.X3);
                                break;
                            case 1:
                                BlackBallWar.gI().xHPKI(player, BlackBallWar.X5);
                                break;
                            case 2:
                                BlackBallWar.gI().xHPKI(player, BlackBallWar.X7);
                                break;
                            case 3:
                                this.npcChat(player, "Để ta xem ngươi trụ được bao lâu");
                                break;
                        }
                    }
                }
            }
        };
    }

    public static Npc npcThienSu64(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (this.mapId == 14) {
                    this.createOtherMenu(player, ConstNpc.BASE_MENU, "Ta sẽ dẫn cậu tới hành tinh Berrus với điều kiện\n 2. đạt 80 tỷ sức mạnh và Đến nhiệm vụ 24 "
                            + "\n 3. chi phí vào cổng  50 triệu vàng", "Tới ngay", "Từ chối");
                }
                if (this.mapId == 7) {
                    this.createOtherMenu(player, ConstNpc.BASE_MENU, "Ta sẽ dẫn cậu tới hành tinh Berrus với điều kiện\n 2. đạt 80 tỷ sức mạnh và Đến nhiệm vụ 24 "
                            + "\n 3. chi phí vào cổng  50 triệu vàng", "Tới ngay", "Từ chối");
                }
                if (this.mapId == 0) {
                    this.createOtherMenu(player, ConstNpc.BASE_MENU, "Ta sẽ dẫn cậu tới hành tinh Berrus với điều kiện\n 2. đạt 80 tỷ sức mạnh và Đến nhiệm vụ 24"
                            + "\n 3. chi phí vào cổng  50 triệu vàng", "Tới ngay", "Từ chối");
                }
                if (this.mapId == 146) {
                    this.createOtherMenu(player, ConstNpc.BASE_MENU, "Cậu không chịu nổi khi ở đây sao?\nCậu sẽ khó mà mạnh lên được", "Trốn về", "Ở lại");
                }
                if (this.mapId == 147) {
                    this.createOtherMenu(player, ConstNpc.BASE_MENU, "Cậu không chịu nổi khi ở đây sao?\nCậu sẽ khó mà mạnh lên được", "Trốn về", "Ở lại");
                }
                if (this.mapId == 148) {
                    this.createOtherMenu(player, ConstNpc.BASE_MENU, "Cậu không chịu nổi khi ở đây sao?\nCậu sẽ khó mà mạnh lên được", "Trốn về", "Ở lại");
                }
                if (this.mapId == 48) {
                    this.createOtherMenu(player, ConstNpc.BASE_MENU, "Đã tìm đủ nguyên liệu cho tôi chưa?\n Tôi sẽ giúp cậu mạnh lên kha khá đấy!\n\b|7| Điều kiện học Tuyệt kỹ\b|5| -Khi chưa học skill cần: x999 Bí kiếp tuyệt kỹ + 200k Hồng ngọc và SM trên 60 Tỷ\n -Mỗi một cấp yêu cầu Thông thạo đạt MAX 100% và cần 200k Hồng ngọc", "Hướng Dẫn",
                            "Đổi SKH VIP", "Học\ntuyệt kĩ", "Từ Chối");
                }
            }

            //if (player.inventory.gold < 500000000) {
//                this.baHatMit.createOtherMenu(player, ConstNpc.IGNORE_MENU, "Hết tiền rồi\nẢo ít thôi con", "Đóng");
//                return;
//            }
            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (player.iDMark.isBaseMenu() && this.mapId == 7) {
                        if (select == 0) {
                            if (player.getSession().player.nPoint.power >= 80000000000L && player.inventory.gold > COST_HD && TaskService.gI().getIdTask(player) > ConstTask.TASK_24_0) {
                                player.inventory.gold -= COST_HD;
                                Service.getInstance().sendMoney(player);
                                ChangeMapService.gI().changeMapBySpaceShip(player, 146, -1, -1);
                            } else {
                                this.npcChat(player, "Bạn chưa đủ điều kiện để vào");
                            }
                        }
                        if (select == 1) {
                        }
                    }
                    if (player.iDMark.isBaseMenu() && this.mapId == 14) {
                        if (select == 0) {
                            if (player.getSession().player.nPoint.power >= 80000000000L && player.inventory.gold > COST_HD && TaskService.gI().getIdTask(player) > ConstTask.TASK_24_0) {
                                player.inventory.gold -= COST_HD;
                                Service.getInstance().sendMoney(player);
                                ChangeMapService.gI().changeMapBySpaceShip(player, 148, -1, -1);
                            } else {
                                this.npcChat(player, "Bạn chưa đủ điều kiện để vào");
                            }
                        }
                        if (select == 1) {
                        }
                    }
                    if (player.iDMark.isBaseMenu() && this.mapId == 0) {
                        if (select == 0) {
                            if (player.getSession().player.nPoint.power >= 80000000000L && player.inventory.gold > COST_HD && TaskService.gI().getIdTask(player) > ConstTask.TASK_24_0) {
                                player.inventory.gold -= COST_HD;
                                Service.getInstance().sendMoney(player);
                                ChangeMapService.gI().changeMapBySpaceShip(player, 147, -1, -1);
                            } else {
                                this.npcChat(player, "Bạn chưa đủ điều kiện để vào");
                            }
                        }
                        if (select == 1) {
                        }
                    }
                    if (player.iDMark.isBaseMenu() && this.mapId == 147) {
                        if (select == 0) {
                            ChangeMapService.gI().changeMapBySpaceShip(player, 0, -1, -1);
                        }
                        if (select == 1) {
                        }
                    }
                    if (player.iDMark.isBaseMenu() && this.mapId == 148) {
                        if (select == 0) {
                            ChangeMapService.gI().changeMapBySpaceShip(player, 14, -1, -1);
                        }
                        if (select == 1) {
                        }
                    }
                    if (player.iDMark.isBaseMenu() && this.mapId == 146) {
                        if (select == 0) {
                            ChangeMapService.gI().changeMapBySpaceShip(player, 7, -1, -1);
                        }
                        if (select == 1) {
                        }

                    }
                    if (player.iDMark.isBaseMenu() && this.mapId == 48) {
                        if (select == 0) {
                            NpcService.gI().createTutorial(player, this.avartar, ConstNpc.HUONG_DAN_DOI_SKH_VIP);
                        }
                        if (select == 1) {
                            CombineServiceNew.gI().openTabCombine(player, CombineServiceNew.NANG_CAP_SKH_VIP);
                        }
                        if (select == 2) {
                            Message msg;
                            try {
                                if (player.gender == 0) {
                                    Skill curSkill = SkillUtil.getSkillbyId(player, Skill.SUPER_KAME);
                                    if (curSkill.point == 0) {
                                        Item honLinhThu = null;
                                        try {
                                            honLinhThu = InventoryServiceNew.gI().findItemBag(player, 1215);
                                        } catch (Exception e) {
                                            //                                        throw new RuntimeException(e);
                                        }
                                        if (player.nPoint.power >= 60000000000L) {
                                            if (honLinhThu == null || honLinhThu.quantity < 999) {
                                                this.npcChat(player, "Bạn không đủ 999 bí kíp tuyệt kĩ");
                                            } else if (player.inventory.ruby > 200_000 && honLinhThu.quantity >= 999) {
                                                player.inventory.ruby -= 200_000;
                                                InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 999);
                                                Service.getInstance().sendMoney(player);
                                                curSkill = SkillUtil.createSkill(Skill.SUPER_KAME, 1);
                                                SkillUtil.setSkill(player, curSkill);
                                                msg = Service.getInstance().messageSubCommand((byte) 23);
                                                msg.writer().writeShort(curSkill.skillId);
                                                player.achievement.plusCount(12);
                                                player.sendMessage(msg);
                                                msg.cleanup();
                                            } else {
                                                Service.getInstance().sendThongBao(player, "Không đủ Hồng ngọc");
                                            }
                                        } else {
                                            Service.getInstance().sendThongBao(player, "Yêu cầu sức mạnh trên 60 Tỷ");
                                        }
                                    } else if (curSkill.point > 0 && curSkill.point < 9) {
                                        if (curSkill.currLevel == 1000 && player.inventory.ruby < 200_000) {
                                            Service.getInstance().sendThongBao(player, "Không đủ Hồng ngọc");
                                        } else if (curSkill.currLevel == 1000 && player.inventory.ruby > 200_000) {
                                            player.inventory.ruby -= 200_000;
                                            Service.getInstance().sendMoney(player);
                                            curSkill = SkillUtil.createSkill(Skill.SUPER_KAME, curSkill.point + 1);
                                            SkillUtil.setSkill(player, curSkill);
                                            msg = Service.getInstance().messageSubCommand((byte) 62);
                                            msg.writer().writeShort(curSkill.skillId);
                                            player.achievement.plusCount(12);
                                            player.sendMessage(msg);
                                            msg.cleanup();
                                        } else {
                                            Service.getInstance().sendThongBao(player, "Thông thạo của bạn chưa đủ 100%");
                                        }
                                    } else {
                                        Service.getInstance().sendThongBao(player, "Tuyệt kĩ của bạn đã đạt cấp tối đa");
                                    }
                                }
                                if (player.gender == 1) {
                                    Skill curSkill = SkillUtil.getSkillbyId(player, Skill.MA_PHONG_BA);
                                    if (curSkill.point == 0) {
                                        Item honLinhThu = null;
                                        try {
                                            honLinhThu = InventoryServiceNew.gI().findItemBag(player, 1215);
                                        } catch (Exception e) {
                                            //                                        throw new RuntimeException(e);
                                        }
                                        if (player.nPoint.power >= 60000000000L) {
                                            if (honLinhThu == null || honLinhThu.quantity < 999) {
                                                this.npcChat(player, "Bạn không đủ 999 bí kíp tuyệt kĩ");
                                            } else if (player.inventory.ruby > 200_000 && honLinhThu.quantity >= 999) {
                                                player.inventory.ruby -= 200_000;
                                                InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 999);
                                                Service.getInstance().sendMoney(player);
                                                curSkill = SkillUtil.createSkill(Skill.MA_PHONG_BA, 1);
                                                SkillUtil.setSkill(player, curSkill);
                                                msg = Service.getInstance().messageSubCommand((byte) 23);
                                                msg.writer().writeShort(curSkill.skillId);
                                                player.achievement.plusCount(12);
                                                player.sendMessage(msg);
                                                msg.cleanup();
                                            } else {
                                                Service.getInstance().sendThongBao(player, "Không đủ Hồng ngọc");
                                            }
                                        } else {
                                            Service.getInstance().sendThongBao(player, "Yêu cầu sức mạnh trên 60 Tỷ");
                                        }
                                    } else if (curSkill.point > 0 && curSkill.point < 9) {
                                        if (curSkill.currLevel == 1000 && player.inventory.ruby < 200_000) {
                                            Service.getInstance().sendThongBao(player, "Không đủ Hồng ngọc");
                                        } else if (curSkill.currLevel == 1000 && player.inventory.ruby > 200_000) {
                                            player.inventory.ruby -= 200_000;
                                            Service.getInstance().sendMoney(player);
                                            curSkill = SkillUtil.createSkill(Skill.MA_PHONG_BA, curSkill.point + 1);
                                            SkillUtil.setSkill(player, curSkill);
                                            msg = Service.getInstance().messageSubCommand((byte) 62);
                                            msg.writer().writeShort(curSkill.skillId);
                                            player.achievement.plusCount(12);
                                            player.sendMessage(msg);
                                            msg.cleanup();
                                        } else {
                                            Service.getInstance().sendThongBao(player, "Thông thạo của bạn chưa đủ 100%");
                                        }
                                    } else {
                                        Service.getInstance().sendThongBao(player, "Tuyệt kĩ của bạn đã đạt cấp tối đa");
                                    }
                                }
                                if (player.gender == 2) {
                                    Skill curSkill = SkillUtil.getSkillbyId(player, Skill.LIEN_HOAN_CHUONG);
                                    if (curSkill.point == 0) {
                                        Item honLinhThu = null;
                                        try {
                                            honLinhThu = InventoryServiceNew.gI().findItemBag(player, 1215);
                                        } catch (Exception e) {
                                            //                                        throw new RuntimeException(e);
                                        }
                                        if (player.nPoint.power >= 60000000000L) {
                                            if (honLinhThu == null || honLinhThu.quantity < 999) {
                                                this.npcChat(player, "Bạn không đủ 999 bí kíp tuyệt kĩ");
                                            } else if (player.inventory.ruby > 200_000 && honLinhThu.quantity >= 999) {
                                                player.inventory.ruby -= 200_000;
                                                InventoryServiceNew.gI().subQuantityItemsBag(player, honLinhThu, 999);
                                                Service.getInstance().sendMoney(player);
                                                curSkill = SkillUtil.createSkill(Skill.LIEN_HOAN_CHUONG, 1);
                                                SkillUtil.setSkill(player, curSkill);
                                                msg = Service.getInstance().messageSubCommand((byte) 23);
                                                msg.writer().writeShort(curSkill.skillId);
                                                player.achievement.plusCount(12);
                                                player.sendMessage(msg);
                                                msg.cleanup();
                                            } else {
                                                Service.getInstance().sendThongBao(player, "Không đủ Hồng ngọc");
                                            }
                                        } else {
                                            Service.getInstance().sendThongBao(player, "Yêu cầu sức mạnh trên 60 Tỷ");
                                        }
                                    } else if (curSkill.point > 0 && curSkill.point < 9) {
                                        if (curSkill.currLevel == 1000 && player.inventory.ruby < 200_000) {
                                            Service.getInstance().sendThongBao(player, "Không đủ Hồng ngọc");
                                        } else if (curSkill.currLevel == 1000 && player.inventory.ruby > 200_000) {
                                            player.inventory.ruby -= 200_000;
                                            Service.getInstance().sendMoney(player);
                                            curSkill = SkillUtil.createSkill(Skill.LIEN_HOAN_CHUONG, curSkill.point + 1);
                                            SkillUtil.setSkill(player, curSkill);
                                            msg = Service.getInstance().messageSubCommand((byte) 62);
                                            msg.writer().writeShort(curSkill.skillId);
                                            player.achievement.plusCount(12);
                                            player.sendMessage(msg);
                                            msg.cleanup();
                                        } else {
                                            Service.getInstance().sendThongBao(player, "Thông thạo của bạn chưa đủ 100%");
                                        }
                                    } else {
                                        Service.getInstance().sendThongBao(player, "Tuyệt kĩ của bạn đã đạt cấp tối đa");
                                    }
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                                System.out.println("loi ne   4534     ClassCastException ");
                            }
                        }

                    } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_NANG_DOI_SKH_VIP) {
                        if (select == 0) {
                            CombineServiceNew.gI().startCombine(player);
                        }
                    }
                }
            }

        };
    }

    //    public static Npc bill(int mapId, int status, int cx, int cy, int tempId, int avartar) {
//        return new Npc(mapId, status, cx, cy, tempId, avartar) {
//            @Override
//            public void openBaseMenu(Player player) {
//                if (canOpenNpc(player)) {
//                    if (this.mapId == 48) {
//                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Ngươi muốn gì nào?" + player.inventory.coupon+, "Đóng");
//                    } else {
//                        super.openBaseMenu(player);
//                    }
//                }
//            }
//
//            @Override
//            public void confirmMenu(Player player, int select) {
//                if (canOpenNpc(player)) {
//                    switch (this.mapId) {
//                        case 48:
//                            switch (player.iDMark.getIndexMenu()) {
//                                case ConstNpc.BASE_MENU:
//                                    if (select == 0) {
//
//                                    }
//                                    break;
//                            }
//                            break;
//                    }
//                }
//            }
//        };
//    }
    public static Npc bill(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    createOtherMenu(player, ConstNpc.BASE_MENU,
                            "|7|SHOP ĐỒ HỦY DIỆT\n|6| Mang đủ 5 món đồ Thần linh và đem 99 Thức ăn đến cho ta. Ta sẽ bán đồ Hủy diệt cho ngươi",
                            "SHOP HỦY DIỆT", "Đổi Phiếu\nHủy diệt", "Đóng");
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    switch (player.iDMark.getIndexMenu()) {
                        case ConstNpc.BASE_MENU:
                            if (select == 0) {
                                if (player.check99ThucAnHuyDiet() == true) {
                                    if (player.setClothes.setDTL == 5) {
                                        ShopServiceNew.gI().opendShop(player, "BILL", true);
                                    } else {
                                        createOtherMenu(player, ConstNpc.IGNORE_MENU, "Yêu cầu mặc 5 món Thần linh", "Đóng");
                                    }
                                } else {
                                    createOtherMenu(player, ConstNpc.IGNORE_MENU, "Ngươi chưa đủ 99 thức ăn", "Đóng");
                                }
                                break;

                            } else if (select == 1) {
                                ShopServiceNew.gI().opendShop(player, "HUY_DIET", true);
                                break;

                            }
                            break;
                    }
                }
            }
        };
    }

    public static Npc boMong(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 47 || this.mapId == 84) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
                                "Xin chào, cậu muốn tôi giúp gì?", "Nhiệm vụ\nhàng ngày", "Nhiệm vụ\n tích lũy", "Danh hiệu", "Từ chối");
                    }
//                    if (this.mapId == 47) {
//                        this.createOtherMenu(player, ConstNpc.BASE_MENU,
//                                "Xin chào, cậu muốn tôi giúp gì?", "Từ chối");
//                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 47 || this.mapId == 84) {
                        if (player.iDMark.isBaseMenu()) {
                            switch (select) {
                                case 0:
                                    if (player.playerTask.sideTask.template != null) {
                                        String npcSay = "Nhiệm vụ hiện tại: " + player.playerTask.sideTask.getName() + " ("
                                                + player.playerTask.sideTask.getLevel() + ")"
                                                + "\nHiện tại đã hoàn thành: " + player.playerTask.sideTask.count + "/"
                                                + player.playerTask.sideTask.maxCount + " ("
                                                + player.playerTask.sideTask.getPercentProcess() + "%)\nSố nhiệm vụ còn lại trong ngày: "
                                                + player.playerTask.sideTask.leftTask + "/" + ConstTask.MAX_SIDE_TASK;
                                        this.createOtherMenu(player, ConstNpc.MENU_OPTION_PAY_SIDE_TASK,
                                                npcSay, "Trả nhiệm\nvụ", "Hủy nhiệm\nvụ");
                                    } else {
                                        this.createOtherMenu(player, ConstNpc.MENU_OPTION_LEVEL_SIDE_TASK,
                                                "Tôi có vài nhiệm vụ theo cấp bậc, "
                                                + "sức cậu có thể làm được cái nào?\b|5|Phần thưởng:\b|7| Dễ: 5 Thỏi vàng\n Bình thường: 8 Thỏi vàng\n Khó: 12 Thỏi vàng\n Siêu khó: 17 Thỏi vàng\n Địa ngục: 25 Thỏi vàng",
                                                "Dễ", "Bình thường", "Khó", "Siêu khó", "Địa ngục", "Từ chối");
                                    }
                                    break;
                                case 1:
                                    player.achievement.Show();
                                    break;
                                case 2:
                                    this.createOtherMenu(player, 888,
                                            "|7|CHỨC NĂNG DANH HIỆU"
                                            + "\n\n|2|Đây là danh hiệu mà ngươi có"
                                            + (player.lastTimeTitle1 > 0 ? "\n\n|4|Danh hiệu Đại Thần: " + Util.msToTime(player.lastTimeTitle1) : "")
                                            + (player.lastTimeTitle2 > 0 ? "\n Danh hiệu Trùm Cuối: " + Util.msToTime(player.lastTimeTitle2) : "")
                                            + (player.lastTimeTitle3 > 0 ? "\n Danh hiệu Tuổi Thơ: " + Util.msToTime(player.lastTimeTitle3) : ""),
                                            ("Đại Thần\n" + (player.isTitleUse1 == true ? "'ON'" : "'OFF'")),
                                            ("Trùm Cuối\n" + (player.isTitleUse2 == true ? "'ON'" : "'OFF'") + "\n"),
                                            ("Tuổi Thơ\n" + (player.isTitleUse3 == true ? "'ON'" : "'OFF'") + "\n"));
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_OPTION_LEVEL_SIDE_TASK) {
                            switch (select) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    TaskService.gI().changeSideTask(player, (byte) select);
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == ConstNpc.MENU_OPTION_PAY_SIDE_TASK) {
                            switch (select) {
                                case 0:
                                    TaskService.gI().paySideTask(player);
                                    break;
                                case 1:
                                    TaskService.gI().removeSideTask(player);
                                    break;
                            }
                        } else if (player.iDMark.getIndexMenu() == 888) {
                            switch (select) {
                                case 0:
                                    if (player.lastTimeTitle1 > 0) {
                                        Service.gI().removeTitle(player);
                                        player.isTitleUse1 = !player.isTitleUse1;
                                        Service.gI().point(player);
                                        Service.gI().sendThongBao(player, "Đã " + (player.isTitleUse1 == true ? "Bật" : "Tắt") + " Danh Hiệu!");
                                        Service.gI().sendTitle(player, 890);
                                        Service.gI().sendTitle(player, 889);
                                        Service.gI().sendTitle(player, 888);
                                        Service.gI().removeTitle(player);
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (player.lastTimeTitle2 > 0) {
                                        Service.gI().removeTitle(player);
                                        player.isTitleUse2 = !player.isTitleUse2;
                                        Service.gI().point(player);
                                        Service.gI().sendThongBao(player, "Đã " + (player.isTitleUse2 == true ? "Bật" : "Tắt") + " Danh Hiệu!");
                                        Service.gI().sendTitle(player, 890);
                                        Service.gI().sendTitle(player, 889);
                                        Service.gI().sendTitle(player, 888);
                                        Service.gI().removeTitle(player);
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (player.lastTimeTitle3 > 0) {
                                        Service.gI().removeTitle(player);
                                        player.isTitleUse3 = !player.isTitleUse3;
                                        Service.gI().point(player);
                                        Service.gI().sendThongBao(player, "Đã " + (player.isTitleUse3 == true ? "Bật" : "Tắt") + " Danh Hiệu!");
                                        Service.gI().sendTitle(player, 890);
                                        Service.gI().sendTitle(player, 889);
                                        Service.gI().sendTitle(player, 888);
                                        Service.gI().removeTitle(player);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc karin(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 102) {
                        if (!TaskService.gI().checkDoneTaskTalkNpc(player, this)) {
                            this.createOtherMenu(player, ConstNpc.BASE_MENU, "Cậu bé muốn mua gì nào?", "Cửa hàng", "Đóng");
                        }
                    } else if (this.mapId == 46 || this.mapId == 5) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Kính chào Ngài Linh thú sư!", "Cửa hàng", "Đóng");
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 102) {
                        if (player.iDMark.isBaseMenu()) {
                            if (select == 0) {
                                ShopServiceNew.gI().opendShop(player, "BUNMA_FUTURE", true);
                            }
                        }
                    } else if (this.mapId == 46 || this.mapId == 5) {
                        if (player.iDMark.isBaseMenu()) {
                            if (select == 0) {
                                ShopServiceNew.gI().opendShop(player, "KARIN", true);
                            }
                        }
                    }
                }
            }
        };
    }

    public static Npc vados(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    createOtherMenu(player, ConstNpc.BASE_MENU,
                            "|7| BẢNG XẾP HẠNG\n|6|Ta Vừa Hack Map xem Được TOP Của Toàn Server\b|1|Người Muốn Xem TOP Gì?",
                            "Top Trung thu", "Top HP", "Top Sức mạnh", "Top Nhiệm vụ", "Top Săn BOSS", "Top Nạp", "Đóng");
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    switch (this.mapId) {
                        case 5:
                            switch (player.iDMark.getIndexMenu()) {
                                case ConstNpc.BASE_MENU:
                                    if (select == 0) {
                                        Service.gI().showListTop(player, Manager.topSK);
                                        break;
                                    }
                                    if (select == 1) {
                                        Service.gI().showListTop(player, Manager.topHP);
                                        break;
                                    }
                                    if (select == 2) {
                                        Service.gI().showListTop(player, Manager.topSM);
                                        break;
                                    }
                                    if (select == 3) {
                                        Service.gI().showListTop(player, Manager.topNV);
                                        break;
                                    }
                                    if (select == 4) {
                                        Service.gI().showListTop(player, Manager.topSB);
                                        break;
                                    }
                                    if (select == 5) {
                                        Service.gI().showListTop(player, Manager.topVND);
                                        break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
            }
        };
    }

    public static Npc gokuSSJ_1(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    if (this.mapId == 80) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Xin chào, tôi có thể giúp gì cho cậu?", "Tới hành tinh\nYardart", "Từ chối");
                    } else if (this.mapId == 131) {
                        this.createOtherMenu(player, ConstNpc.BASE_MENU, "Xin chào, tôi có thể giúp gì cho cậu?", "Quay về", "Từ chối");
                    } else {
                        super.openBaseMenu(player);
                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    switch (player.iDMark.getIndexMenu()) {
                        case ConstNpc.BASE_MENU:
                            if (this.mapId == 131) {
                                if (select == 0) {
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 80, -1, 870);
                                }
                            }
                            if (this.mapId == 80) {
                                if (select == 0) {
                                    ChangeMapService.gI().changeMapBySpaceShip(player, 131, -1, 870);
                                }
                            }
                            break;
                    }
                }
            }
        };
    }

    public static Npc gokuSSJ_2(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        return new Npc(mapId, status, cx, cy, tempId, avartar) {
            @Override
            public void openBaseMenu(Player player) {
                if (canOpenNpc(player)) {
                    try {
                        Item biKiep = InventoryServiceNew.gI().findItem(player.inventory.itemsBag, 590);
                        if (biKiep != null) {
                            this.createOtherMenu(player, ConstNpc.BASE_MENU, "Bạn đang có " + biKiep.quantity + " bí kiếp.\n"
                                    + "Hãy kiếm đủ 10000 bí kiếp và 200k Hồng ngọc tôi sẽ dạy bạn cách dịch chuyển tức thời của người Yardart", "Học dịch\nchuyển", "Đóng");
                        } else {
                            Service.getInstance().sendThongBao(player, "Bạn chưa có bí kiếp");
                        }

                    } catch (Exception ex) {
                        ex.printStackTrace();
                        System.out.println("loi ne   4534     ClassCastException ");

                    }
                }
            }

            @Override
            public void confirmMenu(Player player, int select) {
                if (canOpenNpc(player)) {
                    try {
                        Item biKiep = InventoryServiceNew.gI().findItem(player.inventory.itemsBag, 590);
                        if (biKiep != null) {
                            if (biKiep.quantity >= 10000 && InventoryServiceNew.gI().getCountEmptyBag(player) > 0 && player.inventory.ruby > 200_000) {
                                player.inventory.ruby -= 200_000;
                                Service.getInstance().sendMoney(player);
                                Item yardart = ItemService.gI().createNewItem((short) (player.gender + 592));
                                yardart.itemOptions.add(new Item.ItemOption(47, 400));
                                yardart.itemOptions.add(new Item.ItemOption(108, 10));
                                yardart.itemOptions.add(new Item.ItemOption(33, 1));
                                yardart.itemOptions.add(new Item.ItemOption(30, 1));
                                InventoryServiceNew.gI().addItemBag(player, yardart);
                                InventoryServiceNew.gI().subQuantityItemsBag(player, biKiep, 10000);
                                InventoryServiceNew.gI().sendItemBags(player);
                                Service.getInstance().sendThongBao(player, "Bạn vừa nhận được trang phục tộc Yardart");
                            } else {
                                Service.getInstance().sendThongBao(player, "Cày tiếp đi con gà");
                            }
                        } else {
                            Service.getInstance().sendThongBao(player, "Bạn chưa có bí kiếp");
                        }
                    } catch (Exception ex) {

                    }
                }
            }
        };
    }

    public static Npc createNPC(int mapId, int status, int cx, int cy, int tempId) {
        int avatar = Manager.NPC_TEMPLATES.get(tempId).avatar;
        try {
            switch (tempId) {
                case ConstNpc.TRUNG_THU:
                    return Skien_trungthu(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.MR_POPO:
                    return popo(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.TRUNG_LINH_THU:
                    return trungLinhThu(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.GHI_DANH:
                    return GhiDanh(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.POTAGE:
                    return poTaGe(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.QUY_LAO_KAME:
                    return quyLaoKame(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.TRUONG_LAO_GURU:
                    return truongLaoGuru(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.VUA_VEGETA:
                    return vuaVegeta(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.ONG_GOHAN:
                case ConstNpc.ONG_MOORI:
                case ConstNpc.ONG_PARAGUS:
                    return ongGohan_ongMoori_ongParagus(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.BUNMA:
                    return bulmaQK(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.DENDE:
                    return dende(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.APPULE:
                    return appule(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.DR_DRIEF:
                    return drDrief(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.CARGO:
                    return cargo(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.CUI:
                    return cui(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.SANTA:
                    return santa(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.URON:
                    return uron(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.BA_HAT_MIT:
                    return baHatMit(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.WHIS:
                    return whisdots(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.RUONG_DO:
                    return ruongDo(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.DAU_THAN:
                    return dauThan(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.CALICK:
                    return calick(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.JACO:
                    return jaco(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.THUONG_DE:
                    return thuongDe(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.VADOS:
                    return vados(mapId, status, cx, cy, tempId, avatar);
//                case ConstNpc.POTAGE:
//                    return Potage(mapId, status, cx, cy, tempId, avatar);    
                case ConstNpc.THAN_VU_TRU:
                    return thanVuTru(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.KIBIT:
                    return kibit(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.OSIN:
                    return osin(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.LY_TIEU_NUONG:
                    return npclytieunuong54(mapId, status, cx, cy, tempId, avatar);
//                case ConstNpc.MEO_THAN_TAI:
//                    return meothantai(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.CUA_HANG_KY_GUI:
                    return kyGui(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.MI_NUONG:
                    return minuong(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.CHIEN_THAN:
                    return npcChienthan(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.LINH_CANH:
                    return linhCanh(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.THO_DAI_CA:
                    return thodaika(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.FIDE:
                    return fide(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.GIUMA_DAU_BO:
                    return giuma(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.QUA_TRUNG:
                    return quaTrung(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.DUA_HAU:
                    return duahau(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.UUB:
                    return npcuub(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.QUOC_VUONG:
                    return quocVuong(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.BUNMA_TL:
                    return bulmaTL(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.Monaito:
                    return monaito(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.Jiren:
                    return jiren(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.ZAMASU:
                    return zamasu(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.NPC_CHUYENSINH:
                    return chuyensinh(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.RONG_OMEGA:
                    return rongOmega(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.RONG_1S:
                case ConstNpc.RONG_2S:
                case ConstNpc.RONG_3S:
                case ConstNpc.RONG_4S:
                case ConstNpc.RONG_5S:
                case ConstNpc.RONG_6S:
                case ConstNpc.RONG_7S:
                    return rong1_to_7s(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.NPC_64:
                    return npcThienSu64(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.BILL:
                    return bill(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.ONG_GIA_NOEL:
                    return bill(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.BO_MONG:
                    return boMong(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.THAN_MEO_KARIN:
                    return karin(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.GOKU_SSJ:
                    return gokuSSJ_1(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.CAY_THONG_NOEL:
                    return caythong(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.GOKU_SSJ_:
                    return gokuSSJ_2(mapId, status, cx, cy, tempId, avatar);
                case ConstNpc.DUONG_TANG:
                    return duongtank(mapId, status, cx, cy, tempId, avatar);
                default:
                    return new Npc(mapId, status, cx, cy, tempId, avatar) {
                        @Override
                        public void openBaseMenu(Player player) {
                            if (canOpenNpc(player)) {
                                super.openBaseMenu(player);
                            }
                        }

                        @Override
                        public void confirmMenu(Player player, int select) {
                            if (canOpenNpc(player)) {
//                                ShopService.gI().openShopNormal(player, this, ConstNpc.SHOP_BUNMA_TL_0, 0, player.gender);
                            }
                        }
                    };
            }
        } catch (Exception e) {
            Logger.logException(NpcFactory.class, e, "Lỗi load npc");
            return null;
        }
    }

    public static void createNpcRongThieng() {
        new Npc(-1, -1, -1, -1, ConstNpc.RONG_THIENG, -1) {
            @Override
            public void confirmMenu(Player player, int select) {
                switch (player.iDMark.getIndexMenu()) {
                    case ConstNpc.IGNORE_MENU:

                        break;
                    case ConstNpc.SHENRON_CONFIRM:
                        if (select == 0) {
                            SummonDragon.gI().confirmWish();
                        } else if (select == 1) {
                            SummonDragon.gI().reOpenShenronWishes(player);
                        }
                        break;
                    case ConstNpc.SHENRON_1_1:
                        if (player.iDMark.getIndexMenu() == ConstNpc.SHENRON_1_1 && select == SHENRON_1_STAR_WISHES_1.length - 1) {
                            NpcService.gI().createMenuRongThieng(player, ConstNpc.SHENRON_1_2, SHENRON_SAY, SHENRON_1_STAR_WISHES_2);
                            break;
                        }
                    case ConstNpc.SHENRON_1_2:
                        if (player.iDMark.getIndexMenu() == ConstNpc.SHENRON_1_2 && select == SHENRON_1_STAR_WISHES_2.length - 1) {
                            NpcService.gI().createMenuRongThieng(player, ConstNpc.SHENRON_1_1, SHENRON_SAY, SHENRON_1_STAR_WISHES_1);
                            break;
                        }
//                    case ConstNpc.SHENRON_2:
//                        if (player.iDMark.getIndexMenu() == ConstNpc.SHENRON_2 && select == SHENRON_2_STARS_WHISHES.length) {
//                            NpcService.gI().createMenuRongThieng(player, ConstNpc.SHENRON_2, SHENRON_SAY, SHENRON_2_STARS_WHISHES);
//                            break;
//                        }
                    default:
                        SummonDragon.gI().showConfirmShenron(player, player.iDMark.getIndexMenu(), (byte) select);
                        break;
                }
            }
        };
    }

    public static void createNpcRongXuong() {
        new Npc(-1, -1, -1, -1, ConstNpc.RONG_XUONG, -1) {
            @Override
            public void confirmMenu(Player player, int select) {
                switch (player.iDMark.getIndexMenu()) {
                    case ConstNpc.IGNORE_MENU:

                        break;
                    case ConstNpc.HALLOWEN_CONFIRM:
                        if (select == 0) {
                            GoiRongXuong.gI().confirmWish();
                        } else if (select == 1) {
                            GoiRongXuong.gI().reOpenRongxuongWishes(player);
                        }
                        break;
                    default:
                        GoiRongXuong.gI().showConfirmRongxuong(player, player.iDMark.getIndexMenu(), (byte) select);
                        break;
                }
            }
        };
    }

    public static void createNpcConMeo() {
        Npc npc;
        npc = new Npc(-1, -1, -1, -1, ConstNpc.CON_MEO, 351) {
            @Override
            public void confirmMenu(Player player, int select) {
                switch (player.iDMark.getIndexMenu()) {
                    case ConstNpc.IGNORE_MENU:

                        break;
                    case ConstNpc.MAKE_MATCH_PVP: //                        if (player.getSession().actived) 
                    {
                        if (Maintenance.isRuning) {
                            break;
                        }
                        PVPService.gI().sendInvitePVP(player, (byte) select);
                        break;
                    }
//                        else {
//                            Service.getInstance().sendThongBao(player, "|5|VUI LÒNG KÍCH HOẠT TÀI KHOẢN TẠI\n|7|NROGOD.COM\n|5|ĐỂ MỞ KHÓA TÍNH NĂNG");
//                            break;
//                        }
                    case ConstNpc.MAKE_FRIEND:
                        if (select == 0) {
                            Object playerId = PLAYERID_OBJECT.get(player.id);
                            if (playerId != null) {
                                FriendAndEnemyService.gI().acceptMakeFriend(player,
                                        Integer.parseInt(String.valueOf(playerId)));
                            }
                        }
                        break;
                    case ConstNpc.REVENGE:
                        if (select == 0) {
                            PVPService.gI().acceptRevenge(player);
                        }
                        break;
                    case ConstNpc.TUTORIAL_SUMMON_DRAGON:
                        if (select == 0) {
                            NpcService.gI().createTutorial(player, -1, SummonDragon.SUMMON_SHENRON_TUTORIAL);
                        }
                        break;
                    case ConstNpc.SUMMON_SHENRON:
                        if (select == 0) {
                            NpcService.gI().createTutorial(player, -1, SummonDragon.SUMMON_SHENRON_TUTORIAL);
                        } else if (select == 1) {
                            SummonDragon.gI().summonShenron(player);
//                            Service.getInstance().sendThongBao(player, "Chức năng đang bảo trì");
                        }
                        break;
                    case ConstNpc.TUTORIAL_RONG_XUONG:
                        if (select == 0) {
                            NpcService.gI().createTutorial(player, -1, GoiRongXuong.RONG_XUONG_TUTORIAL);
                        }
                        break;
                    case ConstNpc.RONG_HALLOWEN:
                        if (select == 0) {
                            NpcService.gI().createTutorial(player, -1, GoiRongXuong.RONG_XUONG_TUTORIAL);
                        } else if (select == 1) {
                            GoiRongXuong.gI().summonRongxuong(player);
                        }
                        break;
                    case ConstNpc.MENU_OPTION_USE_ITEM1105:
                        if (select == 0) {
                            IntrinsicService.gI().sattd(player);
                        } else if (select == 1) {
                            IntrinsicService.gI().satnm(player);
                        } else if (select == 2) {
                            IntrinsicService.gI().setxd(player);
                        }
                        break;
                    case ConstNpc.MENU_OPTION_USE_ITEM2000:
                    case ConstNpc.MENU_OPTION_USE_ITEM2001:
                    case ConstNpc.MENU_OPTION_USE_ITEM2002:
                        try {
                            ItemService.gI().OpenSKH(player, player.iDMark.getIndexMenu(), select);
                        } catch (Exception e) {
                            Logger.error("Lỗi mở hộp quà");
                        }
                        break;
                    case ConstNpc.MENU_OPTION_USE_ITEM2003:
                    case ConstNpc.MENU_OPTION_USE_ITEM2004:
                    case ConstNpc.MENU_OPTION_USE_ITEM2005:
                        try {
                            ItemService.gI().OpenDHD(player, player.iDMark.getIndexMenu(), select);
                        } catch (Exception e) {
                            Logger.error("Lỗi mở hộp quà");
                        }
                        break;
                    case ConstNpc.MENU_OPTION_USE_ITEM736:
                        try {
                            ItemService.gI().OpenDHD(player, player.iDMark.getIndexMenu(), select);
                        } catch (Exception e) {
                            Logger.error("Lỗi mở hộp quà");
                        }
                        break;
                    case ConstNpc.INTRINSIC:
                        if (select == 0) {
                            IntrinsicService.gI().showAllIntrinsic(player);
                        } else if (select == 1) {
                            IntrinsicService.gI().showConfirmOpen(player);
                        } else if (select == 2) {
                            IntrinsicService.gI().showConfirmOpenVip(player);
                        }
                        break;
                    case ConstNpc.CONFIRM_OPEN_INTRINSIC:
                        if (select == 0) {
                            IntrinsicService.gI().open(player);
                        }
                        break;
                    case ConstNpc.CONFIRM_OPEN_INTRINSIC_VIP:
                        if (select == 0) {
                            IntrinsicService.gI().openVip(player);
                        }
                        break;
                    case ConstNpc.CONFIRM_LEAVE_CLAN:
                        if (select == 0) {
                            ClanService.gI().leaveClan(player);
                        }
                        break;
                    case ConstNpc.CONFIRM_NHUONG_PC:
                        if (select == 0) {
                            ClanService.gI().phongPc(player, (int) PLAYERID_OBJECT.get(player.id));
                        }
                        break;
                    case ConstNpc.BAN_PLAYER:
                        if (select == 0) {
                            PlayerService.gI().banPlayer((Player) PLAYERID_OBJECT.get(player.id));
                            Service.getInstance().sendThongBao(player, "Ban người chơi " + ((Player) PLAYERID_OBJECT.get(player.id)).name + " thành công");
                        }
                        break;

                    case ConstNpc.BUFF_PET:
                        if (select == 0) {
                            Player pl = (Player) PLAYERID_OBJECT.get(player.id);
                            if (pl.pet == null) {
                                PetService.gI().createNormalPet(pl);
                                Service.getInstance().sendThongBao(player, "Phát đệ tử cho " + ((Player) PLAYERID_OBJECT.get(player.id)).name + " thành công");
                            }
                        }
                        break;
                    case ConstNpc.MENU_ADMIN:
                        switch (select) {
                            case 0:
                                for (int i = 14; i <= 20; i++) {
                                    Item item = ItemService.gI().createNewItem((short) i);
                                    InventoryServiceNew.gI().addItemBag(player, item);
                                }
                                InventoryServiceNew.gI().sendItemBags(player);
                                break;
                            case 1:
                                if (player.pet == null) {
                                    PetService.gI().createNormalPet(player);
                                } else {
                                    if (player.pet.typePet == 1) {
                                        PetService.gI().changePicPet(player);
                                    } else if (player.pet.typePet == 2) {
                                        PetService.gI().changeMabuPet(player);
                                    }
                                    PetService.gI().changeBerusPet(player);
                                }
                                break;
                            case 2:
                                if (player.isAdmin()) {
                                    System.out.println(player.name);
//                                PlayerService.gI().baoTri();
                                    Maintenance.gI().start(15);
                                    System.out.println(player.name);
                                }
                                break;
                            case 3:
                                Input.gI().createFormFindPlayer(player);
                                break;
                            case 4:
                                Input.gI().createFormBuffItemVip(player);
                                break;
                            case 5:
                                if (InventoryServiceNew.gI().getCountEmptyBag(player) > 0) {
                                    if (player.inventory.itemsBody.get(0).quantity < 1
                                            && player.inventory.itemsBody.get(1).quantity < 1
                                            && player.inventory.itemsBody.get(2).quantity < 1
                                            && player.inventory.itemsBody.get(3).quantity < 1
                                            && player.inventory.itemsBody.get(4).quantity < 1) {
                                        player.gender += 1;
                                        if (player.gender > 2) {
                                            player.gender = 0;
                                        }
                                        short[] headtd = {30, 31, 64};
                                        short[] headnm = {9, 29, 32};
                                        short[] headxd = {27, 28, 6};
                                        player.playerSkill.skills.clear();
                                        for (Skill skill : player.playerSkill.skills) {
                                            skill.point = 1;
                                        }
                                        int[] skillsArr = player.gender == 0 ? new int[]{0, 1, 6, 9, 10, 20, 22, 24, 19}
                                                : player.gender == 1 ? new int[]{2, 3, 7, 11, 12, 17, 18, 26, 19}
                                                : new int[]{4, 5, 8, 13, 14, 21, 23, 25, 19};
                                        for (int i = 0; i < skillsArr.length; i++) {
                                            player.playerSkill.skills.add(SkillUtil.createSkill(skillsArr[i], 1));
                                        }
                                        player.playerIntrinsic.intrinsic = IntrinsicService.gI().getIntrinsicById(0);
                                        player.playerIntrinsic.intrinsic.param1 = 0;
                                        player.playerIntrinsic.intrinsic.param2 = 0;
                                        player.playerIntrinsic.countOpen = 0;
                                        switch (player.gender) {
                                            case 0:
                                                player.head = headtd[Util.nextInt(headtd.length)];
                                                break;
                                            case 1:
                                                player.head = headnm[Util.nextInt(headnm.length)];
                                                break;
                                            case 2:
                                                player.head = headxd[Util.nextInt(headxd.length)];
                                                break;
                                            default:
                                                break;
                                        }
                                        Service.gI().sendThongBao(player, "|1|Đổi hành tinh thành công");
                                        Service.gI().player(player);
                                        Service.getInstance().sendFlagBag(player);
                                        Service.getInstance().Send_Caitrang(player);
                                        PlayerService.gI().sendInfoHpMpMoney(player);
                                        Service.gI().Send_Info_NV(player);
                                    } else {
                                        Service.gI().sendThongBao(player, "Tháo hết 5 món đầu đang mặc ra nha");
                                    }
                                } else {
                                    Service.gI().sendThongBao(player, "Balo đầy");
                                }
                                Service.gI().player(player);
                                InventoryServiceNew.gI().sendItemBags(player);
                                Service.gI().sendMoney(player);
                                break;
                        }
                        break;
                    case ConstNpc.BAN_NHIEU_THOI_VANG:
                        Item thoivang = InventoryServiceNew.gI().findItemBag(player, 457);
                        switch (select) {
                            case 0:
                                if (select == 0 && (thoivang == null || thoivang.quantity < 1) && player.inventory.gold <= 950_000_000_000L) {
                                    Service.gI().sendThongBao(player, "Cần có đủ 1 Thỏi\nvàng để thực hiện");
                                    return;
                                }
                                if (select == 0 && thoivang != null && thoivang.quantity >= 1 && player.inventory.gold > 950_000_000_000L) {
                                    Service.gI().sendThongBao(player, "Số vàng sau khi bán vượt quá 10 tỷ");
                                    return;
                                }
                                if (thoivang != null && thoivang.quantity >= 1 && player.inventory.gold <= 950_000_000_000L) {
                                    player.inventory.gold += 500_000_000;
                                    Service.gI().sendThongBao(player, "|4|Bạn nhận được 500 Triệu Vàng");
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, thoivang, 1);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    Service.gI().sendMoney(player);
                                    break;
                                }
                                break;
                            case 1:
                                if ((thoivang == null || thoivang.quantity < 5) && player.inventory.gold <= 950_000_000_000L) {
                                    Service.gI().sendThongBao(player, "Cần có đủ 5 Thỏi\nvàng để thực hiện");
                                    return;
                                }
                                if (thoivang != null && thoivang.quantity >= 5 && player.inventory.gold > 950_000_000_000L) {
                                    Service.gI().sendThongBao(player, "Số vàng sau khi bán vượt quá 10 tỷ");
                                    return;
                                }
                                if (thoivang != null && thoivang.quantity >= 5 && player.inventory.gold <= 950_000_000_000L) {
                                    player.inventory.gold += 2_500_000_000L;
                                    Service.gI().sendThongBao(player, "|4|Bạn nhận được 2,5 Tỷ Vàng");
                                    Service.gI().sendMoney(player);
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, thoivang, 5);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    break;
                                }
                                break;
                            case 2:
                                if ((thoivang == null || thoivang.quantity < 10) && player.inventory.gold < 950_000_000_000L) {
                                    Service.gI().sendThongBao(player, "Cần có đủ 10 Thỏi\nvàng để thực hiện");
                                    return;
                                }
                                if (thoivang != null && thoivang.quantity >= 10 && player.inventory.gold > 950_000_000_000L) {
                                    Service.gI().sendThongBao(player, "Số vàng sau khi bán vượt quá 10 tỷ");
                                    return;
                                }
                                if (thoivang != null && thoivang.quantity >= 10 && player.inventory.gold <= 950_000_000_000L) {
                                    player.inventory.gold += 5_000_000_000L;
                                    Service.gI().sendThongBao(player, "|4|Bạn nhận được 5 Tỷ Vàng");
                                    Service.gI().sendMoney(player);
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, thoivang, 10);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    break;
                                }
                                break;
                            case 3:
                                if ((thoivang == null || thoivang.quantity < 100) && player.inventory.gold <= 950_000_000_000L) {
                                    Service.gI().sendThongBao(player, "Cần có đủ 100 Thỏi\nvàng để thực hiện");
                                    return;
                                }
                                if (thoivang != null && thoivang.quantity >= 100 && player.inventory.gold > 950_000_000_000L) {
                                    Service.gI().sendThongBao(player, "Số vàng sau khi bán vượt quá 1000 tỷ");
                                    return;
                                }
                                if (thoivang != null && thoivang.quantity >= 100 && player.inventory.gold <= 950_000_000_000L) {
                                    player.inventory.gold += 50_000_000_000L;
                                    Service.gI().sendThongBao(player, "|4|Bạn nhận được 50 Tỷ Vàng");
                                    Service.gI().sendMoney(player);
                                    InventoryServiceNew.gI().subQuantityItemsBag(player, thoivang, 100);
                                    InventoryServiceNew.gI().sendItemBags(player);
                                    break;
                                }
                        }
                        break;
                    case ConstNpc.MINI_GAME:
                        switch (select) {
                            case 0:
                                createOtherMenu(player, ConstNpc.IGNORE_MENU, "|5|Có 2 nhà cái Tài và Xĩu, bạn chỉ được chọn 1 nhà để tham gia"
                                        + "\n\n|6|Sau khi kết thúc thời gian đặt cược. Hệ thống sẽ tung xí ngầu để biết kết quả Tài Xỉu"
                                        + "\n\nNếu Tổng số 3 con xí ngầu <=10 : XỈU\nNếu Tổng số 3 con xí ngầu >10 : TÀI\nNếu 3 Xí ngầu cùng 1 số : TAM HOA (Nhà cái lụm hết)"
                                        + "\n\n|7|Lưu ý: Số Hồng ngọc nhận được sẽ bị nhà cái lụm đi 20%. Trong quá trình diễn ra khi đặt cược nếu thoát game sẽ bị MẤT TIỀN ĐẶT CƯỢC", "Ok");
                                break;
                            case 1:
                                String time = ((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) + " giây";
                                if (TaiXiu.gI().baotri == false) {
                                    if (player.goldTai == 0 && player.goldXiu == 0) {
                                        createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                                + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                                + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time, "Cập nhập", "Theo TÀI", "Theo XỈU", "Đóng");
                                    } else if (player.goldTai > 0) {
                                        createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                                + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                                + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time + "\n\n|7|Bạn đã cược Tài : " + Util.format(player.goldTai) + " Hồng ngọc", "Cập nhập", "Đóng");
                                    } else {
                                        createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                                + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                                + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time + "\n\n|7|Bạn đã cược Xỉu : " + Util.format(player.goldXiu) + " Hồng ngọc", "Cập nhập", "Đóng");
                                    }
                                } else {
                                    if (player.goldTai == 0 && player.goldXiu == 0) {
                                        createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                                + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                                + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time + "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
                                    } else if (player.goldTai > 0) {
                                        createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                                + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                                + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time + "\n\n|7|Bạn đã cược Tài : " + Util.format(player.goldTai) + " Hồng ngọc" + "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
                                    } else {
                                        createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI-XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                                + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                                + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time + "\n\n|7|Bạn đã cược Xỉu : " + Util.format(player.goldXiu) + " Hồng ngọc" + "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
                                    }
                                }
                                break;
                        }
                        break;
                    case ConstNpc.TAIXIU:
                        String time = ((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) + " giây";
                        if (((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && player.goldTai == 0 && player.goldXiu == 0 && TaiXiu.gI().baotri == false) {
                            switch (select) {
                                case 0:
                                    createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                            + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time, "Cập nhập", "Theo TÀI", "Theo XỈU", "Đóng");
                                    break;
                                case 1:
                                    if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_24_0) {
                                        Input.gI().TAI_taixiu(player);
                                    } else {
                                        Service.getInstance().sendThongBao(player, "Bạn chưa đủ điều kiện để chơi");
                                    }
                                    break;
                                case 2:
                                    if (TaskService.gI().getIdTask(player) >= ConstTask.TASK_24_0) {
                                        Input.gI().XIU_taixiu(player);
                                    } else {
                                        Service.getInstance().sendThongBao(player, "Bạn chưa đủ điều kiện để chơi");
                                    }
                                    break;
                            }
                        } else if (((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && player.goldTai > 0 && TaiXiu.gI().baotri == false) {
                            switch (select) {
                                case 0:
                                    createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                            + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time + "\n\n|7|Bạn đã cược Tài : " + Util.format(player.goldTai) + " Hồng ngọc", "Cập nhập", "Đóng");
                                    break;
                            }
                        } else if (((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && player.goldXiu > 0 && TaiXiu.gI().baotri == false) {
                            switch (select) {
                                case 0:
                                    createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                            + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time + "\n\n|7|Bạn đã cược Xỉu : " + Util.format(player.goldXiu) + " Hồng ngọc", "Cập nhập", "Đóng");
                                    break;
                            }
                        } else if (((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && player.goldTai > 0 && TaiXiu.gI().baotri == true) {
                            switch (select) {
                                case 0:
                                    createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                            + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time + "\n\n|7|Bạn đã cược Tài : " + Util.format(player.goldTai) + " Hồng ngọc" + "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
                                    break;
                            }
                        } else if (((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && player.goldXiu > 0 && TaiXiu.gI().baotri == true) {
                            switch (select) {
                                case 0:
                                    createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                            + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time + "\n\n|7|Bạn đã cược Xỉu : " + Util.format(player.goldXiu) + " Hồng ngọc" + "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
                                    break;
                            }
                        } else if (((TaiXiu.gI().lastTimeEnd - System.currentTimeMillis()) / 1000) > 0 && player.goldXiu == 0 && player.goldTai == 0 && TaiXiu.gI().baotri == true) {
                            switch (select) {
                                case 0:
                                    createOtherMenu(player, ConstNpc.TAIXIU, "\n|7|---NHÀ CÁI TÀI XỈU---\n\n|3|Kết quả kì trước:  " + TaiXiu.gI().x + " : " + TaiXiu.gI().y + " : " + TaiXiu.gI().z
                                            + "\n\n|6|Tổng nhà TÀI: " + Util.format(TaiXiu.gI().goldTai) + " Hồng ngọc"
                                            + "\n\nTổng nhà XỈU: " + Util.format(TaiXiu.gI().goldXiu) + " Hồng ngọc\n\n|5|Thời gian còn lại: " + time + "\n\n|7|Hệ thống sắp bảo trì", "Cập nhập", "Đóng");
                                    break;
                            }
                        }
                        break;
                    case ConstNpc.NpcThanThu:
                        if (player.TrieuHoiCapBac != -1) {
                            switch (select) {
                                case 0:
                                    Service.gI().showthanthu(player);
                                    break;
                                case 1:
                                    if (player.inventory.ruby < 200) {
                                        Service.gI().sendThongBaoOK(player,
                                                "Không đủ Hồng ngọc");
                                        return;
                                    }
                                    player.inventory.ruby -= 200;
                                    player.TrieuHoiThucAn++;
                                    if (player.TrieuHoiThucAn > 200) {
                                        player.TrieuHoiCapBac = -1;
                                        Service.gI().sendThongBaoOK(player,
                                                "Vì cho Chiến Thần ăn quá no nên Chiến Thần đã bạo thể mà chết.");
                                    } else {
                                        Service.gI().sendThongBao(player,
                                                "|2|Thức ăn: " + player.TrieuHoiThucAn
                                                + "%\n|1|Đã cho Chiến Thần ăn\n|7|Lưu ý: khi cho quá 200% Chiến Thần sẽ no quá mà chết");
                                    }
                                    Service.gI().showthanthu(player);
                                    break;
                                case 2:
                                    if(player.TrieuHoipet != null){
                                        player.TrieuHoipet.changeStatus(Thu_TrieuHoi.FOLLOW);
                                    }
                                    break;
                                case 3:
                                    if(player.TrieuHoipet != null){
                                        player.TrieuHoipet.changeStatus(Thu_TrieuHoi.ATTACK_PLAYER);
                                        player.TrieuHoipet.effectSkill.removeSkillEffectWhenDie();
                                        Service.gI().sendThongBao(player, "|2|Đã xóa trạng thái bất lợi cho Chiến Thần");
                                    }
                                    break;
                                case 4:
                                    if(player.TrieuHoipet != null){
                                        player.TrieuHoipet.changeStatus(Thu_TrieuHoi.ATTACK_MOB);
                                    }
                                    break;
                                case 5:
                                    if(player.TrieuHoipet != null){
                                        player.TrieuHoipet.changeStatus(Thu_TrieuHoi.GOHOME);
                                    }
                                    break;
                                case 6:
                                    if (player.trangthai == false) {
                                        player.trangthai = true;
                                        if (player.inventory.ruby < 200) {
                                            Service.gI().sendThongBao(player,
                                                    "|7|Không đủ Hồng ngọc");
                                            return;
                                        }
                                        player.inventory.ruby -= 200;
                                        player.TrieuHoiThucAn++;
                                        player.Autothucan = System.currentTimeMillis();
                                        if (player.TrieuHoiThucAn > 200) {
                                            player.TrieuHoiCapBac = -1;
                                            Service.gI().sendThongBao(player,
                                                    "|7|Vì cho Chiến Thần ăn quá no nên Chiến Thần đã bạo thể mà chết.");
                                        } else {
                                            Service.gI().sendThongBao(player,
                                                    "|2|Thức ăn Chiến Thần: " + player.TrieuHoiThucAn
                                                    + "%\n|1|Đã cho Chiến Thần ăn\n|7|Lưu ý: khi cho quá 200% Chiến Thần sẽ no quá mà chết");
                                        }
                                    } else {
                                        Service.gI().sendThongBao(player,
                                                "|1|Đã dừng Auto cho Chiến Thần ăn");
                                        player.trangthai = false;
                                    }
                                    break;
                                case 7:
                                    if (player.TrieuHoiCapBac != -1 && player.TrieuHoiCapBac < 10) {
                                        NpcService.gI().createMenuConMeo(player, ConstNpc.DOT_PHA_THANTHU, 12713,
                                                "|7|ĐỘT PHÁ CHIẾN THẦN "
                                                + "\n\n|2|Cấp bậc hiện tại: " + player.NameThanthu(player.TrieuHoiCapBac)
                                                + "\n|2|Level: " + player.TrieuHoiLevel
                                                + "\n|2|Kinh nghiệm: " + Util.format(player.TrieuHoiExpThanThu)
                                                + "\n|1| Yêu cầu Chiến Thần đạt cấp 100"
                                                + "\n\n|7|Cần: " + (player.TrieuHoiCapBac + 1) * 9 + " " + player.DaDotpha(player.TrieuHoiCapBac)
                                                + "\nĐể Đột phá lên Cấp bậc " + player.NameThanthu(player.TrieuHoiCapBac + 1)
                                                + "\b\b|3|*Thành công: Cấp bậc Chiến Thần nâng 1 bậc và Level trở về 0"
                                                + "\b|3|*Thất bại: Trừ nguyên liệu Đột phá"
                                                + "\b|1|Mỗi khi đột phá đạt Cấp bậc: Hóa Thần, Đại Thừa Kỳ, Đế Tiên\n=>Chiến Thần sẽ nhận được Hào quang mới"
                                                + "\b|6|-----------------------------"
                                                + "\n|7|Tỉ lệ Thành công: " + (100 - player.TrieuHoiCapBac * 10) + "%",
                                                "Đột phá", "Đóng");
                                    } else {
                                        NpcService.gI().createMenuConMeo(player, ConstNpc.DOT_PHA_THANTHU, 12713,
                                                "|7|ĐỘT PHÁ CHIẾN THẦN "
                                                + "\n\n|2|Cấp bậc hiện tại: " + player.NameThanthu(player.TrieuHoiCapBac)
                                                + "\n|7| Chiến thần của bạn đã đạt Cấp bậc Cao nhất",
                                                "Đóng");
                                    }
                                    break;
                            }
                        } else {
                            Service.gI().sendThongBao(player, "|7|Bạn chưa có Chiến Thần để sài tính năng này.");
                        }
                        break;
                    case ConstNpc.DOT_PHA_THANTHU:
                        switch (select) {
                            case 0:
                                Item linhthach = null;
                                try {
                                    if (player.TrieuHoiCapBac != -1 && player.TrieuHoiCapBac >= 0 && player.TrieuHoiCapBac < 4) {
                                        linhthach = InventoryServiceNew.gI().findItemBag(player, 1266);
                                    } else {
                                        linhthach = InventoryServiceNew.gI().findItemBag(player, 1269 - player.TrieuHoiCapBac);
                                    }
                                } catch (Exception e) {
                                    System.out.println("vvvvv");
                                }
                                if (player.TrieuHoiCapBac != -1 && player.TrieuHoiLevel == 100 && player.TrieuHoiCapBac < 10) {
                                    if (linhthach != null && linhthach.quantity >= (player.TrieuHoiCapBac + 1) * 9) {
                                        if (Util.isTrue(100 - player.TrieuHoiCapBac * 10, 100)) {
                                            InventoryServiceNew.gI().subQuantityItemsBag(player, linhthach, (player.TrieuHoiCapBac + 1) * 9);
                                            player.TrieuHoiLevel = 0;
                                            player.TrieuHoiExpThanThu = 0;
                                            player.TrieuHoiCapBac++;
                                            InventoryServiceNew.gI().sendItemBags(player);
                                            Service.gI().sendThongBao(player, "|2|HAHAHA Chiến Thần đã tấn thăng " + player.NameThanthu(player.TrieuHoiCapBac) + " rồi\nTất cả quỳ xuống !!");
                                        } else {
                                            InventoryServiceNew.gI().subQuantityItemsBag(player, linhthach, (player.TrieuHoiCapBac + 1) * 9);
                                            InventoryServiceNew.gI().sendItemBags(player);
                                            Service.gI().sendThongBao(player, "|7|Khốn khiếp, lại đột phá thất bại rồi");
                                        }
                                    } else {
                                        Service.gI().sendThongBao(player, "|7| Chưa đủ " + player.DaDotpha(player.TrieuHoiCapBac));
                                    }
                                } else {
                                    Service.gI().sendThongBao(player, "|7| Yêu cầu Chiến Thần đạt Cấp 100");
                                }
                                break;
                        }
                        break;
                    case ConstNpc.INFO_ALL:
                        switch (select) {
                            case 0:
                                NpcService.gI().createMenuConMeo(player, ConstNpc.INFO_ALL, 12713,
                                        "|7|THÔNG TIN NHÂN VẬT"
                                        + "\b\b|2|HP bản thân: " + Util.powerToStringnew(player.nPoint.hp) + "/" + Util.powerToStringnew(player.nPoint.hpMax)
                                        + "\b|2|KI bản thân: " + Util.powerToStringnew(player.nPoint.mp) + "/" + Util.powerToStringnew(player.nPoint.mpMax)
                                        + "\b|2|Sức đánh: " + Util.powerToStringnew(player.nPoint.dame)
                                        + "\b|2|Giáp: " + Util.powerToStringnew(player.nPoint.def)
                                        + "\b\b|1|HP Gốc: " + Util.powerToStringnew(player.nPoint.hpg)
                                        + "\b|1|KI Gốc: " + Util.powerToStringnew(player.nPoint.mpg)
                                        + "\b|1|Sức đánh Gốc: " + Util.powerToStringnew(player.nPoint.dameg)
                                        + "\b|1|Giáp Gốc: " + Util.powerToStringnew(player.nPoint.defg)
                                        + "\b\b|5|Tổng vàng nhặt: " + Util.format(player.vangnhat)
                                        + "\b|3|Tổng Hồng ngọc nhặt: " + Util.format(player.hngocnhat),
                                        "Thông tin\n nhân vật", "Thông tin\nđệ tử", "Thông tin\nđồ mặc", "Thông tin\nCấp bậc\nChiến Thần");
                                break;
                            case 1:
                                NpcService.gI().createMenuConMeo(player, ConstNpc.INFO_ALL, 12713,
                                        "|7|THÔNG TIN ĐỆ TỬ"
                                        + "\b\b|7|Hành tinh: " + Service.gI().get_HanhTinh(player.pet.gender)
                                        + "\b|2|HP ĐỆ TỬ: " + Util.powerToStringnew(player.pet.nPoint.hp) + "/" + Util.powerToStringnew(player.pet.nPoint.hpMax)
                                        + "\b|2|KI ĐỆ TỬ: " + Util.powerToStringnew(player.pet.nPoint.mp) + "/" + Util.powerToStringnew(player.pet.nPoint.mpMax)
                                        + "\b|2|Sức đánh: " + Util.powerToStringnew(player.pet.nPoint.dame)
                                        + "\b|2|Giáp: " + Util.powerToStringnew(player.pet.nPoint.def)
                                        + "\b\b|1|HP Gốc: " + Util.powerToStringnew(player.pet.nPoint.hpg)
                                        + "\b|1|KI Gốc: " + Util.powerToStringnew(player.pet.nPoint.mpg)
                                        + "\b|1|Sức đánh Gốc: " + Util.powerToStringnew(player.pet.nPoint.dameg)
                                        + "\b|1|Giáp Gốc: " + Util.powerToStringnew(player.pet.nPoint.defg),
                                        "Thông tin\n nhân vật", "Thông tin\nđệ tử", "Thông tin\nđồ mặc", "Thông tin\nCấp bậc\nChiến Thần");
                                break;
                            case 2:
                                NpcService.gI().createMenuConMeo(player, ConstNpc.CHISODO, 12713,
                                        "|1|Bạn muốn xem chỉ số đồ bị giới hạn hiện thị:",
                                        "Chỉ số\nô 1", "Chỉ số\nô 2", "Chỉ số\nô 3",
                                        "Chỉ số\nô 4", "Chỉ số\nô 5", "Chỉ số\nô 6",
                                        "Chỉ số\nô 7", "Chỉ số\nô 8", "Chỉ số\nô 9",
                                        "Chỉ số\nô 10", "Chỉ số\nô 11", "Chỉ số\nô 12");
                                break;
                            case 3:
                                NpcService.gI().createMenuConMeo(player, ConstNpc.INFO_ALL, 12679,
                                        "|7|THÔNG TIN CẤP BẬC CHIẾN THẦN"
                                        + "\b\b|4|-Luyện Khí: Tăng HP cho Chủ nhân"
                                        + "\b|5|-Trúc Cơ: Tăng KI cho Chủ nhân"
                                        + "\b|4|-Kim Đan: Tăng Sức đánh cho Chủ nhân"
                                        + "\b|5|-Nguyên Anh: Tăng HP,KI,SD cho Chủ nhân"
                                        + "\b|4|-Hóa Thần: Tăng HP,KI,SD,Giáp cho Chủ nhân"
                                        + "\b|5|-Luyện Hư: Tăng %SD cho Chủ nhân"
                                        + "\b|4|-Hợp Thể Kỳ: Tăng %SDCM cho Chủ nhân"
                                        + "\b|5|-Đại Thừa Kỳ: Tăng %HP,KI,Giáp,SD cho Chủ nhân"
                                        + "\b|3|-Độ Kiếp Kỳ - Vực Chủ Cảnh - Đế Tiên"
                                        + "\b|3|=> Tăng %HP,KI,Giáp,SD cho Chủ nhân. Farm Hồng ngọc"
                                        + "\b\b|7| Lưu ý: Chỉ số cộng thêm cũng như Hồng ngọc tìm được sẽ Tăng theo cấp Chiến Thần (MAX: Cấp 100)",
                                        "Thông tin\n nhân vật", "Thông tin\nđệ tử", "Thông tin\nđồ mặc", "Thông tin\nCấp bậc\nChiến Thần");
                                break;
                        }
                        break;
                    case ConstNpc.CHISODO: {
                        Item it = player.inventory.itemsBody.get(select);
                        if (it.quantity < 1) {
                            NpcService.gI().createMenuConMeo(player, ConstNpc.CHISODO, 12713,
                                    "|7|Ô này không có đồ!!!"
                                    + "\nBạn muốn xem chỉ số đồ bị giới hạn hiện thị:",
                                    "Chỉ số\nô 1", "Chỉ số\nô 2", "Chỉ số\nô 3",
                                    "Chỉ số\nô 4", "Chỉ số\nô 5", "Chỉ số\nô 6",
                                    "Chỉ số\nô 7", "Chỉ số\nô 8", "Chỉ số\nô 9",
                                    "Chỉ số\nô 10", "Chỉ số\nô 11", "Chỉ số\nô 12");
                            return;
                        }
                        NpcService.gI().createMenuConMeo(player, ConstNpc.CHISODO, 12713,
                                "|2|Tên Vật phẩm: " + it.template.name
                                + "\n|7|Chỉ số:"
                                + "\n|1|" + it.getInfo(),
                                "Chỉ số\nô 1", "Chỉ số\nô 2", "Chỉ số\nô 3",
                                "Chỉ số\nô 4", "Chỉ số\nô 5", "Chỉ số\nô 6",
                                "Chỉ số\nô 7", "Chỉ số\nô 8", "Chỉ số\nô 9",
                                "Chỉ số\nô 10", "Chỉ số\nô 11", "Chỉ số\nô 12");
                    }
                    break;
                    case ConstNpc.CHISO_NHANH:
                        switch (select) {
                            case 0:
                                player.autocso = true;
                                player.autoHP = true;
                                Service.gI().sendThongBao(player, "|1|Bạn đang Auto cộng chỉ số HP");
                                Thread thread = new Thread(() -> {
                                    try {
                                        while (player.autocso && player.autoHP == true && player.nPoint != null) {
                                            player.nPoint.increasePoint((byte) 0, (short) 1);
                                            Thread.sleep(200);
                                        }
                                    } catch (Exception e) {
                                    }
                                });
                                thread.start(); // Khởi động luồng mới
                                break;
                            case 1:
                                player.autocso = true;
                                player.autoKI = true;
                                Service.gI().sendThongBao(player, "|1|Bạn đang Auto cộng chỉ số KI");
                                Thread thread1 = new Thread(() -> {
                                    try {
                                        while (player.autocso && player.autoKI == true && player.nPoint != null) {
                                            player.nPoint.increasePoint((byte) 1, (short) 1);
                                            Thread.sleep(200);
                                        }
                                    } catch (Exception e) {
                                    }
                                });
                                thread1.start(); // Khởi động luồng mới
                                break;
                            case 2:
                                player.autocso = true;
                                player.autoSD = true;
                                Service.gI().sendThongBao(player, "|1|Bạn đang Auto cộng chỉ số Sức đánh");
                                Thread thread2 = new Thread(() -> {
                                    try {
                                        while (player.autocso && player.autoSD == true && player.nPoint != null) {
                                            player.nPoint.increasePoint((byte) 2, (short) 1);
                                            Thread.sleep(200);
                                        }
                                    } catch (Exception e) {
                                    }
                                });
                                thread2.start(); // Khởi động luồng mới
                                break;
                            case 3:
                                player.autocso = true;
                                player.autoGiap = true;
                                Service.gI().sendThongBao(player, "|1|Bạn đang Auto cộng chỉ số Giáp");
                                Thread thread3 = new Thread(() -> {
                                    try {
                                        while (player.autocso && player.autoGiap == true && player.nPoint != null) {
                                            player.nPoint.increasePoint((byte) 3, (short) 1);
                                            Thread.sleep(200);
                                        }
                                    } catch (Exception e) {
                                    }
                                });
                                thread3.start(); // Khởi động luồng mới
                                break;
                        }
                        break;
                    case ConstNpc.menutd:
                        switch (select) {
                            case 0:
                                try {
                                    ItemService.gI().settaiyoken(player);
                                } catch (Exception e) {
                                }
                                break;
                            case 1:
                                try {
                                    ItemService.gI().setgenki(player);
                                } catch (Exception e) {
                                }
                                break;
                            case 2:
                                try {
                                    ItemService.gI().setkamejoko(player);
                                } catch (Exception e) {
                                }
                                break;
                        }
                        break;

                    case ConstNpc.menunm:
                        switch (select) {
                            case 0:
                                try {
                                    ItemService.gI().setgodki(player);
                                } catch (Exception e) {
                                }
                                break;
                            case 1:
                                try {
                                    ItemService.gI().setgoddam(player);
                                } catch (Exception e) {
                                }
                                break;
                            case 2:
                                try {
                                    ItemService.gI().setsummon(player);
                                } catch (Exception e) {
                                }
                                break;
                        }
                        break;

                    case ConstNpc.menuxd:
                        switch (select) {
                            case 0:
                                try {
                                    ItemService.gI().setgodgalick(player);
                                } catch (Exception e) {
                                }
                                break;
                            case 1:
                                try {
                                    ItemService.gI().setmonkey(player);
                                } catch (Exception e) {
                                }
                                break;
                            case 2:
                                try {
                                    ItemService.gI().setgodhp(player);
                                } catch (Exception e) {
                                }
                                break;
                        }
                        break;

                    case ConstNpc.CONFIRM_DISSOLUTION_CLAN:
                        switch (select) {
                            case 0:
                                Clan clan = player.clan;
                                clan.deleteDB(clan.id);
                                Manager.CLANS.remove(clan);
                                player.clan = null;
                                player.clanMember = null;
                                ClanService.gI().sendMyClan(player);
                                ClanService.gI().sendClanId(player);
                                Service.getInstance().sendThongBao(player, "Đã giải tán bang hội.");
                                break;
                        }
                        break;
                    case ConstNpc.CONFIRM_ACTIVE:
                        switch (select) {
                            case 0:
                                if (player.getSession().goldBar >= 20) {
                                    player.getSession().actived = true;
                                    if (PlayerDAO.subGoldBar(player, 20)) {
                                        Service.getInstance().sendThongBao(player, "Đã mở thành viên thành công!");
                                        break;
                                    } else {
                                        this.npcChat(player, "Lỗi vui lòng báo admin...");
                                    }
                                }
//                                Service.getInstance().sendThongBao(player, "Bạn không có vàng\n Vui lòng NROGOD.COM để nạp thỏi vàng");
                                break;
                        }
                        break;
                    case ConstNpc.CONFIRM_REMOVE_ALL_ITEM_LUCKY_ROUND:
                        if (select == 0) {
                            for (int i = 0; i < player.inventory.itemsBoxCrackBall.size(); i++) {
                                player.inventory.itemsBoxCrackBall.set(i, ItemService.gI().createItemNull());
                            }
                            player.inventory.itemsBoxCrackBall.clear();
                            Service.getInstance().sendThongBao(player, "Đã xóa hết vật phẩm trong rương");
                        }
                        break;
                    case ConstNpc.MENU_FIND_PLAYER:
                        Player p = (Player) PLAYERID_OBJECT.get(player.id);
                        if (p != null) {
                            switch (select) {
                                case 0:
                                    if (p.zone != null) {
                                        ChangeMapService.gI().changeMapYardrat(player, p.zone, p.location.x, p.location.y);
                                    }
                                    break;
                                case 1:
                                    if (p.zone != null) {
                                        ChangeMapService.gI().changeMap(p, player.zone, player.location.x, player.location.y);
                                    }
                                    break;
                                case 2:
                                    Input.gI().createFormChangeName(player, p);
                                    break;
                                case 3:
                                    String[] selects = new String[]{"Đồng ý", "Hủy"};
                                    NpcService.gI().createMenuConMeo(player, ConstNpc.BAN_PLAYER, -1,
                                            "Bạn có chắc chắn muốn ban " + p.name, selects, p);
                                    break;
                                case 4:
                                    Service.getInstance().sendThongBao(player, "Kik người chơi " + p.name + " thành công");
                                    Client.gI().getPlayers().remove(p);
                                    Client.gI().kickSession(p.getSession());
                                    break;
                            }
                        }
                        break;
                    case ConstNpc.MENU_EVENT:
                        switch (select) {
                            case 0:
                                Service.getInstance().sendThongBaoOK(player, "Điểm sự kiện: " + player.inventory.event + " ngon ngon...");
                                break;
                            case 1:
                                Service.gI().showListTop(player, Manager.topSD);
                                break;
                            case 2:
                                Service.getInstance().sendThongBao(player, "Sự kiện đã kết thúc...");
//                                NpcService.gI().createMenuConMeo(player, ConstNpc.MENU_GIAO_BONG, -1, "Người muốn giao bao nhiêu bông...",
//                                        "100 bông", "1000 bông", "10000 bông");
                                break;
                            case 3:
                                Service.getInstance().sendThongBao(player, "Sự kiện đã kết thúc...");
//                                NpcService.gI().createMenuConMeo(player, ConstNpc.CONFIRM_DOI_THUONG_SU_KIEN, -1, "Con có thực sự muốn đổi thưởng?\nPhải giao cho ta 3000 điểm sự kiện đấy... ",
//                                        "Đồng ý", "Từ chối");
                                break;

                        }
                        break;
                    case ConstNpc.MENU_GIAO_BONG:
                        ItemService.gI().giaobong(player, (int) Util.tinhLuyThua(10, select + 2));
                        break;
                    case ConstNpc.CONFIRM_DOI_THUONG_SU_KIEN:
                        if (select == 0) {
                            ItemService.gI().openBoxVip(player);
                        }
                        break;
                    case ConstNpc.CONFIRM_TELE_NAMEC:
                        if (select == 0) {
                            NgocRongNamecService.gI().teleportToNrNamec(player);
                            player.inventory.subGemAndRuby(50);
                            Service.getInstance().sendMoney(player);
                        }
                        break;
                }
            }
        };
    }
}

/**
 * Code được viết bởi Hoàng Việt Vui lòng không sao chép mã nguồn này dưới mọi
 * hình thức.
 */
