public class TijuanaPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
		return new ToastedDough();
	}

	public Sauce createSauce() {
        return new SpicySalsaSauce(); 
    }

	public Cheese createCheese() {
        return new OaxacaCheese(); 
    }

	public Veggies[] createVeggies() {
        Veggies veggies[] = { new Jalapenos(), new Cilantro(), new PurpleOnions() };
        return veggies;
    }

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
        return new FreshShrimp(); 
    }
    
}
