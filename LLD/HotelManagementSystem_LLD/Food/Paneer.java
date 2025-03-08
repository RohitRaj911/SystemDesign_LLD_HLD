package Food;

import Billing.BaseRoom;

public class Paneer extends Food{
    public Paneer(BaseRoom room) {
        super(room);
    }
    @Override
    public int getCharges(){
        return room.getCharges()+ 200;
    }
}
