package chapter10;

/**
 * Created by Владислав on 10.03.2017.
 */
public class MethNestTry {
    static void nestry(int a){
        try {
            if (a == 1) a = a/(a-a);
            if (a == 2) {
                int c[] = new int[1];
              c[42 ] = 99;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
try {
    int a = args.length;
    int b = 42/a;
    System.out.println(a);
    nestry(a);
}catch (ArithmeticException e){
    System.out.println(e);
}
    }
}
