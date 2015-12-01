/**
 * Created by DuyAnhPham on 27/08/15.
 */
public class Test {

    public static void main(String[] main){
        Product p1 = new Product("P1", 200);
        Product p2 = new Product("P2", 200.9);
        Product p3 = new Product("P3", 159.95);
        Product p4 = new Product("P4", 2022.28);
        Product p5 = new Product("P5", 1346.476437);

        Assortment a = new Assortment();
        a.insertProduct(p1);
        a.insertProduct(p2);
        a.insertProduct(p3);
        a.insertProduct(p4);
        a.insertProduct(p5);

        a.printAssortment();

        a.deleteProduct(1);

        System.out.println(a.getProduct(3));

        a.printAssortment();

        Orderline o1 = new Orderline(a,2,4);
        Orderline o2 = new Orderline(a,3,6);

        o1.printOrderline();
        o1.returnSum();

        o2.printOrderline();
        o2.returnSum();

        Order lio = new Order();

        lio.insertOrderlineIntoOrder(o1);
        lio.insertOrderlineIntoOrder(o2);

        lio.printOrderlines();
        System.out.println(lio.returnResultSum());

    }
}
