package AbstractFactoryPattern;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args){

        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory shapeFactory = factoryProducer.getFactory("shape");
        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("square").draw();

        AbstractFactory colorFactory = factoryProducer.getFactory("color");
        colorFactory.getColor("red").fill();
        colorFactory.getColor("green").fill();
        colorFactory.getColor("blue").fill();
    }
}
