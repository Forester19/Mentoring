package chapter07;

/**
 * Created by Владислав on 21.02.2017.
 */

class Outer{
    int outer_x =20;

    void test(int i){
        for (int j=0; j<i;j++){
            class Inner{
                void display(){
                    System.out.println(outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }

    }


}


public class InnerInFor {
    public static void main(String[] args) {
Outer outer = new Outer();
outer.test(60);
    }
}
