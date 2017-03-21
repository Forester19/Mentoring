package chapter20;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Владислав on 19.03.2017.
 */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f= new ByteArrayOutputStream();
        String s = "Эти данные должны быть ввыведены в массив";
        byte buf[] = s.getBytes();

        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(f.toString());

     byte b[] = f.toByteArray();
     for (int i=0; i<b.length; i++){
         System.out.print(b[i]);
     }
     try(FileOutputStream f2 = new FileOutputStream("text.txt")){
         f.writeTo(f2);
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }
     f.reset();
     for (int i =0; i<3; i++){
         f.write('X');
        }
        System.out.println(f.toString());
    }
}
