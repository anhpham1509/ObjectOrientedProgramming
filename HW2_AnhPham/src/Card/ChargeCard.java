package Card;

/**
 * Created by DuyAnhPham on 05/09/15.
 */
public class ChargeCard {

    private double balance;

    public ChargeCard(){
        this(0.00);
    }

    public ChargeCard(double value){
        this.setBalance(value);
        System.out.println("New card has been created!");
        System.out.println("Current balance is " + getBalance());
    }

    public void increaseBalance(double value){
        this.balance += value;
        System.out.println("After increased balance, current balance is " + getBalance());
    }

    public void payment(double value){
        this.balance -= value;
        System.out.println("After payment, current balance is " + getBalance());
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double value){
        this.balance = value;
    }

}
