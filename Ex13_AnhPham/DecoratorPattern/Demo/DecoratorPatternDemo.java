package DecoratorPattern.Demo;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape greenCircle = new GreenShapeDecorator(new Circle());

        Shape greenRectangle = new GreenShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of green border");
        greenCircle.draw();

        System.out.println("\nRectangle of green border");
        greenRectangle.draw();
    }
}