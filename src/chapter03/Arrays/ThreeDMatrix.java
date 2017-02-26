package chapter03.Arrays;

/**
 * Created by Владислав on 20.02.2017.
 */
public class ThreeDMatrix {
    public static void main(String[] args) {
        int three[][][] = new int [3][4][5];
        int i,j,k;
        for (i =0;i<3;i++){
            for (j=0;j<4;j++){
                for (k=0;k<5;k++){
                    three[i][j][k] = i*j*k;
                }
            }
        }
        for (i =0;i<3;i++){
            for (j=0;j<4;j++){
                for (k=0;k<5;k++){
                    System.out.print(three[i][j][k]+"");
                    System.out.println();
                }
                System.out.println();
            }
        }

    }
}
