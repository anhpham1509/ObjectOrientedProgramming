package ScandinavianChar;

import java.io.*;
import java.text.Normalizer;

/**
 * Created by DuyAnhPham on 27/09/15.
 */
public class Reformat {

    public static void main(String[] args){
        File originalFile = new File("Origin.dat");
        File backupFile = new File("Backup.dat");

        if (backupFile.exists()){
            backupFile.delete();
        }

        originalFile.renameTo(backupFile);

        String line;

        try{
            FileReader fileReader = new FileReader(backupFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(originalFile, true);

            while ((line = bufferedReader.readLine()) != null){
                line = Normalizer.normalize(line, Normalizer.Form.NFD);
                line = line.replaceAll("[^\\p{ASCII}]", "");
                System.out.println(line);
                fileWriter.flush();
            }

            bufferedReader.close();
            fileReader.close();

        }
        catch (IOException e){
            System.out.println("It has occurred some problem while reading and writing files.");
            e.printStackTrace();
        }
    }
}
