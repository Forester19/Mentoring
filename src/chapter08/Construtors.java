package chapter08;

/**
 * Created by Владислав on 23.02.2017.
 */
class Z{
    public Z() {
        System.out.println("Z");
    }
}

class X extends Z{
    public X() {
        System.out.println("X");
    }
}

class C extends X{
    public C() {
        System.out.println("C");
    }
}

public class Construtors {
    public static void main(String[] args) {
        C c = new C();
    }
}
