import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 27/09/15.
 */
public class MenandWomen {
    public static void main(String[] args){
        try {
            FileInputStream menFile = new FileInputStream("InputFIles/1/Men.txt");
            FileInputStream womenFile = new FileInputStream("InputFIles/1/Women.txt");

            InputStreamReader menFileReader = new InputStreamReader(menFile, "UTF-8");
            InputStreamReader womenFileReader = new InputStreamReader(womenFile, "UTF-8");

            BufferedReader menBufferedReader = new BufferedReader(menFileReader);
            BufferedReader womenBufferedReader = new BufferedReader(womenFileReader);

            List<String> menNames = new ArrayList<>();
            List<String> womenNames = new ArrayList<>();

            String line;

            while ((line = menBufferedReader.readLine()) != null) {
                if (! line.isEmpty()) {
                    String[] names = line.split(", ");
                    for (String s:names){
                        menNames.add(s);
                    }
                }
            }
            menBufferedReader.close();
            menFileReader.close();
            menFile.close();

            while ((line = womenBufferedReader.readLine()) != null) {
                if (! line.isEmpty()) {
                    String[] names = line.split(", ");
                    for (String s:names){
                        womenNames.add(s);
                    }
                }
            }
            womenBufferedReader.close();
            womenFileReader.close();
            womenFile.close();

            System.out.println("Names in both files:");
            for (String s1:menNames){
                for(String s2:womenNames){
                    if (s1.equals(s2)) {
                        System.out.println(s1);
                    }
                }
            }

        }
        catch (IOException e){
            System.out.println("Occurred some problems when writing and reading files.");
            e.printStackTrace();
        }
    }
}
