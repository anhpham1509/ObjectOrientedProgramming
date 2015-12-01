package AbstractFactoryPattern;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class ShapeFactory extends AbstractFactory {

    private Shape shape;

    public Shape getShape(String shapeType){

        if (shapeType.equalsIgnoreCase("CIRCLE")){
            shape = new Circle();
        }
        else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            shape = new Rectangle();
        }
        else  if (shapeType.equalsIgnoreCase("SQUARE")){
            shape = new Square();
        }
        else {
            shape = null;
        }

        return shape;
    }

    public Color getColor(String colorType){
        return null;
    }
}
