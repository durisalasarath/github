package Inheritance;
public class MainClass {

    public static void main(String[] args) {
        VehicleClass v1 = new VehicleClass("Lorry", 8);
        v1.soundHorn();

        CarClass c1 = new CarClass("Benz", 4);
        c1.soundHorn();

        // Child class inheriting all the parent class's
        // attributes and methods is called Inheritance
    }
}