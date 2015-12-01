import java.util.Formatter;

/**
 * Created by DuyAnhPham on 31/08/15.
 */
public class Rectangle{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
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

    public double area(){
        return this.getWidth() * this.getHeight();
    }

    public String toString(){
        Formatter fmt = new Formatter();
        String s = fmt.format("Rectangle's properties:\n\tWidth: %.2f\n\tHeight: %.2f",
                this.getWidth(),
                this.getHeight()).toString();
        return s;
    }
}
