package Shape;

public class Circle1 extends Circle{

    public Circle1() {

    }

    public void test() {
        super.test();
        System.out.println("Circle1");
    }

    public static void main(String args[]) {
        Integer integer = new Integer("2222");
        System.out.println(integer.intValue());
    }
}
