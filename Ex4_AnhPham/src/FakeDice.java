/**
 * Created by DuyAnhPham on 03/09/15.
 */
public class FakeDice extends Dice{

    public FakeDice(double d){
        this.probability = d;
    }

    private double probability;

    public int giveDice(){
        double rand = Math.random();
        int res = 0;
        if (rand > 0 && rand <= this.probability){
            res = 6;
        }
        else{
            double temp = (1 - this.probability) / 5; // Calculate other sides' probabilities
            boolean check = ((rand - this.probability) % temp) == 0;
            if (check){
                res = (int) ((rand - this.probability) / temp);
            }
            else {
                res = (int) ((rand - this.probability) / temp) + 1;
            }
        }
        return res;
    }

}
