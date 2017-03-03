package chapter18;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by Владислав on 01.03.2017.
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new LinkedHashSet<>();
        hs.add("Sd");
        hs.add("Sdsd");
        hs.add("Sdsd");
        hs.add("Sdsds");
        hs.add("Sd");
        hs.add("Sd");
        System.out.println(hs);
    }
}
