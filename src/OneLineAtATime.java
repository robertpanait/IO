import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rpanait on 7/27/2015.
 */
public class OneLineAtATime {

    public static void main(String[] args) throws IOException {
        List<String> list=new LinkedList<>();
        FileReader fr = new FileReader("C:\\Users\\rpanait\\Desktop\\info.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;

        while ((s = br.readLine()) != null) {
            list.add(s);
        }
        Collections.reverse(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
