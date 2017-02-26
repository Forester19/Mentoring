package chapter08;

/**
 * Created by Владислав on 23.02.2017.
 */
class Figure{
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public double area(){
        System.out.println(" ");
       return 0;
    }
}

class Rectangle  extends Figure{

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("its retangle");
        return dim1*dim2;
    }
}

class Triangle extends Figure{

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("its triangle");
        return dim2*dim1/2;
    }
}

public class PolimDinMethods {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,2);
        Triangle triangle = new Triangle(2,3);
        Figure figure = new Figure(3,4);

        Figure f;

        f = rectangle;
        System.out.println(f.area());

        f = triangle;
        System.out.println(f.area());

        f = figure;
        System.out.println(f.area());

    }

}
