package ClothesService;

import Billing.BaseRoom;
import Billing.ExtraService;

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
