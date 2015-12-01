package DecoratorPattern.Situation;

public class DecoratorPattern {
    public static void main(String[] args) {

        Vegetable carrot = new Carrot();

        Vegetable boiledCarrot = new BoiledVegetableDecorator(new Carrot());

        Vegetable boiledTomato = new BoiledVegetableDecorator(new Tomato());

        System.out.println("Fresh Carrot");
        carrot.show();

        System.out.println("\nBoiled Carrot");
        boiledCarrot.show();

        System.out.println("\nBoiled Tomato");
        boiledTomato.show();
    }
}