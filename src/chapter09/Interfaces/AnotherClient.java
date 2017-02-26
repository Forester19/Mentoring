package chapter09.Interfaces;

/**
 * Created by Владислав on 23.02.2017.
 */
public class AnotherClient  implements CallBack{
    @Override
    public void callme(int i) {
        System.out.println(i*i);
    }
}
