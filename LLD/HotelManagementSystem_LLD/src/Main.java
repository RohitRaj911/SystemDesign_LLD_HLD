package src;

import Billing.RoomServiceFactoryLayer;
import Billing.Rooms.BaseRoom;
import Billing.Rooms.StandardRoom;

//SERVICES ARE FOLLOWING DECORATOR+FACTORY PATTERN
//SERVICES INCLUDES ORDER FOOD ITEMS + CLEANING CLOTHES
public class Main {
    public static void main(String[] args) {
        // Create a basic room
        BaseRoom standardRoom = new StandardRoom();

        // Add service items dynamically
        standardRoom = RoomServiceFactoryLayer.provideService(standardRoom, "MILK",0);
        standardRoom = RoomServiceFactoryLayer.provideService(standardRoom, "PANEER",0);
        standardRoom = RoomServiceFactoryLayer.provideService(standardRoom, "CLEANING_CLOTHES", 5);
        
        // Get final charges
        System.out.println("Total charges: ₹" + standardRoom.getCharges());
    }
}

