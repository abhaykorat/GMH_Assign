package CoreJava;

public class Rectangle extends Shape implements Resizeable {

    int height;
    int width;

    public Rectangle(int height, int width) {
        super(4);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public void resize(double x) {
        this.height *= x;
        this.width *= x;
    }
}
