package chapter03.Arrays;

/**
 * Created by Владислав on 21.02.2017.
 */
public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1,11.2,12.3,13.4,14.5};
        double res =0;
        int i;
        for (i =0; i< nums.length; i++){
            res = res + nums[i];
        }
        res = res/nums.length;
        System.out.println(res);

    }
}
