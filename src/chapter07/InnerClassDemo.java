package chapter07;

/**
 * Created by Владислав on 21.02.2017.
 */
class Out{
    int out_x = 3;
    void test(){
        Inner inner = new Inner();
        inner.displey();
    }

    class Inner{
        void displey(){
            System.out.println(out_x);
        }
    }
}




public class InnerClassDemo {
    public static void main(String[] args) {
Out out = new Out();
out.test();
    }
}
