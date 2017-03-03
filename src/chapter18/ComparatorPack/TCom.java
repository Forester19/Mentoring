package chapter18.ComparatorPack;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Владислав on 03.03.2017.
 */
public class TCom implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j ,k;
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        k = o1.substring(i).compareTo(o2.substring(j));

        if (k ==0) return o1.compareTo(o2);
        else return k;
    }
}
class MainClass{
    public static void main(String[] args) {
        TreeMap<String,Double>  tm = new TreeMap<>();
        tm.put("aa wf",234.23);
        tm.put("bb sdf",234.23);
        tm.put("ccw ef",234.23);
        tm.put("dd wwwe",234.23);
        tm.put("aa cv",234.23);
        Set<Map.Entry<String,Double>> set = tm.entrySet();
        for (Map.Entry<String,Double> m: set){
            System.out.println(m);
        }
    }
}