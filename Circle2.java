package Shape;

public class Circle2 extends Circle{
    private int m;
    private int y;
    public void test() {
        System.out.println(m + "" + y);
    }

    public Circle2() {
        this(1, 'a');

    }
    public Circle2(char sha, int name) {
        this(1, 'a');
    }
    public Circle2(int name, char sha) {

    }

    public static void main(String[] args) {
        Circle2 circle2 = new Circle2();
        circle2.test();
    }
}
