package chapter04;

/**
 * Created by Владислав on 20.02.2017.
 */
public class Ternary {
    public static void main(String[] args) {
        int i,k;
        i =10;
         k = i<0? -i:i;
        System.out.println(i+" "+ k);
        i =-10;
        k= i<0? -i:i;
        System.out.println(i + " " + k);
    }
}
