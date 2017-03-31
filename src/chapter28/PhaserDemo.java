package chapter28;

import java.util.concurrent.Phaser;

/**
 * Created by Владислав on 30.03.2017.
 */
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;
        System.out.println("Starting threads");

        new MyThread2(phaser,"A");
        new MyThread2(phaser,"B");
        new MyThread2(phaser,"C");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " stop");


        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " stop");


        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " stop");

        phaser.arriveAndAwaitAdvance();

        if (phaser.isTerminated()) System.out.println("syn phases stop");
    }
}
class MyThread2 implements Runnable{
Phaser phsr;
String name;

    public MyThread2(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        phsr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " starting firs phase");
      phsr.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + name + " starting second phase ");
        phsr.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + name + " starting thread phase");
        phsr.arriveAndAwaitAdvance();
    }
}
