package v7_car;

public class Car {
	String make;
	String model;
	int year;
	
	Car() {
		this.make = "Unknown";
		this.model = "Unknown";
		this.year = 2023;
	}
	
	Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String toString() {
		return (make + " " + model + " " + year);
	}
}
