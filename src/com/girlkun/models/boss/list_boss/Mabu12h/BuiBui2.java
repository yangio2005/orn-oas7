package com.girlkun.models.boss.list_boss.Mabu12h;

import com.girlkun.models.boss.Boss;
import com.girlkun.models.boss.BossID;
import com.girlkun.models.boss.BossStatus;
import com.girlkun.models.boss.BossesData;
import com.girlkun.models.map.ItemMap;
import com.girlkun.models.player.Player;
import com.girlkun.services.Service;
import com.girlkun.services.TaskService;
import com.girlkun.utils.Util;
import java.util.Random;


public class BuiBui2 extends Boss {

    public BuiBui2() throws Exception {
        super(BossID.BUI_BUI_2 , BossesData.BUI_BUI_2);
    }
     @Override
    public void reward(Player plKill) {
        short[] itemDos = new short[]{555, 557, 559, 556, 558, 560, 562, 564, 566, 563, 565, 567};
        byte[] NRs = new byte[]{15, 16};
        byte randomDo =(byte) new Random().nextInt(itemDos.length);
        byte randomNR =(byte) new Random().nextInt(NRs.length);
        if (Util.isTrue(10, 100)) {
            if (Util.isTrue(1, 5)) {
                Service.getInstance().dropItemMap(this.zone, Util.ratiItem(zone, 561, 1, this.location.x, this.location.y, plKill.id));
                return;
            }
            Service.getInstance().dropItemMap(this.zone, Util.ratiItem(zone, itemDos[randomDo], 1, this.location.x, this.location.y, plKill.id));
        } else {
            Service.getInstance().dropItemMap(this.zone, new ItemMap(zone, NRs[randomNR], 1, this.location.x, zone.map.yPhysicInTop(this.location.x, this.location.y - 24), plKill.id));
        }
         plKill.fightMabu.changePoint((byte) 20);
    }  
}





















