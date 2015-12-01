package Age;

import java.util.Scanner;

/**
 * Created by DuyAnhPham on 21/09/15.
 */
public class Main {
    public static void main(String[] arg){
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please give me your age: ");
            String inStr = sc.next();

            try {
                int age = Integer.parseInt(inStr);
                System.out.println("Next year, you are " + (age + 1));
            } catch (Exception e) {
                System.out.printf("Your input %s is not an integer.\n", inStr);
            }
        }
    }
}
