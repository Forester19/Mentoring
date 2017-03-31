package chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by Владислав on 30.03.2017.
 */
class Sum extends RecursiveTask<Double>{
 final int seqThresHold = 500;
 double[] data;
 int start, end;

    public Sum(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }
    @Override
    protected Double compute() {
        double sum = 0;
        if ((end- start) < seqThresHold){
            for (int i= start; i<end; i++){
                sum += data[i];
            }
        }else {
            int mid = (start + end)/2;

            Sum sum1 = new Sum(data,start,mid);
            Sum sum2 = new Sum(data,mid,end);


            sum1.fork();
            sum2.fork();

            sum = sum1.join() + sum2.join();
        }
        return  sum;
    }
}
public class RecurTaskDEmo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[5000];

        for (int i=0;i<nums.length;i++){

            nums[i] = (double) ((i%2 ==0)? i:-i);}
            Sum task = new Sum(nums,0,nums.length);

        double summar = fjp.invoke(task);
        System.out.println(summar);
    }
}
