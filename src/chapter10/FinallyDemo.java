package chapter10;

/**
 * Created by Владислав on 10.03.2017.
 */
public class FinallyDemo {
    static void procA(){
        try{
            System.out.println("method a");
            throw new RuntimeException("Exp");
        }finally {
            System.out.println("finally in meth a");
        }
    }
    static  void procB(){
        try{
            System.out.println("method b");
            return;
        }finally {
            System.out.println("finally in b");
        }
    }
    static void procC(){
        try{
            System.out.println("in meth a");
        }finally {
            System.out.println("finally in c");
        }
    }
    public static void main(String[] args) {
        try{
            procA();
        }catch (Exception e){
            System.out.println(e);
        }
        procB();
        procC();
    }
}
