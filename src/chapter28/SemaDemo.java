package chapter28;

import java.util.concurrent.*;

/**
 * Created by Владислав on 29.03.2017.
 */
public class SemaDemo {
    public static void main(String[] args) {
   Semaphore sem = new Semaphore(1);
   new IncThread("A", sem);
   new DecThread("B", sem);
    }
}
class IncThread implements Runnable{
String name;
Semaphore sem;

    public IncThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("starting thread: " + name);
        try{
            System.out.println("Thread " + name+ " wait for resolution");
            sem.acquire();
            System.out.println("Thread " + name+ " taken resolution" );
            for (int i=0; i<5;i++){
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + name + " release resolution");
      sem.release();
    }
}
class Shared{
    static int count = 0;
}
class DecThread implements Runnable{
String name;
Semaphore sem;

    public DecThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Starting thread " + name);
   try{
       System.out.println("Thread " + name + " wait for resolution");
   sem.acquire();
       System.out.println("Thread " + name + " taken resolution");
   for (int i=0; i<5; i++){
       Shared.count--;
       System.out.println(name + ": " + Shared.count);
       Thread.sleep(10);
   }
   } catch (InterruptedException e) {
       e.printStackTrace();
   }
        System.out.println("Thread " + name + " release resolution");
   sem.release();
    }

}
