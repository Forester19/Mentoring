package chapter18.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Владислав on 01.03.2017.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Double> hm = new HashMap<>();
     hm.put("ffsd", new Double(123123.312));
     hm.put("dsfd", new Double(123.4));
     hm.put("asd", new Double(123.312));
     hm.put("nhgsd", new Double(3123.312));
        Set<Map.Entry<String,Double>> set = hm.entrySet();
        for (Map.Entry<String,Double> me : set){
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        System.out.println();
        //add money for ffsd
        double balance = hm.get("ffsd");
        hm.put("ffsd", balance + 1000);
        System.out.println(hm);
    }
}
