package chapter09;

import java.util.Random;

/**
 * Created by Владислав on 24.02.2017.
 */
public interface VersInItherfaces {
    int NO =0;
    int YES =1;
    int MAYBE =2;
    int LATER =3;
    int SOON =4;
    int NEVER =5;
}
class Question implements VersInItherfaces{

    Random random = new Random();
    int ask(){
        int prob = (int) (100*random.nextDouble());
        if (prob<30)
            return NO;
        else if (prob<60)
            return YES;

        else if (prob<75)
            return LATER;

        else if (prob<98)
            return SOON;

        else
            return NEVER;
    }
}
class AskMe implements VersInItherfaces{
    static  void  answer(int result){
        switch (result){
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case LATER:
                System.out.println("LATER");
           break;
            case SOON:
                System.out.println("SOON");
            break;
                case NEVER:
                System.out.println("NEVER");
break;

        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}