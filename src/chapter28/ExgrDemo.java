package chapter28;

import java.util.concurrent.Exchanger;

/**
 * Created by Владислав on 29.03.2017.
 */
public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> stringExchanger = new Exchanger<>();
        new MakeString(stringExchanger);
        new UseString(stringExchanger);
    }
}

class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;

    public MakeString(Exchanger<String> ex) {
        this.ex = ex;
        str = new String();
        new Thread(this).start();
    }

    @Override
    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            {
                str += (char) ch++;

                try {
                    str = ex.exchange(str);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class UseString implements Runnable {
    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> ex) {
        this.ex = ex;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                str = ex.exchange(new String());
                System.out.println("Taken " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

