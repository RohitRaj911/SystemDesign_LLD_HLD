package Services.PaymentService;

import java.util.List;

import MyCarRentalApp.CarRentalStores;
import Services.CustomDate;
import Vehicles.Vehicle;

public class Bill implements BillComponent{
    private CarRentalStores rentalStore;
    private List<Vehicle> rentedVehicles;
    CustomDate startDate;
    int durationInDays;
    //Payment payment;
    //Vehicle vehicleBill;

    public Bill(CustomDate startDate, int durationInDays, List<Vehicle> rentedVehicles,CarRentalStores store) {
        this.startDate = startDate;  // ✅ Fixed parameter assignment
        this.durationInDays = durationInDays;
        this.rentedVehicles = rentedVehicles;
        this.rentalStore = store;
    }

    @Override
    public double calculateBill(){ // pass vehicle object as parameter to decide the cost per day
        double totalCost = 0.0;
        for(Vehicle rented : rentedVehicles){
            totalCost += rented.gerRatePerDay()*durationInDays;
        }
        return totalCost;
    }

    @Override
    public String getDescription(){
        System.out.println("Booking is done at " +rentalStore.getName() +" on Date: "+ startDate.getDate());
        StringBuilder description = new StringBuilder("Total Prices are:\n");
        for (Vehicle v : rentedVehicles) {
            description.append("- ").append(v.getModel()).append(" (").append(v.getCompany()).append("): ₹")
                       .append(v.gerRatePerDay() * durationInDays).append("\n");
        }
        return description.toString();
    }

    public void intiatePayment(){}// change the status of payment

}
