package chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Владислав on 29.03.2017.
 */
public class BarDemo {
    public static void main(String[] args) {
       CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new BarAction());
       new MyThread1(cyclicBarrier, "A");
       new MyThread1(cyclicBarrier, "B");
       new MyThread1(cyclicBarrier, "C");
    }
}
class MyThread1 implements Runnable{
CyclicBarrier cb;
String name;

    public MyThread1(CyclicBarrier cb, String name) {
        this.cb = cb;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
class BarAction implements Runnable{

    @Override
    public void run() {
        System.out.println("Barer reached");
    }
}
