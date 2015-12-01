import java.util.Formatter;

/**
 * Created by DuyAnhPham on 27/08/15.
 */
public class Orderline {
    private Product orderProduct = new Product();
    private int orderCounter = 0;
    private double sum = 0;

    public Orderline (Assortment assortment, int product_number, int amount){
        this.orderProduct = assortment.getProduct(product_number);
        this.orderCounter = amount;
        this.sum = this.orderCounter * this.orderProduct.getPrice();
    }

    public String toString(){
        Formatter fmt = new Formatter();
        String s = fmt.format("%4d\t|%10s\t|\t%6.2f€\t|\t%4d\t|\t%8.2f€",
                this.orderProduct.getNumber(),
                this.orderProduct.getName(),
                this.orderProduct.getPrice(),
                this.orderCounter,
                this.sum).toString();
        return s;
    }

    public void printOrderline(){
        System.out.println("Orderline:");
        System.out.println(this);
    }

    public double returnSum(){
        return(this.sum);
    }
}
