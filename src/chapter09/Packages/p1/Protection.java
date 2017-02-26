package chapter09.Packages.p1;

/**
 * Created by Владислав on 23.02.2017.
 */
public class Protection {
    int n =1;
    private int n_pri = 2;
    protected  int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("constr Of superclass");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
class Derived extends Protection{
    public Derived() {
        System.out.println("constr of underclass");
        System.out.println("n = " + n);
       // System.out.println("n_pri = " + n_pri);// приват наследники не видят
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
class SamePakage{

    public SamePakage() {
        Protection p = new Protection();
        System.out.println("constr of class from this package");
        System.out.println("n = " + p.n);
        // System.out.println("n_pri = " + n_pri);// приват наследники не видят
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }

}
