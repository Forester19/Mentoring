package chapter05;

/**
 * Created by Владислав on 21.02.2017.
 */
public class Continue {
    public static void main(String[] args) {
        for (int i =0; i< 100; i++){
            if (i%2 == 0)continue;
                System.out.println(i);
            System.out.println("  ");
        }
    }
}
