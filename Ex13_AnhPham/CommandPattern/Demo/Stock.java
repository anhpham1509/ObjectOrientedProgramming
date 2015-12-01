package CommandPattern.Demo;

public class Stock {

    private String name = "Sonera";
    private int quantity = 55;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Car [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }
}