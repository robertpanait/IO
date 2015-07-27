import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by rpanait on 7/27/2015.
 */
public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("C:\\Users\\rpanait\\Desktop\\in.txt");
            outputStream = new FileWriter("C:\\Users\\rpanait\\Desktop\\out.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
                System.out.println((char)c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}
