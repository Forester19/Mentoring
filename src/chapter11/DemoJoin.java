package chapter11;

/**
 * Created by Владислав on 28.03.2017.
 */
class NewThreadForJoin implements Runnable{
    String name;
    Thread t;

    public NewThreadForJoin(String name) {
        this.name = name;
        t = new Thread(name);
        System.out.println("New thread  " + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i=5; i>0; i--){
            System.out.println(name + ": " + i);
            try {
                System.out.println("name " + i);
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " is end.");
    }
}
public class DemoJoin {
    public static void main(String[] args) throws InterruptedException {
NewThreadForJoin ob1 = new NewThreadForJoin("one");
NewThreadForJoin ob2 = new NewThreadForJoin("two");
NewThreadForJoin ob3 = new NewThreadForJoin("three");
        System.out.println("First thread " + ob1.t.isAlive());
        System.out.println("Second thread " + ob1.t.isAlive());
        System.out.println("Threat thread " + ob1.t.isAlive());

        ob1.t.join();
        ob2.t.join();
        ob3.t.join();

        System.out.println("First thread " + ob1.t.isAlive());
        System.out.println("Second thread " + ob1.t.isAlive());
        System.out.println("Threat thread " + ob1.t.isAlive());
        System.out.println(
        );
        System.out.println("end of main thread");
    }
}
