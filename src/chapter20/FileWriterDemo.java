package chapter20;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Владислав on 19.03.2017.
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        String soutce = "Now is the time for all good man\n"+
                "to come to the aid of their country\n" +
                "and pay thair due taxes ";
        char buffer[] = new char[soutce.length()];
        soutce.getChars(0,soutce.length(),buffer,0);
        try(FileWriter f0 = new FileWriter("file1.txt");
            FileWriter f1 = new FileWriter("file2.txt");
            FileWriter f2 = new FileWriter("file3.txt")){

            for (int i=0; i<buffer.length; i+=2){
                f0.write(buffer[i]);
            }
            f1.write(buffer);
            f2.write(buffer,buffer.length-buffer.length/4, buffer.length/4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
