import java.io.File;
import java.io.FileFilter;
import java.util.*;

/**
 * Created by rpanait on 7/27/2015.
 */
public class ListFiles {
    public static void main(String[] args) {
        File windowsFolder = new File("C:\\Windows");
        List<File> list = Arrays.asList(windowsFolder.listFiles(new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().contains("System")) {
                    System.out.println("Da");
                    return true;

                }

                else
                    return false;
            }
        }));
        Collections.sort(list, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return (int) (o1.length()- o2.length());
            }
        });
        for (File file : list) {
            if(file.isDirectory()) {
                System.out.println("Directory: " + file.getName() + " Size: " + file.length());
            }
            else {
                System.out.println("File: " + file.getName() + " Size: " + file.length());
            }

          //  System.out.println(file.getName()+" Size: "+file.length());
        }
    }
}
