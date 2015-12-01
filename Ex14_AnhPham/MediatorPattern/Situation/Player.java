package MediatorPattern.Situation;

public class Player {
    private String name;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    public void sendMessage(int x, int y) {
        BattleGame.showMessage(this, x, y);
    }
}