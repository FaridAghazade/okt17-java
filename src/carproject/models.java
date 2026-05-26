package carproject;

public class models {
String brand;
int year;



public models(String brand, int year) {
	
	this.brand = brand;
	this.year = year;
}



public void showcar() {
	System.out.println("Masin( "+ "model: " +  brand + ", " + "il: "+ year + ")");
}
}
