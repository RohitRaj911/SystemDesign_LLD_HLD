package Food;


import Billing.BaseRoom;

public class Milk extends Food{
    public Milk(BaseRoom room) {
        super(room);
    }
    @Override
    public int getCharges(){
        return room.getCharges()+30;
    }
}
