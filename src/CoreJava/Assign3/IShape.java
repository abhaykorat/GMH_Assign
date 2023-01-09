package CoreJava;

public class IShape {

    public static void main(String args[]){
        Rectangle rect = new Rectangle(2, 3);
        System.out.println("Rectangle Area :" +rect.getArea());
        System.out.println("Rectangle Permieter :" +rect.getPerimeter());
        rect.resize(2);
        System.out.println("Rectangle Area :" +rect.getArea());
        System.out.println("Rectangle Permieter :" +rect.getPerimeter());

        Circle circle = new Circle(5);
        System.out.println("Circle Area :" +circle.getArea());
        System.out.println("Circle Permieter :" +circle.getPerimeter());
        circle.resize(2);
        System.out.println("Circle Area :" +circle.getArea());
        System.out.println("Circle Permieter :" +circle.getPerimeter());

    }

}
