package Running;

import java.util.Random;

/**
 * Created by DuyAnhPham on 05/10/15.
 */
public class Runner extends Thread {
    Random rnd = new Random();
    private int position = 0;
    private int distance;
    private String name = this.getName().replaceAll("Thread-", "Runner ");

    private boolean isRunning = true, isFinished = false;

    public Runner() {
        this(400);
    }

    public Runner(int distance) {
        this.distance = distance;
    }

    public void run() {

        long stopTime, startTime = System.currentTimeMillis();

        while (true) {

            if (this.position == 0) {
                System.out.printf("%s started running\n", this.name);
            } else {
                System.out.printf("%s has run %dm\n", this.name, this.position);
            }

            if (this.position == this.distance) {
                stopTime = System.currentTimeMillis();
                System.out.printf("%s has finished the race. ", this.name);
                System.out.printf("Total running time: %dms\n", (stopTime - startTime));
                this.isFinished = true;
                break;
            }

            this.position += 10;

            long sleepTime = rnd.nextInt(1400 - 1100) + 1100;

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            trackPos();
        }
    }

    public boolean isFinished() {
        return isFinished;
    }

    public synchronized void trackPos() {
        while (!this.isRunning) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void doInterrupt() {
        if (!this.isFinished) {
            System.out.printf("%s dropped out of the race!\n", this.name);
            this.isRunning = false;
        }
    }

    public synchronized void doContinue() {
        if (!this.isFinished) {
            System.out.printf("%s continued the race!\n", this.name);
            this.isRunning = true;
            this.notifyAll();
        }
    }

    public static void main(String[] args) {
        // Run 400m with the rate of 10m at a time
        Runner runner = new Runner();
        runner.start();
    }
}
