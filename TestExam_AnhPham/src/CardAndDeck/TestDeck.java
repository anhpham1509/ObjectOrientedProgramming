package CardAndDeck;

/**
 * Created by DuyAnhPham on 16/09/15.
 */
public class TestDeck {
    public static void main(String[] arg){
        Deck emptyDeck = new Deck();
        Deck fullDeck = new Deck();

        for (int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                Card newCard = new Card(i, j);
                fullDeck.putCard(newCard);
            }
        }

        fullDeck.shuffle();

        while (fullDeck.getSize() > 0){
            Card tmpCard = fullDeck.dealCard();
            emptyDeck.putCard(tmpCard);
            tmpCard.printCard();
        }
    }
}
