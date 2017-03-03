package chapter18;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Владислав on 01.03.2017.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("A");
        set.add("e");
        set.add("r");
        set.add("t");
        set.add("y");
        System.out.println(set);
    }
}
