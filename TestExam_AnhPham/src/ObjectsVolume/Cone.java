package ObjectsVolume;

/**
 * Created by DuyAnhPham on 16/09/15.
 */
public class Cone implements SpaceObject{

    private double baseRadius;
    private double height;

    public Cone(double r, double h){
        this.setBaseRadius(r);
        this.setHeight(h);
    }

    public double getBaseRadius() {
        return baseRadius;
    }

    public void setBaseRadius(double baseRadius) {
        this.baseRadius = baseRadius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        double v = 1.0 / 3.0 * this.getBaseRadius() * Math.pow(Math.PI,2) * this.getHeight();
        return v;
    }
}
