package chapter18;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Владислав on 03.03.2017.
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3,2);
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println(v.capacity());
        v.addElement(5);
        System.out.println(v.capacity());

        Enumeration<Integer>  vEnum =v.elements();
        System.out.println("elements of vector");
        while(vEnum.hasMoreElements()){
            System.out.print(vEnum.nextElement());
        }
        System.out.println();
     }
}
