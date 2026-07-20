package composition_aggregation;

public class Phone {
String model;
double price;
Battery battery;


public Phone(String model, double price,String brand,int capacity) {
	this.model = model;
	this.price = price;
	this.battery = new Battery(brand,capacity);
}

public void showInfo() {
	System.out.println("Model: ("+model+" , "+ battery.brand + " )" );
	System.out.println("Qiymet: ("+price+" AZN )");
	System.out.println("Battery: ("+model+" , "+ battery.capacity + " mAh )" );
}


}
