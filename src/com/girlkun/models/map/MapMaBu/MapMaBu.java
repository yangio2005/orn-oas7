package com.girlkun.models.map.MapMaBu;

import com.girlkun.models.item.Item;
import com.girlkun.models.map.ItemMap;
import com.girlkun.models.map.Map;
import com.girlkun.models.player.Player;
import com.girlkun.services.MapService;
import com.girlkun.services.PlayerService;
import com.girlkun.services.Service;
import com.girlkun.services.func.ChangeMapService;
import com.girlkun.utils.Logger;
import com.girlkun.utils.TimeUtil;
import com.girlkun.utils.Util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MapMaBu {



    public static final byte HOUR_OPEN_MAP_MABU = 21;
    public static final byte MIN_OPEN_MAP_MABU = 55;
    public static final byte SECOND_OPEN_MAP_MABU = 0;



    public static final byte HOUR_CLOSE_MAP_MABU = 22;
    public static final byte MIN_CLOSE_MAP_MABU = 60;
    public static final byte SECOND_CLOSE_MAP_MABU = 0;

    //    public static final byte HOUR_OPEN = 20;
//    public static final byte MIN_OPEN = 0;
//    public static final byte SECOND_OPEN = 0;
//
//    public static final byte HOUR_CAN_PICK_DB = 1;
//    public static final byte MIN_CAN_PICK_DB = 30;
//    public static final byte SECOND_CAN_PICK_DB = 0;
//
//    public static final byte HOUR_CLOSE = 21;
//    public static final byte MIN_CLOSE = 0;
//    public static final byte SECOND_CLOSE = 0;
    //*************************************
    public static final int AVAILABLE = 7;

    private static MapMaBu i;

    public static long TIME_OPEN_MABU;
    public static long TIME_CLOSE_MABU;

    private int day = -1;

    public static MapMaBu gI() {
        if (i == null) {
            i = new MapMaBu();
        }
        i.setTimeJoinMapMaBu();
        return i;
    }

    public void setTimeJoinMapMaBu() {
        if (i.day == -1 || i.day != TimeUtil.getCurrDay()) {
            i.day = TimeUtil.getCurrDay();
            try {
                this.TIME_OPEN_MABU = TimeUtil.getTime(TimeUtil.getTimeNow("dd/MM/yyyy") + " " + HOUR_OPEN_MAP_MABU + ":" + MIN_OPEN_MAP_MABU + ":" + SECOND_OPEN_MAP_MABU, "dd/MM/yyyy HH:mm:ss");
                this.TIME_CLOSE_MABU = TimeUtil.getTime(TimeUtil.getTimeNow("dd/MM/yyyy") + " " + HOUR_CLOSE_MAP_MABU + ":" + MIN_CLOSE_MAP_MABU + ":" + SECOND_CLOSE_MAP_MABU, "dd/MM/yyyy HH:mm:ss");
            } catch (Exception e) {
            }
        }
    }



    private void kickOutOfMapMabu(Player player) {
        if (player.cFlag == 1||player.cFlag == 2||player.cFlag == 3||player.cFlag == 4||player.cFlag == 5||player.cFlag == 6||player.cFlag == 7||player.cFlag == 8||player.cFlag == 11||player.cFlag == 12) {
            Service.getInstance().changeFlag(player, Util.nextInt(9, 10));
        }
        Service.getInstance().sendThongBao(player, "Trận đại chiến đã kết thúc, tàu vận chuyển sẽ đưa bạn về nhà");
        ChangeMapService.gI().changeMapBySpaceShip(player, player.gender + 21, -1, 250);
    }

    public void changeMap(Player player, byte index) {
        try {
            long now = System.currentTimeMillis();
            if (now > TIME_OPEN_MABU && now < TIME_CLOSE_MABU) {
                ChangeMapService.gI().changeMap(player,
                        player.mapMaBu.get(index).map.mapId, -1, 50, 50);
            } else {
                Service.getInstance().sendThongBao(player, "Đại chiến Ma Bư chưa mở");
                Service.getInstance().hideWaitDialog(player);
            }
        } catch (Exception ex) {
        }
    }

    public void joinMapMabu(Player player) {
        boolean changed = false;
        if (player.clan != null) {
            List<Player> players = player.zone.getPlayers();
            for (Player pl : players) {
                if (pl.clan != null && !player.equals(pl) && player.clan.equals(pl.clan) && !player.isBoss) {
                    Service.getInstance().changeFlag(player, Util.nextInt(9, 10));
                    changed = true;
                    break;
                }
            }
        }
        if (!changed && !player.isBoss) {
            Service.getInstance().changeFlag(player, Util.nextInt(9, 10));
        }
    }
    public void update(Player player) {
        if (player.zone == null || !MapService.gI().isMapBlackBallWar(player.zone.map.mapId)) {

            try {
                long now = System.currentTimeMillis();
                if (!(now > TIME_OPEN_MABU && now < TIME_CLOSE_MABU)) {

                } else {
                    kickOutOfMapMabu(player);
                }

            } catch (Exception ex) {
            }
        }

    }
}
