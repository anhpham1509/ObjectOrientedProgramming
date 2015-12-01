import java.util.HashMap;
import java.util.Map;

/**
 * Created by DuyAnhPham on 07/09/15.
 */
public class Card {

    private int suite;
    private int value;

    String[] suiteList = {"Heart", "Club", "Diamond", "Spade"};
    String[] valueList = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Card(int suite, int value){
        this.suite = suite;
        this.value = value;
    }

    public int getSuite() {
        return suite;
    }

    public void setSuite(int suite) {
        this.suite = suite;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        String s = this.valueList[this.value] + " " + this.suiteList[this.suite];
        return s;
    }

}
