package InterpreterPattern.Situation;

import java.util.ArrayList;
import java.util.List;

public class BedRoom implements Room {

    private List<String> items = new ArrayList<String>();

    public BedRoom(List<String> items) {
        this.items = items;
    }

    public boolean include(String item) {
        if (items.contains(item)) {
            return true;
        }
        return false;
    }
}