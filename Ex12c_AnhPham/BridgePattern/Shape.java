package BridgePattern;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public abstract class Shape {

    DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
