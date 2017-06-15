package try_Catch;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/**
 * Created by Ankita Singh on 6/14/2017.
 */
public class BReader {

    public static void main(String[] args) {

        String filepath = "C:\\Users\\Ankita Singh\\Dropbox\\ankita\\file.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {

            fr = new FileReader(filepath);
            br = new BufferedReader(fr);
            String text = "";
            while ((text = br.readLine()) != null) {

                System.out.println(text);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (fr != null) {
                    try {
                        fr.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }


        }
    }
}
