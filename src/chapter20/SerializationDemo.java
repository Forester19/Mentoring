package chapter20;

import java.io.*;

/**
 * Created by Владислав on 20.03.2017.
 */
public class SerializationDemo {
    public static void main(String[] args) {
try(ObjectOutputStream objOstr =
new ObjectOutputStream(new FileOutputStream("serial.txt"))) {

    MyClass obj1 = new MyClass("alo", 3,3);
    System.out.println(obj1);

objOstr.writeObject(obj1);

} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
try(ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial.txt"))) {
MyClass obj2 = (MyClass) objIStrm.readObject();
    System.out.println(obj2);
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
} catch (ClassNotFoundException e) {
    e.printStackTrace();
}

    }
}
class MyClass implements Serializable{
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}