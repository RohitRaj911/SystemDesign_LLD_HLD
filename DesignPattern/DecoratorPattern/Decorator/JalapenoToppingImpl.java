public class JalapenoToppingImpl extends ToppingsDecorator{
    BasePizza base;
    public JalapenoToppingImpl(BasePizza base){
        this.base = base;
    }

    @Override
    public int cost(){
        return base.cost()+50;
    }
}
