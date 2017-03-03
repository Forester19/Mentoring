package chapter18.ArrayList;

import java.util.ArrayList;

/**
 * Created by Владислав on 01.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("C");
        list.add("C");
        list.add("F");
        list.add("C");
        list.add("C");
        list.add(1,"g");
        System.out.println(list.size());
        System.out.println(list);
        list.remove("F");
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list);
    }
}
