import java.util.Formatter;

/**
 * Created by DuyAnhPham on 31/08/15.
 */
public class ScreenRectangle extends Rectangle{

    private double x;
    private double y;

    public ScreenRectangle(double x, double y, double width, double height){
        super(width,height);
        this.setX(x);
        this.setY(y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void fit(Rectangle rect){
        boolean fitWidth  = (getX()+getWidth())  < rect.getWidth();
        boolean fitHeight = (getY()+getHeight()) < rect.getHeight();
        if (fitHeight && fitWidth)
            System.out.println("This rectangle fits the screen rectangle.\n");
        else
            System.out.println("This rectangle does NOT fit the screen rectangle.\n");
    }

    public String toString(){
        Formatter fmt = new Formatter();
        String s = fmt.format("Screen rectangle's properties:\n\tWidth: %.2f\n\tHeight: %.2f\n\tCoordinates of left down corner: (%.2f, %.2f)",
                getWidth(),
                getHeight(),
                this.getX(),
                this.getY()).toString();
        return s;
    }
}
