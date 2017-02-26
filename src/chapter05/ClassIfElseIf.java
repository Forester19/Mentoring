package chapter05;

/**
 * Created by Владислав on 20.02.2017.
 */
public class ClassIfElseIf {
    public static void main(String[] args) {
        int month = 4;
        String season = null;   // Mistake in the book;
        if (month ==12 || month == 1 || month == 2){
            season = "winter";
        }else if (month == 3 || month == 4 || month == 5){
            season ="spring";
        }else if (month == 6|| month== 7|| month == 8){
            season ="summer";

        }else if (month == 9||month ==10|| month ==11){
            season = "autumn";
        }
        System.out.println(season);


    }
}
