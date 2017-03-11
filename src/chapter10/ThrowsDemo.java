package chapter10;

/**
 * Created by Владислав on 10.03.2017.
 */
public class ThrowsDemo {
    static void demo() throws IllegalArgumentException{
        throw new IllegalArgumentException("ex");
    }
    public static void main(String[] args) {
        try{
            demo();
        }catch (IllegalArgumentException r){
            System.out.println(r + " hello");
        }
    }
}
