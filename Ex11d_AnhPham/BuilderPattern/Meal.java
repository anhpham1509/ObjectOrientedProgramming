package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class Meal {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public float getCost(){
        float Cost = 0.0f;

        for (Item item: itemList){
            Cost += item.price();
        }

        return Cost;
    }

    public  void showItems(){

        for (Item item:itemList){
            System.out.printf("Item: %s, Packing: %s, Price: %.3f\n", item.name(), item.packing().pack(), item.price());
        }
    }
}
