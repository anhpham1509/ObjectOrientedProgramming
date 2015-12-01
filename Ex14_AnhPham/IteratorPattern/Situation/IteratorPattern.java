package IteratorPattern.Situation;

import java.util.ArrayList;
import java.util.List;

public class IteratorPattern {

    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("Chair"));
        itemList.add(new Item("Table"));
        itemList.add(new Item("Bed"));

        ItemStorage itemStorage = new ItemStorage(itemList);

        for (Iterator iterator = itemStorage.getIterator(); iterator.isLast(); ) {
            Item item = iterator.nextItem();
            System.out.println("Item : " + item);
        }
    }
}