package Card;

/**
 * Created by DuyAnhPham on 05/09/15.
 */
public class TestCard {

    public static void main(String[] arg){
        ChargeCard myCard1 = new ChargeCard();
        myCard1.increaseBalance(6888.88);
        myCard1.payment(1258.68);

        ChargeCard myCard2 = new ChargeCard(5000.00);
        myCard2.increaseBalance(888.88);
        myCard2.payment(250.00);
    }
}
