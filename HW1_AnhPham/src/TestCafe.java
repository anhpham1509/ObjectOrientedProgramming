/**
 * Created by DuyAnhPham on 30/08/15.
 */
public class TestCafe {

    public static void main(String[] arg){
        Assortment myAssortment = new Assortment();
        Cafe myCafe = new Cafe(myAssortment);

        //Create 3 different products
        Product p1 = new Product("Espresso", 205.8);
        Product p2 = new Product("Mocha", 200.9);
        Product p3 = new Product("Latte", 159.95);

        //Insert to Assortment
        myAssortment.insertProduct(p1);
        myAssortment.insertProduct(p2);
        myAssortment.insertProduct(p3);

        //Print Assortment
        System.out.println("Assortment created");
        myAssortment.printAssortment();
        System.out.println();

        //Delete product 2 (Mocha) and print Assortment again
        myAssortment.deleteProduct(2);
        System.out.println("Assortment after deleted Product no.2");
        myAssortment.printAssortment();
        System.out.println();

        //Create 2 Orderlines
        Orderline ol1 = new Orderline(myAssortment,1,4);
        Orderline ol2 = new Orderline(myAssortment,3,6);

        //Connect to Order
        Order o1 = new Order();
        o1.insertOrderlineIntoOrder(ol1);
        o1.insertOrderlineIntoOrder(ol2);

        //Insert to orderlist of Cafe
        myCafe.insertOrder(o1);

        //Create another order
        Orderline ol3 = new Orderline(myAssortment,3,6);
        Orderline ol4 = new Orderline(myAssortment,1,12);
        Order o2 = new Order();
        o2.insertOrderlineIntoOrder(ol3);
        o2.insertOrderlineIntoOrder(ol4);
        myCafe.insertOrder(o2);

        //Print whole orderlist of Cafe
        myCafe.printOrders();
    }
}
