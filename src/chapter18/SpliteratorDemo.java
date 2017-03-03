package chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 * Created by Владислав on 01.03.2017.
 */
public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        Spliterator<Double> spliterator = arrayList.spliterator();
        while (spliterator.tryAdvance((n)-> System.out.println(n) ));
        System.out.println();

        spliterator = arrayList.spliterator();
        ArrayList<Double> sqrt = new ArrayList<>();
        while (spliterator.tryAdvance((n)->sqrt.add(Math.sqrt(n))));

        spliterator = sqrt.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
