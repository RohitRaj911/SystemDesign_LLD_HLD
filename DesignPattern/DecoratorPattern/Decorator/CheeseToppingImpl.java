public class CheeseToppingImpl extends ToppingsDecorator{
    BasePizza base;
    public CheeseToppingImpl(BasePizza base){
        this.base = base;
    }
    
    @Override
    public int cost(){
        return base.cost()+50;
    }
}
