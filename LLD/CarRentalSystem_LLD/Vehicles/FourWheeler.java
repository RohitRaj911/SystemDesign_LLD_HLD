package Vehicles;

public class FourWheeler extends Vehicle{
    //constructor
    public FourWheeler(int regId,String model, String company, int enginePower, int kmDriven, int mileage,VehicleType type, double ratePerDay){
        super(regId, model, company, enginePower, kmDriven, mileage, type, ratePerDay);
    }
}