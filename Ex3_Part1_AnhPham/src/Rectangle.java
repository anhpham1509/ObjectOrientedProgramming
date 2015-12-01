import java.util.Formatter;

/**
 * Created by DuyAnhPham on 31/08/15.
 */
public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }

    public void moves(int x, int y){
        setX(getX()+x);
        setY(getY()+y);
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight() {
        return height;
    }

    public String toString(){
        Formatter fmt = new Formatter();
        String s = fmt.format("I'm rectangle which\n\twidth is %.2f height is %.2f\n\tand angle point is %d %d",
                this.getWidth(),
                this.getHeight(),
                getX(),
                getY()).toString();
        return s;
    }
}
