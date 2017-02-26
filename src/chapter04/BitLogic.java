package chapter04;

/**
 * Created by Владислав on 20.02.2017.
 */
public class BitLogic {
    public static void main(String[] args) {
        String binary[]={
                "0000","0001","0010","0011","0100","0101","0110","0111",
                "1000","1001","1010","1011","1100","1101","1110","1111",
        };
        int a =3; // 0+2+1 == 0011
        int b =6; // 4+2+0 == 0110
        int c =a|b;
        int d =a&b;
        int e =a^b;
        int f =(~a&b) |(a& ~b );
        int g = ~a& 0x0f;

        System.out.println( " а = " + binary [ a ] ) ;
        System.out.println( " Ь = " + binary [ b ] ) ;
        System.out.println( " a l b " + binary [ c ] ) ;
        System.out.println( " а & Ь " + binary [ d ] ) ;
        System.out.println(" а ^ ь " + binary [ e ] ) ;
        System.out.println( " - a & b l a & -b = " + binary [ f ] ) ;
        System.out.println ( " - а = " + binary [ g ] ) ;
    }
}
