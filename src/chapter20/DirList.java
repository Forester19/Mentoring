package chapter20;

import java.io.File;

/**
 * Created by Владислав on 19.03.2017.
 */
public class DirList {
    public static void main(String[] args) {
        File f = new File("phonebook.bat");
        System.out.println(f.getAbsoluteFile());
        String dirName = "G:\\JAVA\\MentoringMy\\Mentoring";
        File file = new File(dirName);
        if (file.isDirectory()){
            System.out.println("directory " + dirName);
            String s[] = file.list();
            for (int i=0; i<s.length;i++){
                File file1 = new File(s[i]);
                if (file1.isDirectory()){
                    System.out.println(s[i] + " its directory");
                }
                else
                    System.out.println(s[i] + " its file");
            }
        }
        else {
            System.out.println(dirName + " its not a directory");
        }
    }
}
