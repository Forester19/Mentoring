package chapter08;

/**
 * Created by Владислав on 23.02.2017.
 */
abstract class Demo{
    abstract void callMe();
    public void allMeToo(){
        System.out.println("callmetoo");
    }
}
class Exampl extends Demo{

    @Override
    void callMe() {
        System.out.println("callMe");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Exampl exampl = new Exampl();
        exampl.callMe();
        exampl.allMeToo();
    }
}
