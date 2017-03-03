package chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Владислав on 01.03.2017.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("v");
        list.add("af");
        list.add("ad");
        list.add("r");
        list.add("y");
        list.add("l");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.print(element +  " ");
        }
        System.out.println();
        ListIterator<String> litr = list.listIterator();
        while (litr.hasNext()){
            String el = litr.next();
            litr.set(el + " +");
        }
        iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.print(element +  " ");
    }}
}
