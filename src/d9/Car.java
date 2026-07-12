package d9;

public class Car  extends Vehicle{
int doors;

public Car(String brand,int year,int doors) {
	super(brand, year);

	this.doors = doors;
}

public void showCarInfo() {
	System.out.println("qapi sayi: "+ doors);
}

@Override
public void start() {

	System.out.println("toyota car started");
}




}
