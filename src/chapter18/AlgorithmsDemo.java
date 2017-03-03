package chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Владислав on 03.03.2017.
 */
public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
      ll.add(-8);
      ll.add(20);
      ll.add(-20);
      ll.add(8);
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll,r);
        for (int i: ll) System.out.println(i);
        System.out.println();
        Collections.shuffle(ll);
        for (int i: ll) System.out.println(i);
        System.out.println();
        System.out.println("min: " +  Collections.min(ll));
        System.out.println("max: " +  Collections.max(ll));
    }
}
