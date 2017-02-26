package chapter07;

/**
 * Created by Владислав on 22.02.2017.
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "First";
        String s2 = "Second";
        String s3 = s1;

        System.out.println(s1.length());
        System.out.println(s1.charAt(1));

        if (s1.equals(s2)) System.out.println("true");
        else System.out.println("false");
        if (s1.equals(s3)) System.out.println("true");
else System.out.println(false);
    }
}
