package DecoratorPattern.Demo;

public class GreenShapeDecorator extends ShapeDecorator {

    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        decoratedShape.draw();
        setGreenBorder(decoratedShape);
    }

    private void setGreenBorder(Shape decoratedShape) {
        System.out.println("Border Color: Green");
    }
}