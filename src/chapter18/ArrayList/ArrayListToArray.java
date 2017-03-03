package chapter18.ArrayList;

import java.util.ArrayList;

/**
 * Created by Владислав on 01.03.2017.
 */
public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Integer[] mas = new Integer[list.size()];
        mas = list.toArray(mas);
        int sum = 0;
        for (int element: mas) sum += element;
        System.out.println(sum);
    }
}
