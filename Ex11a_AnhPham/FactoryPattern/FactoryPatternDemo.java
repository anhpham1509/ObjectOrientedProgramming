package FactoryPattern;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("square").draw();
    }
}
