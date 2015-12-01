package InterpreterPattern.Situation;

import java.util.ArrayList;
import java.util.List;

public class BathRoom implements Room {

    private List<String> items = new ArrayList<>();

    public BathRoom(List<String> items) {
        this.items = items;
    }

    public boolean include(String item) {

        if (items.contains(item)) {
            return true;
        }
        return false;
    }
}
