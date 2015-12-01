import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 30/08/15.
 */
public class Cafe {

    private Assortment cafeAssortment = new Assortment();
    private List<Order> cafeOrders = new ArrayList<>();

    public Cafe(Assortment assortment){
        this.cafeAssortment = assortment;
    }

    public void insertOrder(Order order){
        this.cafeOrders.add(order);
    }

    public void printOrders(){
        System.out.println("Cafe Orders");
        for (Order o:cafeOrders){
            o.printOrderlines();
        }
    }

}
