package CoreJava;

public class Circle extends Shape implements Resizeable{

    int radius;

    public Circle(int radius) {
        super(1);
        this.radius = radius;
    }

    @Override
    public void resize(double x) {
        this.radius *= x;
    }

    @Override
    public double getArea() {
        return (3.14 * Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}
