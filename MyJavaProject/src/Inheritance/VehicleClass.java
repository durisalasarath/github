package Inheritance;

public class VehicleClass {

    public String vehicleName;
    public int noOfTyres;

    public void soundHorn() {
        System.out.println("Sounding Horn Pom");
    }

    public VehicleClass(String vehicleName, int noOfTyres) {
        this.vehicleName = vehicleName;
        this.noOfTyres = noOfTyres;
    }
}