package chapter08;

/**
 * Created by Владислав on 22.02.2017.
 */
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(1,2,3,4);
    Box box = new Box();
    double vol;

    vol = boxWeight.volume();
        System.out.println(vol);
        System.out.println(boxWeight.weight);
        System.out.println();

        box = boxWeight;

        vol = box.volume();

        System.out.println(vol);
    }
}
