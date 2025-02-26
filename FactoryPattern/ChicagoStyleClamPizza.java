public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Mozarella");
		toppings.add("Parmesan");
        toppings.add("Clams");
    }
    
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
    
}
