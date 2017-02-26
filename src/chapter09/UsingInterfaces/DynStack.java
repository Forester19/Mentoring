package chapter09.UsingInterfaces;

/**
 * Created by Владислав on 23.02.2017.
 */
public class DynStack implements IntStack {
    private int stck[];
    private int tos;

    public DynStack(int size) {
        stck = new int[size];
        tos =-1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length-1){
            int newstck[] = new int[stck.length*2];
            for (int i =0; i<stck.length;i++){
                newstck[i] = stck[i];
            }
            newstck = stck;
          //  stck[++tos] = item;
        }else stck[++tos] = item;

    }

    @Override
    public int pop() {
     if (tos<0){ System.out.println("No stack");
     return 0;}
     else return stck[tos--];
    }

}
