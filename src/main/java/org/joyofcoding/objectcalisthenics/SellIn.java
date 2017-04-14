package org.joyofcoding.objectcalisthenics;

/**
 * Created by Rogier on 27-3-2017.
 */
public class SellIn {
    public int sellIn;

    public SellIn(int sellIn){
        this.sellIn = sellIn;
    }

    public int getValue(){
        return sellIn;
    }

    public void plus(){
        this.sellIn += 1;
    }

    public void minus(){
        this.sellIn -= 1;
    }
}
