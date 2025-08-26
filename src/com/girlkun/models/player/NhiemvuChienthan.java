package com.girlkun.models.player;

import java.util.ArrayList;
import java.util.List;
import com.girlkun.models.item.Item;


public class NhiemvuChienthan {


    public Item trainArmor;
    public List<String> giftCode;
    public List<Item> itemsBody;
    public List<Item> itemsBag;
    public List<Item> itemsBox;

    public List<Item> itemsBoxCrackBall;

    public int tasknow;
    public int dalamduoc;
    public int maxcount;
    public int maxtask;
    public int donechienthan;

    public NhiemvuChienthan() {
        itemsBody = new ArrayList<>();
        itemsBag = new ArrayList<>();
        itemsBox = new ArrayList<>();
        itemsBoxCrackBall = new ArrayList<>();
        giftCode = new ArrayList<>();
    }

    
    public boolean haveOption(List<Item> l , int index , int id){
        Item it = l.get(index);
        if(it != null && it.isNotNullItem()){
            return it.itemOptions.stream().anyMatch(op -> op != null && op.optionTemplate.id == id);
        }
        return false;
    }

    public void dispose() {
        if (this.trainArmor != null) {
            this.trainArmor.dispose();
        }
        this.trainArmor = null;
        if(this.itemsBody!= null){
            for(Item it : this.itemsBody){
                it.dispose();
            }
            this.itemsBody.clear();
        }
        if(this.itemsBag!= null){
            for(Item it : this.itemsBag){
                it.dispose();
            }
            this.itemsBag.clear();
        }
        if(this.itemsBox!= null){
            for(Item it : this.itemsBox){
                it.dispose();
            }
            this.itemsBox.clear();
        }
        if(this.itemsBoxCrackBall!= null){
            for(Item it : this.itemsBoxCrackBall){
                it.dispose();
            }
            this.itemsBoxCrackBall.clear();
        }
        this.itemsBody = null;
        this.itemsBag = null;
        this.itemsBox = null;
        this.itemsBoxCrackBall = null;
    }

}
