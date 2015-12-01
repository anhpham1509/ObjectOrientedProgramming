import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 27/08/15.
 */
public class Assortment {
    public Assortment(){
    }

    private List<Product> listProducts = new ArrayList<>();

    public void insertProduct(Product product){
        this.listProducts.add(product);
    }

    public void deleteProduct(int product_number){
        for (Product p:this.listProducts) {
            if (p.getNumber() == product_number) {
                this.listProducts.remove(this.listProducts.indexOf(p));
                break;
            }
        }
    }

    public Product getProduct(int product_number){
        for (Product p:this.listProducts) {
            if (p.getNumber() == product_number) {
                return p;
            }
        }
        return null;
    }

    public void printAssortment(){
        for(Product p:this.listProducts){
            System.out.println(p.toString());
        }
    }
}
