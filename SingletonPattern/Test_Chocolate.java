public class Test_Chocolate {
    public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        // WILL BE THE SAME OBJECT
        System.out.println(boiler);
        System.out.println(boiler2);
	}
}