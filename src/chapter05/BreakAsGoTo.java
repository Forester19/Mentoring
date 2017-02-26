package chapter05;

/**
 * Created by Владислав on 21.02.2017.
 */
public class BreakAsGoTo {
    public static void main(String[] args) {
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("hell");
                    if (t) break second;
                }
                System.out.println("a");
            }
            System.out.println("b");
        }
    }
}
