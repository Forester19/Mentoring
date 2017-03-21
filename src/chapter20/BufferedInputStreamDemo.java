package chapter20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Created by Владислав on 19.03.2017.
 */
public class BufferedInputStreamDemo {

    public static void main(String[] args) {
        String s ="Это знак авторского права &copy; "
                + ", when &copy - not.\n";
        byte buf[] = s.getBytes();
        System.out.println(buf);
       ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c ;
        boolean marked = false;
        try(BufferedInputStream f = new BufferedInputStream(in)) {
            while ((c = f.read()) !=1){
                switch (c){
                    case '&':
                        if(!marked){
                            f.mark(32);
                            marked = true;
                        }
                        else marked = false;
                        break;
                    case ';':
                        if (marked){
                            marked = false;
                            System.out.print("(c)");
                        }else
                            System.out.print((char) c);
                        break;
                    case ' ':
                        if (marked){
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        }else
                            System.out.println((char) c);
                        break;
                        default:
                            if (!marked)
                                System.out.println((char) c);
                            break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
