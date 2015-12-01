import Exceptions.GameFullException;

/**
 * Created by DuyAnhPham on 29/09/15.
 */
public class Play {

    public static void main(String[] args) throws InterruptedException {
        Game newGame = new Game();
        for (int i=0; i<10; i++) {
            newGame.insertUsers();
        }
        while (true) {
            try {
                newGame.takePart();
            } catch (GameFullException e) {
                System.out.println(e.getMessage());
                Thread.sleep(1000);
            }
        }
    }
}
