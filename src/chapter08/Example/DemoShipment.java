package chapter08.Example;

/**
 * Created by Владислав on 22.02.2017.
 */
public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(1,2,3,4,5);
    Shipment shipment1 = new Shipment(2,3,4,5,0.4);

    double vol;
    vol = shipment.volume();
        System.out.println(vol);
        System.out.println(shipment.cost);

     vol = shipment1.volume();
        System.out.println(vol);
        System.out.println(shipment1.cost);
    }
}
