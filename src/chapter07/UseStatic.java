package chapter07;

/**
 * Created by Владислав on 21.02.2017.
 */
public class UseStatic {
    static int a = 3;
    static int b;
    static void math(int i){
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);

    }
    static {
        b = a*4;
    }

    public static void main(String[] args) {
math(43);
    }
}
