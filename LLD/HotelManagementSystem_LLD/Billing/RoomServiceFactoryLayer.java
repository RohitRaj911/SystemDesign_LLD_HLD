package Billing;

import java.util.HashMap;
import java.util.Map;

import Billing.Rooms.BaseRoom;

public class RoomServiceFactoryLayer{
    private static final Map<String, Integer> roomService = new HashMap<>();
    
    static {
        // Food services
        roomService.put("MILK", 30);
        roomService.put("PANEER", 200);
        roomService.put("WATERBOTTLE", 20);

        // Extra services
        roomService.put("CLEANING_CLOTHES", 50); // ₹50 per cloth
    }

    public static BaseRoom addService(BaseRoom room, String serviceType, int quantity) {
        serviceType = serviceType.toUpperCase(); // Ensure case-insensitivity
        
        if (!roomService.containsKey(serviceType)) {
            throw new IllegalArgumentException("Service not available: " + serviceType);
        }

        int totalCost = roomService.get(serviceType) * quantity; // Handle quantity-based services
        return new ExtraService(room, serviceType, totalCost);
    }
}
