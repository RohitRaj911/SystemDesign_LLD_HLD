package Billing.Food;


import Billing.Rooms.BaseRoom;

public class Milk extends Food{
    public Milk(BaseRoom room) {
        super(room);
    }
    @Override
    public int getCharges(){
        return room.getCharges()+30;
    }
}
