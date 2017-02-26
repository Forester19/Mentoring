package chapter07;

/**
 * Created by Владислав on 22.02.2017.
 */
public class OverloadingMethodsWithVars {
    static void vaTest(int ... v){
        System.out.print(v.length +":" + "  ");
        for (int k:v){
            System.out.print(" "+k+" ");
        }
        System.out.println();

    }
    static void vaTest(boolean ... v){
        System.out.print(v.length +":" + "  ");
        for (boolean k:v){
            System.out.print(" "+k+" ");
        }
        System.out.println();

    }
    static void vaTest(String m, int ... v){
        System.out.print(v.length +":" + "  ");
        for (int k:v){
            System.out.print(" "+k+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {

        vaTest(1,2,3);
        vaTest(true,true,false);
        vaTest("fffff",12,12,12);

    }
}
