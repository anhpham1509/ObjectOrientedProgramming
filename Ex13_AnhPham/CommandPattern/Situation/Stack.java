package CommandPattern.Situation;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Command> commandList = new ArrayList<Command>();

    public void takeOrder(Command command) {
        commandList.add(command);
    }

    public void placeOrders() {

        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}