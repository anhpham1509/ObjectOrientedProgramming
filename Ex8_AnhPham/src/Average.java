import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Created by DuyAnhPham on 28/09/15.
 */
public class Average {

    public static void processFile(String filename){
        File f = new File(filename);
        try{
            FileReader fileReader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            BigInteger sum = BigInteger.valueOf(0);
            long n = 0;
            double average;


            while ((line = bufferedReader.readLine()) != null){
                if (! line.isEmpty()){
                    String[] nums = line.split(", ");

                    for (String s: nums){
                        long tmp = Long.parseLong(s);
                        sum = sum.add(BigInteger.valueOf(tmp));
                        n++;
                    }
                }
            }

            average = (sum.divide(BigInteger.valueOf(n)).doubleValue());

            System.out.printf("The average of %d numbers in file %s is: %.2f\n", n, filename.substring(13), average);
        }
        catch (IOException e){
            System.out.println("Occurred some problems when writing and reading files.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        String num1 = "InputFiles/3/numbers.txt";
        String num2 = "InputFiles/3/lotofnumbers.txt";
        String num3 = "InputFiles/3/mostnumbers.txt";

        processFile(num1);
        processFile(num2);
        processFile(num3);
    }
}
