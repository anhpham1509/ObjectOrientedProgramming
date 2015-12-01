package BuilderPattern;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public abstract class Burger implements Item {


    public Packing packing() {
        return new Wrapper();
    }


    public abstract float price();
}
