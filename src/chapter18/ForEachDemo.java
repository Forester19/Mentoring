package chapter18;

import java.util.ArrayList;

/**
 * Created by Владислав on 01.03.2017.
 */
public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        for (int i:
        arrayList){
            System.out.print(i + " ");
        }
        System.out.println();
        int sum =0;
        for (int i :
                arrayList) {
            sum += i;
        }
        System.out.println(sum);
    }
}
