package chapter20;

import java.io.*;

/**
 * Created by Владислав on 19.03.2017.
 */
public class DataIoDemo {
    public static void main(String[] args) {
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("text.dat"))) {
        dout.writeDouble(98.4);
        dout.writeInt(1000);
        dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(DataInputStream diut = new DataInputStream(new FileInputStream("text.dat"))) {
          double d = diut.readDouble();
          int i = diut.readInt();
          boolean b = diut.readBoolean();
            System.out.println( d+ " " + i+ " " + b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
