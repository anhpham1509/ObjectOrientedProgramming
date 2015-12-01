import java.util.Formatter;

/**
 * Created by DuyAnhPham on 27/08/15.
 */
public class Product {

    private static long counter = 1;

    private long number;
    private String name;
    private double price;

    // Constructors
    public Product() {
    }

    public Product(String name, double price) {
        this.number = counter++;
        setName(name);
        setPrice(price);
    }
    //End of Constructors

    //Set methods
    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    //End of Set methods

    //Get methods
    public long getNumber(){
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        Formatter fmt = new Formatter();
        String s = fmt.format("%4d\t|%10s\t|\t%6.2f€",
                this.getNumber(),
                this.getName(),
                this.getPrice()).toString();
        return s;
    }
    //End of Get methods
}