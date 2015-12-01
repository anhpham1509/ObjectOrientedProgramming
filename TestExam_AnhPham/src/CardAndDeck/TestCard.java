package CardAndDeck;

/**
 * Created by DuyAnhPham on 16/09/15.
 */
public class TestCard {

    public static void main(String[] arg){
        Card[] deckCards = new Card[52];
        int c = 0;

        for (int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                Card newCard = new Card(i, j);
                deckCards[c] = newCard;
                newCard.printCard();
                c++;
            }
        }
    }
}
