package MyCarRentalApp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Services.SearchService.Search;

public class CarRentalSystem{
    private Map<String, CarRentalStores> storeMap = new HashMap<>();
    private Search searchObj;

    public CarRentalSystem() {
        this.searchObj = new Search(); // Initialize Search
    }

    public void addStore(CarRentalStores store) {
        storeMap.put(store.getStoreId(), store);
    }

    public CarRentalStores getStore(String storeId) {
        return storeMap.get(storeId);
    }

    public void listAllStores() {
        for (CarRentalStores store : storeMap.values()) {
            System.out.println("Name of the store : "+store.getName());
        }
    }

    public List<CarRentalStores> getStoresListByCity(String city){
        return searchObj.getStoresByCity(storeMap, city);
    }
}