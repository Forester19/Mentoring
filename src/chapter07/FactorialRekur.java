package chapter07;

import java.math.BigInteger;

/**
 * Created by Владислав on 21.02.2017.
 */
public class FactorialRekur {
    public static void main(String[] args) {
        Second second = new Second();
        System.out.println(second.fact(50));
    }
}
class Second{

    int fact(int i){
        if ( i == 1) return i;
        int res = fact(i-1)*i;
        return res;

    }
}
