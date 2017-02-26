package chapter08;

/**
 * Created by Владислав on 22.02.2017.
 */
class A{
    int i,j;
    void showIJ(){
        System.out.println(i+ " " + j);
    }
}
class B extends A{
    int k;
    void showK(){
        System.out.println(k);
    }
    void sum(){
        System.out.println("i+j+k" + (i+j+k));
    }
}
public class Extending {
    public static void main(String[] args) {
   A a = new A();
   B b = new B();

   a.i = 10;
   a.j = 20;
   a.showIJ();

   b.i=10;
   b.j=10;
   b.k=10;

   b.showIJ();
   b.showK();

   b.sum();

    }
}
