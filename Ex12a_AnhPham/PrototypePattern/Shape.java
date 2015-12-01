package PrototypePattern;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public class Shape implements Cloneable {

    private String id;
    public String type;

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }
}
