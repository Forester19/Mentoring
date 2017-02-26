package chapter09.UsingInterfaces;

/**
 * Created by Владислав on 23.02.2017.
 */
public class TestMain {
    public static void main(String[] args) {
        IntStack intStack;
        DynStack dynStack = new DynStack(3);
        FixedStack fixedStack = new FixedStack(6);

        intStack = dynStack;
        for (int i=0; i<12;i++)intStack.push(i);


        intStack = fixedStack;
        for (int i=0; i<8;i++)intStack.push(i);

        intStack = dynStack;
        for (int i=0; i<12; i++) System.out.println(intStack.pop());

        intStack = fixedStack;
        for (int i=0; i<8; i++) System.out.println(intStack.pop());

    }
}
