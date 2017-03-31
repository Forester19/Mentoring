package chapter11;

/**
 * Created by Владислав on 29.03.2017.
 */
class NewThreadMy implements Runnable{
String name;
Thread t;
boolean suspendFlag;

    public NewThreadMy(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New thread " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try{
            for (int i =15; i>0; i--){
                System.out.println(name + " : " + t);
                Thread.sleep(200);
            synchronized (this){
                while (suspendFlag) wait();
            }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " canceled");
    }
    synchronized  void mysuspend(){
        suspendFlag = true;
    }
    synchronized  void myresume(){
        suspendFlag = false;
        notify();
    }
}
public class SuspendDemo {
    public static void main(String[] args) {
        NewThreadMy ob1 = new NewThreadMy("one");
        NewThreadMy ob2 = new NewThreadMy("two");
        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("stoping thread one");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("restarting thread one");
            ob2.mysuspend();
            System.out.println("stoping thread two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("restarting thread two");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
