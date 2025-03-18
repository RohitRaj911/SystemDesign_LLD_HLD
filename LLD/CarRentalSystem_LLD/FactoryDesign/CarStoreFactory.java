package FactoryDesign;

import Address.Address;
import MyCarRentalApp.CarRentalStores;

public class CarStoreFactory {
    public static CarRentalStores createStores(String storeId, String name, Address address){
        return new CarRentalStores(storeId, name, address);
    }
}
