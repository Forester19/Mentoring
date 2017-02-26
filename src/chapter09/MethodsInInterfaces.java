package chapter09;

/**
 * Created by Владислав on 24.02.2017.
 */
interface MyIF{
int getNumber();
default String getString(){
    return "objects";
}
}

public class MethodsInInterfaces implements MyIF{
    @Override
    public int getNumber() {
        return 110;
    }
}
class Main{
    public static void main(String[] args) {
        MethodsInInterfaces methodsInInterfaces = new MethodsInInterfaces();
        System.out.println(methodsInInterfaces.getNumber());
        System.out.println(methodsInInterfaces.getString());
    }
}
