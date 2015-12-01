import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 27/08/15.
 */
public class Order {

    private List<Orderline> listOrders = new ArrayList<>();
    private static long counter = 1;
    private long number;

    public Order(){
        this.number = counter++;
    }

    public void insertOrderlineIntoOrder(Orderline orderline){
        this.listOrders.add(orderline);
    }

    public void printOrderlines(){
        System.out.println("Order " + this.number);
        System.out.println("Product\t|\tName\t|\tPrice\t|\tAmount\t|\tTotal");
        System.out.println("----------------------------------------------------------");
        for (Orderline o:listOrders){
            System.out.println(o);
        }
        System.out.println();
    }

    public double returnResultSum(){
        double sum=0;
        for (Orderline o:listOrders){
            sum += o.returnSum();
        }
        return sum;
    }
}
