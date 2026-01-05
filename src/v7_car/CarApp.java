package v7_car;
// deklarirame klasata CarApp
public class CarApp {

	// deklarirame glavniot metod
	public static void main(String[] args) {
		// inicializirame objektot c1 so default constructor
		Car c1 = new Car();
		Car c2 = new Car("BMW", "M5", 2016);
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
