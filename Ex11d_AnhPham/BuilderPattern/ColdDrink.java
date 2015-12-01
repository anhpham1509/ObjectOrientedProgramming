package BuilderPattern;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
