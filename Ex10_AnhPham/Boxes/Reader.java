package Boxes;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class Reader extends Thread{
    private NumberBox numberBox;

    public Reader(NumberBox nl) {
        numberBox = nl;
    }

    public void run() {
        int[] number;
        int sum = 0;
        try {
            number = numberBox.getInt();
            while (number[0] > 0) {
                sum += (number[0] + number[1]);
                sleep((int) Math.random() * 1000);
                System.out.println("Reader tries to read");
                number = numberBox.getInt();
                System.out.println("Reading succeeded");
            }
            System.out.println("Sum is " + sum);
        }
        catch (InterruptedException e) {
        }
    }

}
