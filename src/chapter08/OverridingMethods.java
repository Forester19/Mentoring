package chapter08;

/**
 * Created by Владислав on 23.02.2017.
 */
class F{
    int i,j;

    public F(int i, int j) {
        this.i = i;
        this.j = j;
    }
    void showVar(){
        System.out.println(i+ " " + j);
    }

}

class L  extends F{
int k;
    public L(int i, int j, int h) {
        super(i, j);
        this.k =h;
    }

    @Override
    void showVar() {
        System.out.println(k);
    }
}
public class OverridingMethods {
    public static void main(String[] args) {
        L l = new L(1,2,3);
        l.showVar();
    }
}
