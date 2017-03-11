package chapter10;

/**
 * Created by Владислав on 10.03.2017.
 */
public class Exc {
    public static void main(String[] args) {
        int d,a;
        try{
            d =0;
            a = 42/d;
        }catch (ArithmeticException e){
            System.out.println("multipl zero");
        }
        System.out.println("after operator catch");
    }
}
