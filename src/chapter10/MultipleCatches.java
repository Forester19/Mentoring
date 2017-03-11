package chapter10;

/**
 * Created by Владислав on 10.03.2017.
 */
public class MultipleCatches {
    public static void main(String[] args) {
       try {
           int a = args.length;
           System.out.println(a);
           int b  = 42/a;
           int c[] = {1};
           c[42] = 99;
       }catch (ArithmeticException e){
           System.out.println("multipl on zero");
       }catch (ArrayIndexOutOfBoundsException e ){
           System.out.println("Error of indexation array");
       }
        System.out.println("its after catch block");
       }
}
