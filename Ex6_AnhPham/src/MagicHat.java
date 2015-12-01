import java.util.Random;

/**
 * Created by DuyAnhPham on 17/09/15.
 */
public class MagicHat {
    public MagicHat(){
    }

    public MagicAnimal giveAnimal(){
        //Random rand = new Random();
        if (Math.random() <= 0.5) {
            Rabit newRabit = new Rabit();
            return newRabit;
        }
        else {
            Pigeon newPigeon = new Pigeon();
            return newPigeon;
        }
    }
}
