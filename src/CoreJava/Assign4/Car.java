package CoreJava;

public class Car {
    String name;
    String engine;
    int doors;

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    final int wheels = 4;
    String color;
    boolean sunroof;

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public Car(String name, int doors, String engine){
        this.name = name;
        this.doors = doors;
        this.engine = engine;
    }

    public void startEngine(){
        System.out.println("Engine Started");
    }

    public void accelerate(){
        System.out.println("Car accelerated");
    }

    public void brake(){
        System.out.println("Brake applied");
    }

    public void horn(){
        System.out.println("Horn Pressed");
    }




}
