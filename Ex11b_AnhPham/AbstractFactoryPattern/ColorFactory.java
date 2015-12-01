package AbstractFactoryPattern;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class ColorFactory extends AbstractFactory {

    private Color color;

    public Color getColor(String colorType){

        if (colorType.equalsIgnoreCase("RED")){
            color = new Red();
        }
        else if (colorType.equalsIgnoreCase("GREEN")){
            color = new Green();
        }
        else  if (colorType.equalsIgnoreCase("BLUE")){
            color = new Blue();
        }
        else {
            color = null;
        }

        return color;
    }

    public Shape getShape(String shapeType){
        return null;
    }
}
