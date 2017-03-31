package chapter11;

/**
 * Created by Владислав on 28.03.2017.
 */
class NewThread1 extends Thread{


    public NewThread1() {
        super("demonstration thread");
        System.out.println();
        start();
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
public class ExtendsThread {

    public static void main(String[] args) {

    new Thread();
        for (int i =5; i>0; i--){
        System.out.println("main thread "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of main thread");
}
}
