public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        
        toppings.add("Mozzarella");
        toppings.add("Parmesan");
        toppings.add("Eggplant");
        toppings.add("Spinach");
        toppings.add("Black Olives");
    }
    
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
    
}
