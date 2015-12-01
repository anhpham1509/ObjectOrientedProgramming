import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 27/08/15.
 */
public class Order {

    private List<Orderline> listOrders = new ArrayList<>();

    public Order(){
    }

    public void insertOrderlineIntoOrder(Orderline orderline){
        this.listOrders.add(orderline);
    }

    public void printOrderlines(){
        System.out.println("Order");
        for (Orderline o:listOrders){
            System.out.println(o);
        }
    }

    public double returnResultSum(){
        double sum=0;
        for (Orderline o:listOrders){
            sum += o.returnSum();
        }
        return sum;
    }
}
