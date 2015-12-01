package ObjectsVolume;

/**
 * Created by DuyAnhPham on 16/09/15.
 */
public class Ball implements SpaceObject {

    private double radius;

    public Ball(double r){
        this.setRadius(r);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume(){
        double v = 4.0 / 3.0 * Math.PI * Math.pow(this.getRadius(),3);
        return v;
    }
}
