package chapter07;

/**
 * Created by Владислав on 22.02.2017.
 */
public class ArgVar {
    static void vaTest(int ... v){

        for (int k:v) System.out.println(k);

    }
    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {10, 1,2 ,1,1};
        int n3[] = {};
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
