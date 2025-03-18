package Services.SearchService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import MyCarRentalApp.CarRentalStores;
import Vehicles.TwoWheeler;
import Vehicles.Vehicle;
import Vehicles.VehicleType;

public class Search {
    public List<CarRentalStores> getStoresByCity(Map<String, CarRentalStores> stores, String city){
        List<CarRentalStores> storesList=new ArrayList<>();
        // 🔹 Using enhanced for-loop (equivalent to for(auto it: store) in C++)
        for (CarRentalStores it : stores.values()) {
            // Check if store's city matches the given city
            if (it.getAddress().getCity().equalsIgnoreCase(city)) {
                storesList.add(it);
            }
        }
        return storesList;
    }

    public List<Vehicle> getVehicles(Filter filter) {
        List<Vehicle> listVehicles = new ArrayList<>();
        
        if (filter == null) {
            return listVehicles;
        }
        
        if (filter.model != null) {
            listVehicles = getVehiclesListByModal(filter.model);
        } else if (filter.companyName != null) {
            listVehicles = getVehiclesListByCompanyName(filter.companyName);
        }else if (filter.getType() == VehicleType.TWO_WHEELER) {
            listVehicles.addAll(getAllTwoWheelerList(filter));
        }else if (filter.getType() == VehicleType.FOUR_WHEELER) {
            listVehicles.addAll(getAllFourWheelerList(filter));
        }
        
        return listVehicles;
    }

    private List<Vehicle> getVehiclesListByModal(String modalName) {
        // Implementation here
        return new ArrayList<>();
    }

    private List<Vehicle> getVehiclesListByCompanyName(String companyName) {
        // Implementation here
        return new ArrayList<>();
    }

    private List<Vehicle> getAllTwoWheelerList(Filter filter) {
        List<Vehicle> result = new ArrayList<>();
    
        if (filter.getType() == VehicleType.TWO_WHEELER) {
            // 🔹 Fetch two-wheeler vehicles (Replace this with actual vehicle list)
            System.out.println("Giving a sample list of two wheeler only wothout any logic...");
            result.add(new TwoWheeler(1001, "CBR500", "Honda", 500, 10000, 35, VehicleType.TWO_WHEELER, 1300.0));
            result.add(new TwoWheeler(1002, "Duke 390", "KTM", 390, 12000, 30, VehicleType.TWO_WHEELER, 1500.0));
        }
        return result;
    }
private List<Vehicle> getAllFourWheelerList(Filter filter) {
    if (filter.getType() == VehicleType.FOUR_WHEELER) {
        // 🔹 Fetch four-wheeler vehicles (Replace with actual logic)
        return null;
    }
    return new ArrayList<>();
    }
}

