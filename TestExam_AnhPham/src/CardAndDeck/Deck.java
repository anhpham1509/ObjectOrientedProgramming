package CardAndDeck;

import java.util.Random;

/**
 * Created by DuyAnhPham on 16/09/15.
 */
public class Deck {
    public Deck(){
    }

    private Card[] deckCards = new Card[52];
    private int size = 0;

    public void shuffle(){
        Random randIndex = new Random();

        for (int i=0; i<size; i++){
            int newIndex = randIndex.nextInt(size);

            Card tmp = this.deckCards[i];
            this.deckCards[i] = this.deckCards[newIndex];
            this.deckCards[newIndex] = tmp;
        }
    }

    public int getSize(){
        return size;
    }

    public Card dealCard(){
        Card pullCard = deckCards[0];
        for (int i=0; i<this.size-1; i++){
            this.deckCards[i] = this.deckCards[i+1];
        }
        this.size--;
        return pullCard;
    }

    public void putCard(Card pushCard){
        if (this.size == 0){
            this.deckCards[0] = pushCard;
            this.size++;
        }
        else if(this.size == 52){
            System.out.println("The deck has 52 cards at the moment, you can not put more cards into this deck.");
            return;
        }
        else {
            for (int i = this.size; i > 0; i--) {
                this.deckCards[i] = this.deckCards[i - 1];
            }
            this.deckCards[0] = pushCard;
            this.size++;
        }
    }
}
