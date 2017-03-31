package chapter11;

/**
 * Created by Владислав on 29.03.2017.
 */
class A {
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name + "entered id method A.foo()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Stop class A");
        }
        System.out.println(name + "want to call method B.last() ");
        b.last();
    }
    synchronized  void last(){
        System.out.println("in method A.last");
    }
}
class B{
    synchronized  void  bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + "entered in method B.bar()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name +  " want to call method A.last()");
        a.last();
    }
    synchronized  void last(){
        System.out.println("In method A.last");
    }
}
public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    public Deadlock() {
    Thread.currentThread().setName("Main thread");
    Thread t = new Thread(this, "other thread");
    t.start();

    a.foo(b); // blocking object a
        System.out.println("come to main thread");
    }

    @Override
     public void run() {
      b.bar(a); //blocking object b
        System.out.println("come to other thread");

    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
