package DecoratorPattern.Situation;

public class BoiledVegetableDecorator extends VegetableDecorator {

    public BoiledVegetableDecorator(Vegetable boiledVegetable) {
        super(boiledVegetable);
    }

    public void show() {
        handledVegetable.show();
        boilVegetable(handledVegetable);
    }

    private void boilVegetable(Vegetable decoratedVegetable) {
        System.out.println("Boiled");
    }
}