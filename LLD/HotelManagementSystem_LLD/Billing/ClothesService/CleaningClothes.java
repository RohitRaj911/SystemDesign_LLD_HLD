package Billing.ClothesService;

import Billing.ExtraService;
import Billing.Rooms.BaseRoom;

public class CleaningClothes extends ExtraService{
    int clothesCount;
    public CleaningClothes(BaseRoom room, int clothes){
        super(room);
        this.clothesCount = clothes;
    }
    public int getCharges(){
        return room.getCharges()+(clothesCount*50);
    }
}
