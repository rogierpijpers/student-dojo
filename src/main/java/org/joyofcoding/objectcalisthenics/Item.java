package org.joyofcoding.objectcalisthenics;

public class Item {
    private String name;
    private SellIn sellIn;
    private Quality quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = new Quality(quality);
        this.sellIn = new SellIn(sellIn);
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn.getValue();
    }

    public int getQuality() { return quality.getValue(); }

    public void plusQuality() {
        quality.plus();
    }

    public void minusQuality(){
        quality.minus();
    }

    public void clearQuality(){
        quality.clear();
    }

    public void plusSellIn(){
        sellIn.plus();
    }

    public void minusSellIn(){
        sellIn.minus();
    }
}
