package chapter08;

/**
 * Created by Владислав on 22.02.2017.
 */
class Box{
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(double len) {
        height = len;
        width = len;
        depth = len;
    }
    double volume(){
        return width*height*depth;
    }

}
class BoxWeight extends Box{
    double weight;

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}
public class AnatherEample {
    public static void main(String[] args) {
        BoxWeight bw = new BoxWeight(1,2,3,4);
        BoxWeight bw2 = new BoxWeight(2,3,4,5);

        double vol;

        vol = bw.volume();
        System.out.println(vol);


        vol = bw2.volume();
        System.out.println(vol);
    }
}
