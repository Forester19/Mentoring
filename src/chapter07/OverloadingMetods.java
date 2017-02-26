package chapter07;

/**
 * Created by Владислав on 21.02.2017.
 */
public class OverloadingMetods {
    void test ( ) {
        System.out.println("no param");
    }
        void test (int а) {
            System.out.println(" a : " + а);
        }
    void test ( int i, int j) {
        System.out.println(" i : " + i
                + " j : " + j);
    }

}

class Overload{
    public static void main(String[] args) {
        OverloadingMetods overloadingMetods = new OverloadingMetods();
        overloadingMetods.test();
        overloadingMetods.test(8);
        overloadingMetods.test(7,8);
    }
        }
