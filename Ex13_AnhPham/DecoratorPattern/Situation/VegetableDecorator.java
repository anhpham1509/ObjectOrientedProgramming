package DecoratorPattern.Situation;

public abstract class VegetableDecorator implements Vegetable {
    protected Vegetable handledVegetable;

    public VegetableDecorator(Vegetable handledVegetable) {
        this.handledVegetable = handledVegetable;
    }

    public void show() {
        handledVegetable.show();
    }
}