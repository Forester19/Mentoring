package Epam;

/**
 * Created by Владислав on 11.03.2017.
 */
public class Q6 {
    public static void main(String[] args) {
        String x = "hello";
        int y = 9;
      // y = y+x;
        System.out.println(x);
    }
}
class Holder{
    public int held;
    public void bump(Holder theHolder){
     theHolder.held++;
    }
}
