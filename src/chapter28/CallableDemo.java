package chapter28;

import java.util.concurrent.*;

/**
 * Created by Владислав on 30.03.2017.
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f;

        f = es.submit(new Factorial(5));

        try {
            System.out.println(f.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        es.shutdown();
        System.out.println("End");
    }
}
class Factorial implements Callable<Integer>{
int stop;

    public Factorial(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int fact =1;
        for (int i=2; i<=stop; i++){
            fact *=i;
        }
        return fact;
    }
}
