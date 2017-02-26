package chapter08;

/**
 * Created by Владислав on 22.02.2017.
 */
class I{
    int i;
    private int j; // this field cant see underclass;
    void showIJ(){
        System.out.println(i+ " " + j);
    }
}
class J extends I{
    int k;
    void showK(){
        System.out.println(k);
    }
    void sum(){
       // System.out.println("i+j+k" + (i+j+k));
    }
}
public class privateFields {
    public static void main(String[] args) {
        I a = new I();
        J b = new J();

        a.i = 10;
       // a.j = 20;
        a.showIJ();

        b.i=10;
        //b.j=10;
        b.k=10;

        b.showIJ();
        b.showK();

        b.sum();

    }
}

