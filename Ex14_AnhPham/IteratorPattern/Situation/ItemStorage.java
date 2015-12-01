package IteratorPattern.Situation;

import java.util.ArrayList;
import java.util.List;

public class ItemStorage implements Container {
    public List<Item> itemList = new ArrayList<>();

    public ItemStorage(List<Item> itemList){
        this.itemList = itemList;
    }

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        public boolean isLast() {

            if (index < itemList.size()) {
                return true;
            }
            return false;
        }

        public Item nextItem() {

            if (this.isLast()) {
                return itemList.get(index++);
            }
            return null;
        }
    }
}