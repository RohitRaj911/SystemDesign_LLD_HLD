package Billing.Food;

import Billing.Rooms.BaseRoom;

public class WaterBottle extends Food{
    public WaterBottle(BaseRoom room) {
        super(room);
    }
    @Override
    public int getCharges(){
        return room.getCharges()+20;
    }
}
