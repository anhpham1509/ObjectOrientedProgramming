package FileIO;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by DuyAnhPham on 21/09/15.
 */
public class FileOutputStreamIntegers {
    public static void main(String[] arg){
        String fileName = "FileOutputStreamIntegers.OUT";

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the integers to write to output file (by FileOutputStream): ");
        String inStr = sc.next();

        try {
            int age = Integer.parseInt(inStr);
            try{
                FileOutputStream fop = new FileOutputStream(fileName, true);

                //fop.write(inStr.getBytes());
                fop.write(age);
                //fop.write(age);
                //bufferedWriter.write(inStr);
                //bufferedWriter.newLine();

                //bufferedWriter.close();
                fop.flush();
                fop.close();

                System.out.println("Integer has been written in the output file.");
            }
            catch (IOException ex){
                System.out.printf("Impossible to write to file %s.\n", fileName);
            }
        } catch (Exception e) {
            System.out.printf("Your input %s is not an integer.\n", inStr);
        }

        try{
            FileInputStream fip = new FileInputStream(fileName);
            System.out.printf("Content of file %s:\n", fileName);
            int n;
            while ((n = fip.read()) != -1){
                System.out.println(n);
            }
        }
        catch (IOException ex){
            System.out.printf("Impossible to open file %s.\n", fileName);
        }

    }
}
