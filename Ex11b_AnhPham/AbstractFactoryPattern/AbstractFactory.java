package AbstractFactoryPattern;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String colorType);
    abstract Shape getShape(String shapeType);
}
