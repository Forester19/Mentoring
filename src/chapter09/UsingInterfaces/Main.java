package chapter09.UsingInterfaces;

/**
 * Created by Владислав on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        FixedStack fixedStack1 = new FixedStack(5);
        FixedStack fixedStack2 = new FixedStack(6);

        for (int i =0; i<5; i++) fixedStack1.push(i);
        for (int i =0; i<6; i++) fixedStack2.push(i);

        for (int i =0; i<5;i++) System.out.println(fixedStack1.pop());
        for (int i =0; i<6;i++) System.out.println(fixedStack2.pop());

        DynStack dynStack1 = new DynStack(6);
        DynStack dynStack2 = new DynStack(5);

        for (int i =0; i<10; i++) dynStack1.push(i);
        for (int i =0; i<20; i++) dynStack2.push(i);

        for (int i =0; i<10;i++) System.out.println(dynStack1.pop());
        for (int i =0; i<20;i++) System.out.println(dynStack2.pop());

    }
}
