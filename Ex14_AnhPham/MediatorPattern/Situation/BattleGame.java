package MediatorPattern.Situation;

import java.util.Date;

public class BattleGame {
    public static void showMessage(Player player, int x, int y) {
        System.out.println(new Date().toString() + " [" + player.getName() + "]: Fire coordinate (" + x + ", " + y + ")");
    }
}