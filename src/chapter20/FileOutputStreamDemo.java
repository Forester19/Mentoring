package chapter20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Владислав on 19.03.2017.
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n "
                + " to come to the aid of their country\n "+
                " and pay their due taxes.";
        byte buf[] = source.getBytes();

        try(
            FileOutputStream file1 = new FileOutputStream("file1");
            FileOutputStream file2 = new FileOutputStream("file2");
            FileOutputStream file3 = new FileOutputStream("file2")) {
            for (int i =0; i< buf.length;i +=2){
                file1.write(buf[1]);
            }
            file2.write(buf);
            file3.write(buf,buf.length-buf.length/4, buf.length/4);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
