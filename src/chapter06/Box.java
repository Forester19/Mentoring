package chapter06;

/**
 * Created by Владислав on 21.02.2017.
 */
public class Box {
    double widht;
    double height;
    double depth;
}
class BoxDemo{
    public static void main(String[] args) {
        Box box = new Box();
        double vol;
        box.widht =10;
        box.height=20;
        box.depth=15;

        vol = box.depth*box.height*box.widht;
        System.out.println("V = " + vol);
    }

}