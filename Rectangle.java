package Shape;

public abstract class Rectangle implements Shape{
    private double length;
    private double wideth;

    public boolean setLength(double length) {
        Circle2 circle2 = new Circle2();
        if (length < 0)
            return false;
        else {
            this.length = length;
            return true;
        }
    }

    public boolean setWideth(double wideth) {
        if (wideth < 0)
            return false;
        else {
            this.wideth = wideth;
            return true;
        }
    }
    public abstract void test();
    @Override
    public double area() {
        return length * wideth;
    }

    @Override
    public double round() {
        return length + wideth;
    }
}
