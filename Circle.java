package Shape;

public class Circle implements Shape{
    private final double PI = 3.14;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void test() {
        System.out.println("Circle");
    }

    public boolean setRadius(double radius) {
        if (radius < 0)
            return false;
        else {
            this.radius = radius;
            return true;
        }
    }

    public Circle() {
        System.out.println("");
    }

    public double round() {
        return 2 * PI * radius;
    }
    public double area() {
        return PI * radius * radius;
    }
}
