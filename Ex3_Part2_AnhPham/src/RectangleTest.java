/**
 * Created by DuyAnhPham on 31/08/15.
 */
public class RectangleTest {
    public RectangleTest(){
    }

    public static void main(String[] arg){
        ScreenRectangle scrRect = new ScreenRectangle(225,120,800,30);
        System.out.println(scrRect);

        Rectangle rect1 = new Rectangle(1024,768);
        System.out.println(rect1);
        System.out.println("The area of this rectangle: " + rect1.area());
        scrRect.fit(rect1);

        Rectangle rect2 = new Rectangle(80,40);
        System.out.println(rect2);
        System.out.println("The area of this rectangle: " + rect2.area());
        scrRect.fit(rect2);
    }
}
