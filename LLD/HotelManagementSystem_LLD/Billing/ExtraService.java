package Billing;

import Billing.Rooms.BaseRoom;

public class ExtraService extends BaseRoom{
    protected final BaseRoom room;
    private final String serviceName;
    private final int cost;
    
    public ExtraService(BaseRoom room, String serviceName, int cost) {
        this.room = room;
        this.serviceName = serviceName;
        this.cost = cost;
    }
    public int getCharges(){
        return room.getCharges() + cost;
    }
    public String getServiceName(){
        return serviceName;
    }
}
