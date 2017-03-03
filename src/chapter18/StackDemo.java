package chapter18;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Владислав on 03.03.2017.
 */
public class StackDemo {
    static void showpush(Stack<Integer> st, int a){
        st.push(a);
        System.out.println("push: " + a);
        System.out.println("Stack: " + st);
    }
    static void showpop(Stack<Integer> st){
        System.out.print("pop ->");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("stack: " +st);
        showpush(st, 42);
        showpush(st, 43);
        showpush(st, 44);
        showpop(st);
        showpop(st);
        showpop(st);
        try{
            showpop(st);
        }catch (EmptyStackException e){
            System.out.println("Empty stack");
        }
    }
}
