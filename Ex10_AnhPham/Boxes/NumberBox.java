package Boxes;

import java.util.Arrays;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class NumberBox {

    private int[] box = null;

    public synchronized int[] getInt() throws InterruptedException {
        int[] number;
        while (box == null)
            wait();
        number = box;
        box = null;
        System.out.println("Read: " + Arrays.toString(number));
        notify(); // raised the potential waiter
        return number;
    }

    public synchronized void setInt(int[] n) throws InterruptedException {
        while (box != null)
            wait();
        box = n;
        System.out.println("Written: " + Arrays.toString(box));
        notify(); // raised the potential waiter
    }
}
