package chapter18;

import java.util.Objects;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Владислав on 03.03.2017.
 */
public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Illinoise","Sprigf");
        capitals.put("Illinoise","Sprigf");
        capitals.put("Illinoise","Sprigf");
        capitals.put("Illinoise","Sprigf");
        capitals.put("Illinoise","Sprigf");
        Set<?> states = capitals.keySet();
        for (Object name : states){
            System.out.println(name + "-" + capitals.getProperty(String.valueOf(name)));
        }
    }
}
