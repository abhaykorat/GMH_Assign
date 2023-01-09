package CoreJava;

public class RtTriangle extends Shape implements Resizeable{

    int height;
    int width;

    public RtTriangle(int height, int width) {
        super(3);
    }

    @Override
    public double getArea() {
        return (height*width)/2;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public void resize(double x) {

    }
}
