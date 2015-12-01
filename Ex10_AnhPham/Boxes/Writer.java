package Boxes;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class Writer extends Thread{
    private NumberBox numberBox;

    public Writer(NumberBox nl) {
        numberBox = nl;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Writer tries to write");
                numberBox.setInt(new int[]{2 * i + 1, 2 * (i + 1) + 1});
                System.out.println("Writing succeeded");
                sleep((int) Math.random() * 1000);
            }
            numberBox.setInt(new  int[]{-1, -1}); // no more numbers
        } catch (InterruptedException e) {
        }
    }
}
