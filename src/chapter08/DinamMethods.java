package chapter08;

/**
 * Created by Владислав on 23.02.2017.
 */
class M{
    void callme() {
        System.out.println("M");
    }
}
class O extends  M{
    void callme() {
        System.out.println("O");
    }
}
class Q extends M{
    void callme() {
        System.out.println("Q");
    }
}
public class DinamMethods {
    public static void main(String[] args) {


        M m = new M();
        O o = new O();
        Q q = new Q();


        M r;
        r = o;
        r.callme();
        r = q;
        r.callme();

    }
}
