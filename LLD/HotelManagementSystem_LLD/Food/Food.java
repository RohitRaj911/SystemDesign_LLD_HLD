package Food;

import Billing.ExtraService;
import Billing.BaseRoom;

public abstract class Food extends ExtraService {  // Now properly calls superclass constructor

    public Food(BaseRoom room) {
        super(room);  // Call ExtraService constructor
    }

    @Override
    public abstract int getCharges();
}
