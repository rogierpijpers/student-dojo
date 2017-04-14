package org.joyofcoding.objectcalisthenics;

/**
 * Created by Rogier on 27-3-2017.
 */
public class Quality {
    private int quality;

    public Quality(int quality){
        this.quality = quality;
    }

    public void plus(){
        if(quality < 50){
            quality += 1;
        }
    }

    public void minus(){
        if(quality > 0){
            quality -= 1;
        }
    }

    public void clear(){
        quality = 0;
    }

    public int getValue(){
        return quality;
    }
}
