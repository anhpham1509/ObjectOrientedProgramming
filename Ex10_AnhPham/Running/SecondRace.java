package Running;

import java.util.Random;

/**
 * Created by DuyAnhPham on 07/10/15.
 */
public class SecondRace {


    public static void main(String[] args) throws InterruptedException {
        //10 000m Relay Running Race

        int DISTANCE = 10000;
        Random rnd = new Random();

        Runner[] Runners = {new Runner(DISTANCE),
                new Runner(DISTANCE),
                new Runner(DISTANCE),
                new Runner(DISTANCE),
                new Runner(DISTANCE),
                new Runner(DISTANCE)
        };

        for (Runner runner : Runners) {
            runner.start();
        }

        while (!(Runners[0].isFinished() ||
                    Runners[1].isFinished() ||
                    Runners[2].isFinished() ||
                    Runners[3].isFinished() ||
                    Runners[4].isFinished() ||
                    Runners[5].isFinished())
                ) {

            int rndIndex = rnd.nextInt(6);
            Runners[rndIndex].doInterrupt();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Runners[rndIndex].doContinue();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
