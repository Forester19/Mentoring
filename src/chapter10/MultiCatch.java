package chapter10;

/**
 * Created by Владислав on 10.03.2017.
 */
public class MultiCatch {
    public static void main(String[] args) {
        int a =10, b =0;
        int vals[] = {1,2,3};
        try{
            int res = a/b;
            vals[10] = 19;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("catched excep " + e);
        }
        System.out.println("after this");
    }
}
