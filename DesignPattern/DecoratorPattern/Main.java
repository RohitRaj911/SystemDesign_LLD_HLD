public class Main {
    public static void main(String[] args) {
        BasePizza baseObj = new PaneerPizza();
        BasePizza cheeseTopping = new CheeseToppingImpl(baseObj);

        //paneer pizza + cheese
        System.out.println("Total Price: "+ cheeseTopping.cost());

        // panner pizza + cheese + jalapeno
        BasePizza JalapenoTopping = new JalapenoToppingImpl(cheeseTopping);
        System.out.println("Total Price: "+ JalapenoTopping.cost());

    }
}
