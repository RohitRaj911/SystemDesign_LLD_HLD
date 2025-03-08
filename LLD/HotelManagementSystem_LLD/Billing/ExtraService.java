package Billing;

public abstract class ExtraService extends BaseRoom{
    protected BaseRoom room;
    public ExtraService(BaseRoom room){
        this.room = room;
    }
    public abstract int getCharges();
}
