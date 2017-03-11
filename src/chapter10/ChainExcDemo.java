package chapter10;

/**
 * Created by Владислав on 10.03.2017.
 */
public class ChainExcDemo {
    static void demoproc(){
        NullPointerException e = new NullPointerException("high level");
    e.initCause(new ArithmeticException("that's why"));
    throw e;
    }
    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println(e.getCause());
        }
        }
}
