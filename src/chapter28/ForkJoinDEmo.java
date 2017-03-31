package chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * Created by Владислав on 30.03.2017.
 */

public class ForkJoinDEmo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[100000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        System.out.println("Part of initial sequence");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
            System.out.println("\n");

        }
        SqrtTransform task = new SqrtTransform(0,nums.length,nums);
        fjp.invoke(task);
        for (int i=0; i<10; i++){
            System.out.format("%.4f",nums[i]);
            System.out.println();
        }

    }

}

class SqrtTransform extends RecursiveAction {
    final int seqThreshold = 1000;
    int start, end;
    double[] data;

    public SqrtTransform(int start, int end, double[] data) {
        this.start = start;
        this.end = end;
        this.data = data;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                data[i] = (int) Math.sqrt(data[i]);
            }
        } else {
            int middle = (start + end) / 2;
            invokeAll(new SqrtTransform(start, middle, data));
            invokeAll(new SqrtTransform(middle, end, data));
        }
    }
}
