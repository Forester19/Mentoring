package chapter03;

/**
 * Created by Владислав on 21.02.2017.
 */
public class LifeTimeVar {
    public static void main(String[] args) {
        int x;
        for (x=0;x<3;x++){
            int y=-1;
            System.out.println(y);
            y=100;
            System.out.println(y);
        }
    }
}
