import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by DuyAnhPham on 07/09/15.
 */
public class Deck {

    private List<Card> cards = new ArrayList();
    private boolean[] dealed = new boolean[52];

    public Deck(){
        this.initCards();
    }

    public void initCards(){
        for (int i = 0; i <=3; i++){
            for (int j=0; j<=12; j++){
                Card tmpCard = new Card(i,j);
                this.cards.add(tmpCard);
            }
        }
        Arrays.fill(dealed, false);
    }

    public Card giveCard(){
        int choice;
        while (true){
            Random rand = new Random();
            choice = rand.nextInt(52);
            if (this.dealed[choice] == false)
                break;
        }
        this.dealed[choice] = true;
        return this.cards.get(choice);
    }

    public void gather(){
        Arrays.fill(dealed, false);
    }
}
