package chapter20;

import java.io.ByteArrayInputStream;

/**
 * Created by Владислав on 19.03.2017.
 */
public class ByteArrayInputStreamResrt {
    public static void main(String[] args) {
        String abc = "abc";
        byte b[] = abc.getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(b);
        for (int i =0; i<2 ;i++){
            int c;
            while ((c = input.read()) != -1){
                if (i == 0){
                    System.out.print((char) c);
                }else{
                    System.out.print(Character.toUpperCase((char)c));
                }
                System.out.println();
            }
            input.reset();
        }

    }
}
