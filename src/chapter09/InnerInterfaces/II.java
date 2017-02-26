package chapter09.InnerInterfaces;

/**
 * Created by Владислав on 23.02.2017.
 */
public class II {
    interface FF{
        void reapit(int h);

    }
}
class KK implements II.FF{

    @Override
    public void reapit(int h) {
        System.out.println(h*h);
    }
}
class MAIN{
    public static void main(String[] args) {
        II.FF ff  = new KK();
        ff.reapit(55);
    }
}

