package chapter04;

/**
 * Created by Владислав on 20.02.2017.
 */
public class IncDec {
    public static void main(String[] args) {
        int a=1, b = 2,c,d;

        c = ++b;
        d = a++;
        c++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
