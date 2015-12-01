import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 07/09/15.
 */
public class Hand implements Assessed {

    private List<Card> tableCards;
    private Deck theDeck = new Deck();

    public Hand(Deck deck) {
        this.theDeck = deck;
    }

    public void inputTableCards(){
        this.tableCards = new ArrayList(5);
        //System.out.println("Cards on the table: ");
        for (int i = 1; i <= 5; i++) {
            //System.out.print("\t");
            Card tmpCard = theDeck.giveCard();
            this.tableCards.add(tmpCard);
            //System.out.println(tmpCard);
        }
    }


    public int giveValue(){
        int tmp = this.tableCards.get(1).getSuite();
        for (Card c:this.tableCards){
            if (tmp != c.getSuite())
                return 0;
        }
        return 2;
    }

    public String toString(){
        String s = "Cards on the table:\n";
        for (Card c:this.tableCards)
            s += c.toString() + "\t";
        return s;
    }
}
