/**
 * Created by DuyAnhPham on 03/09/15.
 */
public class TestDice {

    public TestDice(){
    }

    public static void main(String[] arg){

        //Test Dice
        System.out.println("Test Dice:");
        Dice myDice = new Dice();
        for (int i = 0; i <12; i++){
            myDice.throwDice();
        }
        System.out.println();


        //Test FakeDice
        System.out.println("Test Fake Dice:");
        FakeDice myFakeDice = new FakeDice(0.25);
        for (int i = 0; i <12; i++){
            myFakeDice.throwDice();
        }
        System.out.println();

        //Test 3 Dices
        System.out.println("Test 3 dices:");
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();
        int count = 0;

        while (true){
            count++;
            int sum = dice1.giveDice() + dice2.giveDice() + dice3.giveDice();
            if (sum == 18){
                System.out.printf("%d times needed to make the sum of 18.\n", count);
                break;
            }
        }
        System.out.println();

        //Test 3 Fake Dices
        System.out.println("Test 3 Fake dices:");
        double prob = 0.3;
        FakeDice fakeDice1 = new FakeDice(prob);
        FakeDice fakeDice2 = new FakeDice(prob);
        FakeDice fakeDice3 = new FakeDice(prob);
        int countFake = 0;

        while (true){
            countFake++;
            int sum = fakeDice1.giveDice() + fakeDice2.giveDice() + fakeDice3.giveDice();
            if (sum == 18){
                System.out.printf("%d times needed to make the sum of 18.\n", countFake);
                break;
            }
        }
        System.out.println();
    }
}
