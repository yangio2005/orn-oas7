package com.girlkun.models.player;

import com.girlkun.services.MapService;
import com.girlkun.services.Service;

public class FightMabu {
    public final byte POINT_MAX = 20;

    public byte pointMabu = 0;
    private Player player;

    public void changePoint(byte pointAdd ){
        if(MapService.gI().isMapMaBu(player.zone.map.mapId)){
            pointMabu+=pointAdd;
            if (pointMabu>=POINT_MAX){
                Service.getInstance().sendThongBao(player, "Trận đại chiến đã kết thúc, tàu vận chuyển sẽ đưa bạn về nhà");
            }
        }
    }
}
