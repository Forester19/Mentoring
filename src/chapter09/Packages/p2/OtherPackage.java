package chapter09.Packages.p2;

import chapter09.Packages.p1.Protection;

/**
 * Created by Владислав on 23.02.2017.
 */
class Protection2 extends Protection{
    public Protection2() {
        System.out.println("constr of uderclass from otger package");
        //System.out.println("n = " + n); доступно только для класса или пакета.
        // System.out.println("n_pri = " + n_pri);// приват наследники не видят
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
public class OtherPackage {
    public OtherPackage() {
        Protection p =new Protection();
        System.out.println("constr of other package");
       // System.out.println("n = " + p.n);
        // System.out.println("n_pri = " + n_pri);// приват наследники не видят
        //System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " +p.n_pub);
    }
}
