package chapter18.LinkedList;

import java.util.LinkedList;

/**
 * Created by Владислав on 01.03.2017.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Q");
        linkedList.add("W");
        linkedList.add("e");
        linkedList.add("r");
        linkedList.addFirst("A");
        linkedList.addLast("Z");
        System.out.println(linkedList);
        linkedList.remove(2);
        linkedList.remove("W");
        String val = linkedList.get(2);
        linkedList.set(2, val+ " refactored");
        System.out.println(linkedList);
    }
}
