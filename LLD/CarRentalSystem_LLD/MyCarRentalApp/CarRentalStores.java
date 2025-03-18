package MyCarRentalApp;

import java.util.ArrayList;
import java.util.List;

import Address.Address;
import Services.SearchService.Filter;
import Services.SearchService.Search;
import Vehicles.Vehicle;

public class CarRentalStores {
    String storeId;
    String name;
    Address address;
    List<Vehicle> vehicleList;
    Search searchObj;
    //Bill billReceipt;

    public CarRentalStores(String storeId, String name, Address address){
        this.storeId=storeId;
        this.name=name;
        this.address=address;
        this.searchObj = new Search();
        this.vehicleList = new ArrayList<>();
    }

    public Address getAddress() {
        return address;
    }

    public String getStoreId() {
        return storeId;
    }


    public String getName() {
        return name;
    }


    //vehicles part need to added.
    public void addVehicle(Vehicle vehicleObj){
        vehicleList.add(vehicleObj);
    }

    public void removeVehicle(Vehicle vehicleObj){
        vehicleList.remove(vehicleObj);
    }

    public void getVehicleList(){
        for(Vehicle veh:vehicleList){
            System.out.println("Vehicle Name : "+ veh.getModel() + " :: Company name : "+ veh.getCompany());
        }
    }

    public List<Vehicle> getVehicleByFilter(Filter filter){
        return searchObj.getVehicles(filter);
    }
}
