package chapter20;

import java.io.File;

/**
 * Created by Владислав on 18.03.2017.
 */
public class FileDemo {
    static void p(String text){
        System.out.println(text);
    }
    public static void main(String[] args) {
        File file = new File("phonebook.dat");
        p(file.getName());
        p(file.getPath());
        p(file.getAbsolutePath());
        p(file.getParent());
        p(file.exists() ? "exist":"not exist");
        p(file.canWrite()? "can write": "can't write");
        p(String.valueOf(file.length()));
        p(file.getName());
    }
}
