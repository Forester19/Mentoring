package chapter11;

/**
 * Created by Владислав on 28.03.2017.
 */
class Callme{
   synchronized void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");

    }
}
class Caller implements Runnable{
String msg;
Callme target;
Thread t;

    public Caller(String msg, Callme target) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
target.call(msg);
    }
}
public class Sinch {
    public static void main(String[] args) {
        Callme callme = new Callme();
        Caller caller1 = new Caller("first",callme);
        Caller caller2 = new Caller("second",callme);
        Caller caller3 = new Caller("threat",callme);

        try {
            caller1.t.join();
            caller2.t.join();
            caller3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
