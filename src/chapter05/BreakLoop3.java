package chapter05;

/**
 * Created by Владислав on 21.02.2017.
 */
public class BreakLoop3 {
    public static void main(String[] args) {
        out:{
            for (int i=1; i<3; i++){
                System.out.print("Enter:  " + i + "         ");
                for (int j =0; j<100; j++){
                    if (j==10) break out;
                    System.out.print(j + " ");
                }
                System.out.println("no writing");
            }
        }
        System.out.println("end of loop");
    }
}
