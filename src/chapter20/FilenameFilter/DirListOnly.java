package chapter20.FilenameFilter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Владислав on 19.03.2017.
 */
public class DirListOnly {
    public static void main(String[] args) {
        String dirName = "G:\\JAVA\\MentoringMy\\Mentoring";
        File file = new File(dirName);
        FilenameFilter only = new SomeEndOfFile("txt");

            System.out.println("directory " + dirName);
            String s[] = file.list(only);
            for (int i=0; i<s.length;i++){
                System.out.println(s[i]);
        }
    }
}
