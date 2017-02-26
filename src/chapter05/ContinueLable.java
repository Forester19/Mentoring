package chapter05;

/**
 * Created by Владислав on 21.02.2017.
 */
public class ContinueLable {
    public static void main(String[] args) {
        re: for (int i=0; i<10; i++){
            for (int j =0; j < 10; j++){

                if (j>i){
                    System.out.println();
                    continue re;}
                System.out.print(i*j);
            }
        }
        System.out.println();
    }
}
