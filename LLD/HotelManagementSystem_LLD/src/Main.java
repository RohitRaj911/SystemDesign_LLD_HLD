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
        standardRoom = RoomServiceFactoryLayer.addService(standardRoom, "MILK",1);
        standardRoom = RoomServiceFactoryLayer.addService(standardRoom, "PANEER",1);
        standardRoom = RoomServiceFactoryLayer.addService(standardRoom, "CLEANING_CLOTHES", 5);
        
        // Get final charges
        System.out.println("Total charges: ₹" + standardRoom.getCharges());
    }
}

