/**
 * Created by DuyAnhPham on 24/08/15.
 */
public class Customer {
    private long id;
    private String name;
    private double bonus;

    // Basic constructor
    public Customer(){
        this.setId(10001);
        this.setName("None");
        this.setBonus(0.0);
        System.out.println("\nCreated a new customer!");
    }

    // Three parameters constructor
    public Customer(long cusId, String cusName, double cusBonus){
        this.setAll(cusId, cusName, cusBonus);
        System.out.println("\nCreated a new customer!");
        this.getAll();
    }

    // Two parameters constructor
    public Customer(long cusID, String cusName){
        this.setAll(cusID, cusName, 20.0);
        System.out.println("\nCreated a new customer!");
        this.getAll();
    }

    // Set methods
    public void setId(long n){
        this.id = n;
    }

    public void setName(String s){
        this.name = s;
    }

    public void setBonus(double b) {
        this.bonus = b;
    }

    public void setAll(long setId, String setName, double setBonus){
        this.id = setId;
        this.name = setName;
        this.bonus = setBonus;
    }

    // End of Set methods

    // Get methods
    public void getId(){
        System.out.println("ID: " + this.id);
    }

    public void getName(){
        System.out.println("Name: " + this.name);
    }

    public void getBonus(){
        System.out.println("Bonus Accumulation: " + this.bonus);
    }

    public void getAll(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Bonus Accumulation: " + this.bonus);
        System.out.println();
    }

    //End of Get methods

    // Increase method
    public void increase(double value){
        this.bonus += value;
    }
}
