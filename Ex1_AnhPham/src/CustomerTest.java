/**
 * Created by DuyAnhPham on 27/08/15.
 */
public class CustomerTest {

    public CustomerTest() {
    }

    public static void main(String[] arg){
        // Create 2 new Customers
        Customer cus1 = new Customer();
        Customer cus2 = new Customer();

        //Set Customer 1's properties
        cus1.setId(1599);
        cus1.setName("Hello");
        cus1.setBonus(0);

        //Set Customer 2's properties
        cus2.setId(2015);
        cus2.setName("World!");
        cus2.setBonus(0);

        //Get Customer 1's properties
        cus1.getId();
        cus1.getName();
        cus1.getBonus();

        //Get Customer 2's properties
        cus2.getId();
        cus2.getName();
        cus2.getBonus();

        //Create a new Customer by using 3 parameters constructor
        Customer cus3 = new Customer(1994, "Welcome", 0);

        //Create a new Customer by using 2 parameters constructor
        Customer cus4 = new Customer(2022, "Finland");
    }
}
