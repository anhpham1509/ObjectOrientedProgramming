/**
 * Created by DuyAnhPham on 31/08/15.
 */
public class TestFirgure {
    public TestFirgure(){
    }

    public static void main(String[] arg){
        Rectangle rect = new Rectangle(480,80);

        rect.setX(200);
        rect.setY(420);

        System.out.println(rect);

        rect.moves(50, 50);

        System.out.println(rect);

    }
}
