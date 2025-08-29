package com.girlkun.models.boss;

import com.girlkun.consts.ConstPlayer;
import com.girlkun.models.skill.Skill;
import com.girlkun.utils.Util;
import com.girlkun.jdbc.daos.PanelSettingDAO; // Import PanelSettingDAO
import com.girlkun.utils.Logger; // Import Logger

public class BossData {

    public String name;
    public byte gender;
    public short[] outfit;
    public int dame;
    public double[] hp;
    public int[] mapJoin;
    public int[][] skill;
    public String[] textChat1;
    public String[] textChat2;
    public String[] textChat3;
    public int secondsRest; // This will now be set dynamically
    public int[] bossJoinMapTogether;
    public byte typeAppear;

    public BossData(
            String name,
            byte gender,
            short[] outfit,
            int dame,
            double[] hp,
            int[] mapJoin,
            int[][] skill,
            String[] textChat1,
            String[] textChat2,
            String[] textChat3,
            int defaultSecondRest // This is the default value
    ) {
        this.name = name;
        this.gender = gender;
        this.outfit = outfit;
        this.dame = dame;
        this.hp = hp;
        this.mapJoin = mapJoin;
        this.skill = skill;
        this.textChat1 = textChat1;
        this.textChat2 = textChat2;
        this.textChat3 = textChat3;

        // Dynamic spawn time logic
        String spawnTimeKey = "BOSS_" + name.toUpperCase().replace(" ", "_") + "_SPAWN_TIME"; // Generate a unique key
        String spawnTimeStr = PanelSettingDAO.loadSetting(spawnTimeKey);
        int loadedSpawnTime = defaultSecondRest; // Default to hardcoded value

        if (spawnTimeStr != null) {
            try {
                loadedSpawnTime = Integer.parseInt(spawnTimeStr);
                Logger.success("Loaded dynamic spawn time for " + name + ": " + loadedSpawnTime + " seconds");
            } catch (NumberFormatException e) {
                Logger.logException(BossData.class, e, "Invalid spawn time setting for " + name + ": " + spawnTimeStr);
            }
        }
        this.secondsRest = loadedSpawnTime;
    }

    public BossData(
            String name,
            byte gender,
            short[] outfit,
            int dame,
            double[] hp,
            int[] mapJoin,
            int[][] skill,
            String[] textChat1,
            String[] textChat2,
            String[] textChat3,
            byte typeAppear // This is for TypeAppear enum
    ) {
        this(name, gender, outfit, dame, hp, mapJoin, skill, textChat1, textChat2, textChat3, 0); // Call the main constructor with a default 0 for secondsRest
        this.typeAppear = typeAppear;
    }

    public BossData(
            String name,
            byte gender,
            short[] outfit,
            int dame,
            double[] hp,
            int[] mapJoin,
            int[][] skill,
            String[] textChat1,
            String[] textChat2,
            String[] textChat3,
            int defaultSecondRest, // This is the default value
            int[] bossJoinMapTogether
    ) {
        this(name, gender, outfit, dame, hp, mapJoin, skill, textChat1, textChat2, textChat3, defaultSecondRest); // Call the main constructor
        this.bossJoinMapTogether = bossJoinMapTogether;
    }

    public static class Builder {
        private String name;
        private byte gender;
        private short[] outfit;
        private int dame;
        private double[] hp;
        private int[] mapJoin;
        private int[][] skillTemp;
        private String[] textChat1;
        private String[] textChat2;
        private String[] textChat3;
        private int secondsRest;
        private int[] bossJoinMapTogether;
        private byte typeAppear;

        public Builder name(String name) { this.name = name; return this; }
        public Builder gender(byte gender) { this.gender = gender; return this; }
        public Builder outfit(short[] outfit) { this.outfit = outfit; return this; }
        public Builder dame(int dame) { this.dame = dame; return this; }
        public Builder hp(double[] hp) { this.hp = hp; return this; }
        public Builder mapJoin(int[] mapJoin) { this.mapJoin = mapJoin; return this; }
        public Builder skillTemp(int[][] skillTemp) { this.skillTemp = skillTemp; return this; }
        public Builder textChat1(String[] textChat1) { this.textChat1 = textChat1; return this; }
        public Builder textChat2(String[] textChat2) { this.textChat2 = textChat2; return this; }
        public Builder textChat3(String[] textChat3) { this.textChat3 = textChat3; return this; }
        public Builder secondsRest(int secondsRest) { this.secondsRest = secondsRest; return this; }
        public Builder bossJoinMapTogether(int[] bossJoinMapTogether) { this.bossJoinMapTogether = bossJoinMapTogether; return this; }
        public Builder typeAppear(byte typeAppear) { this.typeAppear = typeAppear; return this; }

        public BossData build() {
            BossData bossData = new BossData(name, gender, outfit, dame, hp, mapJoin, skillTemp, textChat1, textChat2, textChat3, secondsRest);
            bossData.bossJoinMapTogether = this.bossJoinMapTogether;
            bossData.typeAppear = this.typeAppear;
            return bossData;
        }
    }

    public byte getTypeAppear() {
        return this.typeAppear;
    }
}