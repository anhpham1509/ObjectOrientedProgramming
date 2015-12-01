package FlyweightPattern.Situation;

import java.util.HashMap;

public class ItemFactory {
    private static final HashMap<String, Item> roadMap = new HashMap<>();

    public static Item getRoad(String type) {
        Unit unit = (Unit) roadMap.get(type);

        if (unit == null) {
            unit = new Unit(type);
            roadMap.put(type, unit);
            System.out.println("Creating unit of type : " + type);
        }
        return unit;
    }
}
