package FileObjects;

import java.io.*;

/**
 * Created by DuyAnhPham on 21/09/15.
 */
public class ObjectsWriting {
    public static void main(String[] arg){
        Person p1= new Person("Person 1", 1);
        Person p2= new Person("Person 2", 2);
        Person p3= new Person("Person 3", 3);

        Person[] personList = new Person[3];
        personList[0] = p1;
        personList[1] = p2;
        personList[2] = p3;

        String fileName = "Persons.OUT";
        try {
            FileOutputStream fos = new FileOutputStream(fileName, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Person p: personList) {
                oos.writeObject(p);
            }
            oos.flush();

            oos.close();
            fos.close();
        }
        catch (IOException e){
            System.out.printf("Impossible to write to file %s.\n", fileName);
            System.out.println(e);
        }

        try{
            FileInputStream fis = new FileInputStream(fileName);
            System.out.printf("%s file opened:\n", fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p;
            try {
                try {

                    while ((p = (Person) ois.readObject()) != null) {
                        if (p instanceof Person) {
                            System.out.println((Person) p);
                        }
                    }
                    //ois.close();
                } catch (ClassNotFoundException e) {
                    System.out.println("There is no more data in the file.");
                }

            } catch (EOFException e) {
                System.out.println("This is End of File.");
            }
            ois.close();
            fis.close();
        }
        catch (IOException e){
            System.out.printf("Impossible to open file %s.\n", fileName);
            System.out.println(e);
        }
    }
}
