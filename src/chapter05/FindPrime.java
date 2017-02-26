package chapter05;

/**
 * Created by Владислав on 20.02.2017.
 */
public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime = true;

         num =2017;
        if (num<2) isPrime =false;

        for (int i=2; i<num/i; i++){
            if ((num%i) == 0) isPrime =false;
            break;
        }
        if (isPrime) System.out.println("prime");
        else System.out.println("no");
    }
}
