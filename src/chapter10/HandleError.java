package chapter10;

import java.util.Random;

/**
 * Created by Владислав on 10.03.2017.
 */
public class HandleError {
    public static void main(String[] args) {
        int a , b, c ;
        Random random = new Random();
        for (int i=0; i<32000; i++){
           try {
               b = random.nextInt();
               c = random.nextInt();
               a = 12345 / (b / c);
           }
           catch (ArithmeticException e){
               System.out.println("bad time");
               a =0;
           }
            System.out.println(a);
        }
    }
}
