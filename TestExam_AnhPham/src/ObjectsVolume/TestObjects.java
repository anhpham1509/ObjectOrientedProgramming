package ObjectsVolume;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by DuyAnhPham on 16/09/15.
 */
public class TestObjects {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        double d1, d2;

        System.out.print("Input the radius of the Ball: ");
        d1 = sc.nextDouble();
        Ball newBall = new Ball(d1);
        System.out.printf("The volume of the Ball is: %.5f\n", newBall.volume());
        System.out.println();

        System.out.print("Input the base's radius of the Cone: ");
        d1 = sc.nextDouble();
        System.out.print("Input the height of the Cone: ");
        d2 = sc.nextDouble();
        Cone newCone = new Cone(d1, d2);
        System.out.printf("The volume of the Cone is: %.5f\n", newCone.volume());
        System.out.println();

        System.out.print("Input the base's radius of the Cylinder: ");
        d1 = sc.nextDouble();
        System.out.print("Input the height of the Cylinder: ");
        d2 = sc.nextDouble();
        Cylinder newCylinder = new Cylinder(d1, d2);
        System.out.printf("The volume of the Cylinder is: %.5f\n", newCylinder.volume());
        System.out.println();

        SpaceObjects so = new SpaceObjects();
        so.getObjects().add(newBall);
        so.getObjects().add(newCone);
        so.getObjects().add(newCylinder);
        double sumV = 0;
        for (SpaceObject obj: so.getObjects()){
            String objName = obj.getClass().getName();
            objName = objName.substring(14);
            System.out.printf("The volume of %s is %.5f\n", objName, obj.volume());
            sumV += obj.volume();
        }
        System.out.printf("The total volume of all above subjects is: %.5f\n", sumV);
    }
}
