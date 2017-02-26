package chapter08;

/**
 * Created by Владислав on 22.02.2017.
 */
class G{
    int i;
}
class V extends G{
    int i;
    V(int a, int b){
        i =a;
        super.i = b;
    }
    void show(){
        System.out.println(i);
        System.out.println(super.i);
    }


}
public class UseSuper {
    public static void main(String[] args) {
        V v = new V(2,3);
        v.show();
    }
}
