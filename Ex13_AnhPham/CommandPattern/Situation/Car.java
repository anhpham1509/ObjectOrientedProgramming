package CommandPattern.Situation;

public class Car {

    private String brand = "BMW";
    private int distance = 28;

    public void forward() {
        System.out.println("Car [ Brand: " + brand + ", Move: " + distance + " forward ]");
    }

    public void backward() {
        System.out.println("Car [ Brand: " + brand + ", Move: " + distance + " backward ]");
    }

}