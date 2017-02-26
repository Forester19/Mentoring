package chapter06.StackExample;

/**
 * Created by Владислав on 21.02.2017.
 */
public class TestStack {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i=0; i<10; i++) stack1.push(i);
        for (int i=10; i<20; i++) stack2.push(i);

        System.out.println("first array");
        stack1.poll();
        System.out.println("second array");
        stack2.poll();
    }
}
