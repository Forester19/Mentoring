package chapter20;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * Created by Владислав on 19.03.2017.
 */
public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghiklmnopqrstuvwxyz";
        int length = tmp.length();
        char c[] = new char[length];
        tmp.getChars(0,length,c,0);
        int i;
        try(CharArrayReader input1 = new CharArrayReader(c)){
            while((i = input1.read()) !=-1){
                System.out.print((char ) i );
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(CharArrayReader input1 = new CharArrayReader(c,0,5)){
            while((i = input1.read()) !=-1){
                System.out.print((char ) i );
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
