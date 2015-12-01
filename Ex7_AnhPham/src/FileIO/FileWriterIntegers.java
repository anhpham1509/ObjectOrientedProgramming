package FileIO;

import java.io.*;
import java.util.Scanner;

/**
 * Created by DuyAnhPham on 21/09/15.
 */
public class FileWriterIntegers {
    public static void main(String[] arg){
        String fileName = "FileWriterIntegers.OUT";

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the integers to write to output file (by FileWriter): ");
        String inStr = sc.next();

        try {
            int age = Integer.parseInt(inStr);
            try{
                FileWriter fileWriter = new FileWriter(fileName, true);
                fileWriter.write(inStr + "\n");
                fileWriter.close();

                System.out.println("Integer has been written in the output file.");
            }
            catch (IOException ex){
                System.out.printf("Impossible to write to file %s.\n", fileName);
            }
        } catch (Exception e) {
            System.out.printf("Your input %s is not an integer.\n", inStr);
        }

        try {
            FileReader fileReader = new FileReader(fileName);
            System.out.printf("Content of file %s:\n", fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        }
        catch (IOException ex){
            System.out.printf("Impossible to open file %s.\n", fileName);
        }
    }
}
