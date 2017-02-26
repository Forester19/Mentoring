package chapter07;

/**
 * Created by Владислав on 21.02.2017.
 */
public class TestEquals {
    private int a;
    private int b;

    public TestEquals(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestEquals that = (TestEquals) o;

        if (a != that.a) return false;
        return b == that.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }
}
class Test{
    public static void main(String[] args) {
        TestEquals testEquals = new TestEquals(1,2);
        TestEquals testEquals2 = new TestEquals(1,2);
        TestEquals testEquals3 = new TestEquals(-1,-1);

        System.out.println(testEquals.equals(testEquals2));
        System.out.println(testEquals.equals(testEquals3));

    }
}
