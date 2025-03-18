package Services.PaymentService;

public class BillDecoratorFactory {
    public static BillComponent addAdOns(BillComponent billComponent, String addOn, int count){
        switch (addOn.toLowerCase()) {
            case "helmet":
                return new BillDecorator(billComponent, "Extra Helmet", 50.0, count);
            case "oil":
                return new BillDecorator(billComponent, "Extra Oil", 100.0,count);
            case "insurance":
                return new BillDecorator(billComponent, "Insurance", 200.0,count);
            default:
                throw new IllegalArgumentException("Invalid add-on: " + addOn);
        }
    }
}
