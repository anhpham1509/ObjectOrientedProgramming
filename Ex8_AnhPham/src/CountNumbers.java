import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 28/09/15.
 */
public class CountNumbers {

    public static void main(String[] args){
        try {
            File numbers = new File("InputFiles/2/numbers.txt");

            FileReader fileReader = new FileReader(numbers);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            int max=Integer.MIN_VALUE, countMax=0;
            int min=Integer.MAX_VALUE, countMin=0;

            while ((line = bufferedReader.readLine()) != null){
                if (! line.isEmpty()) {

                    String[] numsTemp = line.split(", ");

                    for (String s:numsTemp) {
                        int num = Integer.parseInt(s);

                        if (num >= max) {
                            if (num == max) {
                                countMax++;
                            } else {
                                max = num;
                                countMax = 1;
                            }
                        }

                        if (num <= min) {
                            if (num == min) {
                                countMin++;
                            } else {
                                min = num;
                                countMin = 1;
                            }
                        }
                    }
                }
            }
            bufferedReader.close();
            fileReader.close();

            System.out.printf("Largest number is %d, times occurred in file: %d\n", max, countMax);
            System.out.printf("Smallest number is %d, times occurred in file: %d\n", min, countMin);

        }

        catch (IOException e){
            System.out.println("Occurred some problems when reading file.");
            e.printStackTrace();
        }
    }
}
