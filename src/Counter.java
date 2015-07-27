import java.io.*;
import java.util.Scanner;

/**
 * Created by rpanait on 7/27/2015.
 */
public class Counter {
    public static void main(String[] args) throws IOException {
        Character c;
        int i = 0;
        // Console input :
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner inp1 = new Scanner(System.in);
        c = inp1.nextLine().charAt(0);;

        //Reading from file
        FileInputStream inp2 = null;
        try {
            inp2 = new FileInputStream("C:\\Users\\rpanait\\Desktop\\info.txt");
            int c2;
            while ((c2 = inp2.read()) != -1) {
                if((char)c2 == c) {
                    i++;
                }
            }
        } finally {
            if (inp2 != null) {
                inp2.close();
            }

            System.out.println("Caracterul: "+c+" apare de --> "+i+" ori");
        }

    }
}
