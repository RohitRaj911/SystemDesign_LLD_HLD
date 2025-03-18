package FactoryDesign;

import Vehicles.FourWheeler;
import Vehicles.TwoWheeler;
import Vehicles.Vehicle;
import Vehicles.VehicleType;

public class VehicleFactory {
    public static Vehicle createVehicle(int regId,String model, String company, int enginePower, int kmDriven, int mileage,VehicleType type, double ratePerDay){
        if(type == VehicleType.TWO_WHEELER){
            return new TwoWheeler(regId, model, company, enginePower, kmDriven, mileage, type, ratePerDay);
        }else if(type == VehicleType.FOUR_WHEELER){
            return new FourWheeler(regId, model, company, enginePower, kmDriven, mileage, type, ratePerDay);
        }
        throw new IllegalArgumentException("Invalid vehicle type");
    }
}
