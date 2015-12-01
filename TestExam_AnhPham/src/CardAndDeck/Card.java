package CardAndDeck;

/**
 * Created by DuyAnhPham on 16/09/15.
 */
public class Card {
    public Card(int suite, int value){
        this.setSuite(suite);
        this.setValue(value);
    }

    private int suite;
    private int value;

    private String[] suiteName = {"Heart","Club","Diamond","Spade"};
    private String[] valueName = {"Ace", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getSuite(){
        return suite;
    }

    public void setSuite(int suite){
        this.suite = suite;
    }

    public void printCard(){
        System.out.printf("%s of %s\n", this.valueName[this.getValue()], this.suiteName[this.getSuite()]);
    }
}
