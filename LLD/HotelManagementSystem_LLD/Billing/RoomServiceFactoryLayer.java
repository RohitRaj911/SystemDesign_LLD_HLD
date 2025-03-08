package Billing;

import Billing.ClothesService.CleaningClothes;
import Billing.Food.Milk;
import Billing.Food.Paneer;
import Billing.Food.WaterBottle;
import Billing.Rooms.BaseRoom;

public abstract class RoomServiceFactoryLayer{

    public static BaseRoom provideService(BaseRoom room, String service, int quantity){
        switch (service.toUpperCase()) {
            case "MILK" :
                return new Milk(room);  
            case "PANEER" :
                return new Paneer(room);
            case "WATERBOTTLE" :
                return new WaterBottle(room);
            case "CLEANING_CLOTHES" :
                return new CleaningClothes(room, quantity);           
            default:
                throw new IllegalArgumentException("Service item not available: "+ service);
        }       
    }
}
