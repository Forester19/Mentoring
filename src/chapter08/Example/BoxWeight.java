package chapter08.Example;

/**
 * Created by Владислав on 22.02.2017.
 */
public class BoxWeight extends Box{
    double weight;

    public BoxWeight(Shipment ob) {
        super(ob);
        this.weight = weight;
    }

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight() {
        super();
        weight =-1;
    }

    public BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}
