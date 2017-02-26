package chapter09;


/**
 * Created by Владислав on 24.02.2017.
 */

interface A{
    void meth1();
    void meth2();
}
interface B extends A{
    void meth3();
}
class MyClass implements B{

    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth2");
    }
}

public class ExtendingInterfaces {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.meth1();
        myClass.meth2();
        myClass.meth3();
    }
}
