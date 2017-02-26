package chapter09;

/**
 * Created by Владислав on 23.02.2017.
 */
class Balance{
    String name;
    double bal;

    public Balance(String name, double bal) {
        this.name = name;
        this.bal = bal;
    }
    void show(){
        if (bal<0) System.out.println("-->");
        System.out.println(name + ": &" + bal);
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];
        current[0] = new Balance("Andrew", 34);
        current[1] = new Balance("Ani", 4345);
        current[2] = new Balance("jerry", 345);


        for (Balance b:current) System.out.println(b);
    }

}
