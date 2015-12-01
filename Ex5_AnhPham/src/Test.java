/**
 * Created by DuyAnhPham on 07/09/15.
 */
public class Test {

    public static void main(String[] arg){
        Deck myDeck = new Deck();
        Hand myHand = new Hand(myDeck);
        int count = 0;
        int tmp = 0;
        while (tmp == 0){
            myDeck.gather();
            myHand.inputTableCards();
            count++;
            tmp = myHand.giveValue();
        }
        System.out.println(count + " times to get FLUSH!");
    }
}
