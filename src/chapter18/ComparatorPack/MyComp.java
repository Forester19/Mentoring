package chapter18.ComparatorPack;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Владислав on 03.03.2017.
 */
public class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
       String aStr,bStr;
       aStr = o1;
       bStr = o2;
        return bStr.compareTo(aStr);
    }


}
class Main{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        ts.add("A");
        ts.add("b");
        ts.add("d");
        ts.add("f");
        ts.add("g");
        for (String s: ts){
            System.out.println(s);
        }
    }
}
