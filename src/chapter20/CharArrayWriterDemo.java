package chapter20;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Владислав on 20.03.2017.
 */
public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This must be ib array";
        char buf[] = new char[s.length()];
        s.getChars(0,s.length(),buf,0);
        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(f.toString());

        char c[] = f.toCharArray();
        for (int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }
        try(FileWriter fw = new FileWriter("text.txt")){
            f.writeTo(fw);
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.reset();
        for (int i=0; i<3; i++){
            System.out.println(f.toString());
        }
    }
}
