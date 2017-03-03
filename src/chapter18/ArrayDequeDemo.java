package chapter18;

import java.util.ArrayDeque;

/**
 * Created by Владислав on 01.03.2017.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("A");
        arrayDeque.push("V");
        arrayDeque.push("D");
        arrayDeque.push("S");
        System.out.print("Get from stack: ");
        while (arrayDeque.peek() != null){
            System.out.print(arrayDeque.pop()+" ");
        }
        System.out.println();
    }
}
