package chapter20;

/**
 * Created by Владислав on 19.03.2017.
 */
public class PrintfDemo {
    public static void main(String[] args) {
        System.out.printf("Разные целочисланые форматы");
        System.out.printf("%d %(d %+d %05d\n",3,-3,3,3);
        System.out.println();
        System.out.printf("ормат чисел с плавающей точкой " + "по умолчанию: %f/n", 1234567.123);
        System.out.printf("ормат чисел с плавающей точкой " + "через запятую: %,f/n", 1234567.123);
        System.out.printf("ормат чисел с плавающей точкой " + "отрецательные: %,f/n", -1234567.123);
        System.out.printf("ормат чисел с плавающей точкой " + "с плавающей точкой: %,(f/n", -1234567.123);
        System.out.println();
        System.out.printf("выравнивание положительных и " + "Отрицательных числовых значений:\n");
       // System.out.printf("% ,.2f\n% ,.2f\n");

    }
}
