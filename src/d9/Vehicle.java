package d9;

public class Vehicle {
String brand;
int year;


public Vehicle(String brand, int year) {
	super();
	this.brand = brand;
	this.year = year;
}


public void showInfo() {
	System.out.println("marka( " + brand + " ),");
	System.out.println("il( " + year + " ),");
}

public void start() {
System.out.println("car started");
}





}
