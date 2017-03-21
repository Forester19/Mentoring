package chapter20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Владислав on 19.03.2017.
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("qestions.txt")) {
        int c;
        while ((c = fr.read()) != -1) System.out.print((char ) c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
