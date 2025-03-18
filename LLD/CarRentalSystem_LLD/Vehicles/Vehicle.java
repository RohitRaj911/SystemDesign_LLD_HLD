package Vehicles;

public abstract class Vehicle {
    int regId;
    String model;
    String company;
    int enginePower;
    int kmDriven;
    int mileage;
    VehicleType type;
    double ratePerDay;

    public Vehicle(int regId,String model, String company, int enginePower, int kmDriven, int mileage,VehicleType type, double ratePerDay){
        this.regId = regId;
        this.model=model;
        this.company=company;
        this.enginePower = enginePower;
        this.kmDriven=kmDriven;
        this.mileage = mileage;
        this.type = type;
        this.ratePerDay = ratePerDay;
    }
    
    public int getRegId() {
        return regId;
    }
    public String getModel() {
        return model;
    }
    public String getCompany() {
        return company;
    }
    public int getEnginePower() {
        return enginePower;
    }
    public int getKmDriven() {
        return kmDriven;
    }
    public int getMileage() {
        return mileage;
    }
    public VehicleType getVehicleType() {
        return type;
    }
    public double gerRatePerDay(){
        return ratePerDay;
    }
}
