package Food;

import Billing.BaseRoom;

public class WaterBottle extends Food{
    public WaterBottle(BaseRoom room) {
        super(room);
    }
    @Override
    public int getCharges(){
        return room.getCharges()+20;
    }
}
