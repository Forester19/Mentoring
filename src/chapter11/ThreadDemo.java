package chapter11;

/**
 * Created by Владислав on 28.03.2017.
 */
class NewThread implements Runnable{
Thread t;

    public NewThread() {
       t = new Thread(this,"demonstration");
        System.out.println();
        t.start();
    }

    @Override
    public void run() {
   for (int i=5; i>0; i--){
       System.out.println("second thread " + i);
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
        System.out.println("End of main thread");
    }
}
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        new Thread();
        for (int i =5; i>0; i--){
            System.out.println("main thread "+ i);
            Thread.sleep(1000);
        }
        System.out.println("End of main thread");
    }
}
