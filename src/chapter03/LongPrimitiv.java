package chapter03;

/**
 * Created by Владислав on 20.02.2017.
   Вычислить расстояние, проходимое светом.
 */

public class LongPrimitiv {
    public static void main(String[] args) {
         S();
    }
    public static void S(){
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 300000000;
        days = 1000;
        seconds = days*24*60*60;
        distance = lightspeed*seconds;
        System.out.println("ЗА "+ days);

        System.out.println(distance + "Km");
    }
}
