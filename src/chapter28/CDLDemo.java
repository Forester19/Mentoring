package chapter28;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Владислав on 29.03.2017.
 */
public class CDLDemo {
    public static void main(String[] args) {
     CountDownLatch countDownLatch = new CountDownLatch(5);
        System.out.println("Starting thread doing");
        new MyThread(countDownLatch);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of thread doing");
    }
}
class MyThread implements Runnable{
    CountDownLatch latch;

    public MyThread(CountDownLatch latch) {
        this.latch = latch;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println(i);
            latch.countDown();
        }

    }
}
