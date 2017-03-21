package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Владислав on 19.03.2017.
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size = 0;
        try(FileInputStream f = new FileInputStream("qestions.txt")){
            System.out.println("Общее количество байтов  " + (size  = f.available()));
        int n = size/40;
            System.out.println("Первые " + n +" байтов, считаных методом read()");
            for (int i =0; i<n; i++){
                System.out.print((char) f.read());
            }
            System.out.println("Все еще доступно " + f.available());

            byte b[] = new byte[n];
            if (f.read(b) != n){
                System.err.println("Cant read this");
            }
            System.out.println(new String(b,0,n));
            System.out.println(f.available());

            System.out.println(f.skip(size/2));
            System.out.println(f.available());



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
