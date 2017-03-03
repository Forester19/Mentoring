package chapter18.ComparatorPack;

import java.util.TreeSet;

/**
 * Created by Владислав on 03.03.2017.
 */
public class ComparatorDemo {


    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(
                (aStr,bStr) -> bStr.compareTo(aStr)
        );
        ts.add("A");
        ts.add("B");
        ts.add("V");
        ts.add("C");
        for (String s: ts)
            System.out.println(s);
    }
}
