package CoreJava;

abstract class Shape {

    int numSides;
    public abstract double getArea();
    public abstract double getPerimeter();

    public Shape(int numSides){
      this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }
}

