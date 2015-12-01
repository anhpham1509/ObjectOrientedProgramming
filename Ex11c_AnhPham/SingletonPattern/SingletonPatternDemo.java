package SingletonPattern;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class SingletonPatternDemo {

    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
