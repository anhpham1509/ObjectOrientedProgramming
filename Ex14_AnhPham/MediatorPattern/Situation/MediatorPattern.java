package MediatorPattern.Situation;

public class MediatorPattern {
    public static void main(String[] args) {
        Player peter = new Player("Peter");
        Player ulla = new Player("Ulla");

        peter.sendMessage(1, 4);
        ulla.sendMessage(7, 2);
    }
}