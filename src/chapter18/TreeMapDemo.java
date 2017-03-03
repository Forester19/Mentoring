package chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Владислав on 02.03.2017.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Double> tm = new TreeMap<>();
    tm.put("aa",21223.221);
    tm.put("aa",21223.221);
    tm.put("aa",21223.221);
    tm.put("aa",21223.221);
    tm.put("aa",21223.221);
    tm.put("aa",21223.221);
        Set<Map.Entry<String,Double>> set = tm.entrySet();

     for (Map.Entry<String,Double> i: set){
         System.out.print(i.getKey() + ":  ");
         System.out.println(i.getValue());
     }
        System.out.println();
     double balance = tm.get("aa");
     tm.put("aa", balance + 1000);
        System.out.println(tm.get("aa"));
    }
}
