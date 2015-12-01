package FlyweightPattern.Situation;

public class Unit implements Item {
    private String type;
    private int x;
    private int y;
    private int length;

    public Unit(String type) {
        this.type = type;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void set() {
        System.out.println("Unit: set() [Type : " + type + ", x : " + x + ", y :" + y + ", length :" + length);
    }
}