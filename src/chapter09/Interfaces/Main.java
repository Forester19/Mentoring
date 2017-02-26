package chapter09.Interfaces;

/**
 * Created by Владислав on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callme(56);
        CallBack c1 = new AnotherClient();
        c1.callme(33);
    }
}
