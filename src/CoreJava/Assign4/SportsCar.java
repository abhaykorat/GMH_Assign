package CoreJava.Assign4;

public class Mustang extends Car{

    boolean heatedSeats = true;

    public Mustang() {
        super("FordMustang", 2, "V6");
    }

    public int fuelTankCapacity(){
        return 40;
    }



    public int maxSpeed(){
        return 200;
    }


}
