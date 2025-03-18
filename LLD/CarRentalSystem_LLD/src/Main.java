package src;

import java.util.Arrays;
import java.util.List;

import Address.Address;
import FactoryDesign.VehicleFactory;
import MyCarRentalApp.CarRentalStores;
import MyCarRentalApp.CarRentalSystem;
import Services.PaymentService.Bill;
import Services.PaymentService.BillComponent;
import Services.PaymentService.BillDecoratorFactory;
import Services.SearchService.Filter;
import Vehicles.Vehicle;
import Vehicles.VehicleType;
import Services.CustomDate;

public class Main {
    public static void main(String[] args) {
        CarRentalSystem mySystem = new CarRentalSystem();

        //Creating new Store name ROYAL BROTHERS
        CarRentalStores royalBrothers = new CarRentalStores("S01","Royal Brother", new Address("xyz", "Bengaluru","Karnataka", 500037));

        //Creating second store named ROYAL BIKES
        CarRentalStores royalBikes = new CarRentalStores("S02","Royal Bikes", new Address("ABC", "Patna","Bihar", 800007));

        //Creating bikes
        Vehicle bike1 = VehicleFactory.createVehicle(1000001, "X440", "Harley Devidson", 440, 1004, 35, VehicleType.TWO_WHEELER, 1500.0);
        Vehicle bike2 = VehicleFactory.createVehicle(1000002, "CBR-350", "Hero", 350, 10004, 35, VehicleType.TWO_WHEELER,1300.0);
        Vehicle bike3 = VehicleFactory.createVehicle(5000001, "Splender", "Hero", 125, 10040, 95, VehicleType.TWO_WHEELER,1100.0);
        //creating car
        Vehicle car1 = VehicleFactory.createVehicle(1000005, "i20", "Hyundai", 800, 500, 20, VehicleType.FOUR_WHEELER,3000.0);
        royalBrothers.addVehicle(bike1);
        royalBrothers.addVehicle(bike2);
        royalBrothers.addVehicle(car1);
        royalBikes.addVehicle(bike3);

        mySystem.addStore(royalBrothers);
        mySystem.addStore(royalBikes);
        mySystem.listAllStores();

        royalBrothers.getVehicleList();
        System.out.println();
        //get list of vehicles by filter for two wheelers only
        Filter filter = new Filter( null,null, VehicleType.TWO_WHEELER);

        List<Vehicle>twoWheeler = royalBrothers.getVehicleByFilter(filter);
        for(Vehicle veh:twoWheeler){
            System.out.println("Vehicle Name : "+ veh.getModel() + " :: Company name : "+ veh.getCompany());
        }


        //getting total bill amount if user rented bike1 and bike2 from royal brothers with insurance
        List<Vehicle> rentedBikes = Arrays.asList(bike1, bike2);

        // get base amount first
        CustomDate startDate = new CustomDate(18,05,2025);
        BillComponent totalBill = new Bill( startDate,3, rentedBikes,royalBrothers);

        System.out.println();
        //now add extra services
        BillComponent finalBill = BillDecoratorFactory.addAdOns(totalBill, "helmet",2);

        // Print the Bill
        System.out.println("DESCRIPTION : ");
        System.out.println(finalBill.getDescription());
        System.out.println();
        System.out.println("Total Amount: ₹" + finalBill.calculateBill());
    }
}
