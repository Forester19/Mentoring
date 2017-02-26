package chapter06.StackExample;

/**
 * Created by Владислав on 21.02.2017.
 */
public class Stack {
    int stck[] = new int[10];
    int tos;

    public Stack() {
        tos = 0;
    }
    void push(int in){
        if (tos >= 10) {
            System.out.print("full stack");
        }
        else stck[tos++] = in;
    }
    int g =0;
    int poll(){
        if (tos < 0) {
            System.out.println("No loaded stack");
        return 0;
        }
        else{
            for (int j : stck)
                System.out.println(j);
        }
    return 0;
    }
}
//0674059067