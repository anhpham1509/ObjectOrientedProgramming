/**
 * Created by DuyAnhPham on 03/09/15.
 */
public class Dice {
    public Dice(){

    }

    private static int counter_1;

    private long throw_counter;

    public void printRes(long i, int n){
        System.out.println("Throw " + i + " time(s), and result is: " + n);

    }

    public void throwDice(){
        this.throw_counter++;
        int res = this.giveDice();
        if (res == 1){
            counter_1++;
        }
        printRes(this.throw_counter, res);
    }

    public int giveDice(){
        int rand = (int) (Math.random() * 6 + 1);
        return rand;
    }
}
