package chapter08.Example;

/**
 * Created by Владислав on 22.02.2017.
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob){
        width = ob.width;
        height= ob.height;
        depth= ob.depth;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        width =-2;
        height =-2;
        depth=-2;
    }
    Box(double len){
        width =len;
        height =len;
        depth =len;

    }
    double volume(){
        return width*height*depth;
    }
}
