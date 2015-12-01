package AbstractFactoryPattern;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            ShapeFactory shapeFactory = new ShapeFactory();
            return shapeFactory;
        }
        else if (choice.equalsIgnoreCase("COLOR")){
            ColorFactory colorFactory = new ColorFactory();
            return colorFactory;
        }
        else {
            return null;
        }
    }
}
