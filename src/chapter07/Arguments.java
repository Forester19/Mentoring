package chapter07;

/**
 * Created by Владислав on 22.02.2017.
 */
public class Arguments {
    static void vaTest(int v[]){
        for (int y: v){
            System.out.println(y);
        }

    }

    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {10,1,2,3};
        int n3[] = {};

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
