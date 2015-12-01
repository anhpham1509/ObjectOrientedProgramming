package BridgePattern;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public class RedCircle implements DrawAPI{

    public void drawCircle(int radius, int x, int y) {
        System.out.printf("Drawing Circle[ color: red, radius: %d, x: %d, y: %d]\n", radius, x, y);
    }
}
