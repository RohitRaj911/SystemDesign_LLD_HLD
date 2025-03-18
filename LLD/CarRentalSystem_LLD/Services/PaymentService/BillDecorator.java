package Services.PaymentService;

public class BillDecorator implements BillComponent{
    public BillComponent billComponent;
    String addOns;
    double addOnCost;
    int count;

    public BillDecorator(BillComponent billComponent, String addOns, double addOnCost, int count){
        this.billComponent = billComponent;
        this.addOns = addOns;
        this.addOnCost = addOnCost;
        this.count=count;
    }

    @Override
    public double calculateBill() {
        return billComponent.calculateBill() + addOnCost*count;
    }

    @Override
    public String getDescription() {
        return billComponent.getDescription() + "+ " + addOns + ": ₹" + addOnCost*count + "\n";
    }
    
}
