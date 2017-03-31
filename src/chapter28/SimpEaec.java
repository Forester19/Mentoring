package chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Владислав on 30.03.2017.
 */
public class SimpEaec {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);
        ExecutorService ess = Executors.newFixedThreadPool(2);
        System.out.println("starting threads");
        ess.execute(new MyThread3("A", cdl));
        ess.execute(new MyThread3("B", cdl2));
        ess.execute(new MyThread3("C", cdl3));
        ess.execute(new MyThread3("D", cdl4));

        try{
            cdl.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ess.shutdown();
        System.out.println("Stop threads");
    }
}
class MyThread3 implements Runnable{
String name;
CountDownLatch latch;

    public MyThread3(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
        new Thread(this);
    }
    @Override
    public void run() {
     for (int i=0; i<5; i++){
         System.out.println(name + ": " + i );
         latch.countDown();
     }
    }
}
