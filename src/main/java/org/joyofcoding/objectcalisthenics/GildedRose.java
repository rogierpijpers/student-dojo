package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
    }

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));
        return items;
    }

    public void updateQuality(List<Item> items) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            String name = item.getName();

            if (!name.equals("Aged Brie") && !name.equals("Backstage passes to a TAFKAL80ETC concert") && !name.equals("Sulfuras, Hand of Ragnaros")) {
                applyExpirableStrategy(item);
            }

            if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                applyBackstagePassesStrategy(item);
            }

            if(name.equals("Aged Brie")){
                applyAgedBriesStrategy(item);
            }
        }
    }

    private void applyAgedBriesStrategy(Item item){
        item.plusQuality();
        item.minusSellIn();
        if (item.getSellIn() < 0) {
            item.plusQuality();
        }
    }

    private void applyExpirableStrategy(Item item){
        item.minusQuality();
        item.minusSellIn();
        if (item.getSellIn() < 0) {
            item.minusQuality();
        }
    }

    private void applyBackstagePassesStrategy(Item item) {
        item.plusQuality();
        if (item.getSellIn() < 11) {
            item.plusQuality();
        }

        if (item.getSellIn() < 6) {
            item.plusQuality();
        }

        item.minusSellIn();
        if (item.getSellIn() < 0) {
            item.clearQuality();
        }
    }

}
