package chapter10;

/**
 * Created by Владислав on 10.03.2017.
 */
public class ThrowDemo {
    static void demoproc(){
        try{
            throw  new NullPointerException("demonstr");
        }catch (NullPointerException e){
            System.out.println("Exep in method");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
