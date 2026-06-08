package carproject;

public class Models {
String brand;
int year;



public Models(String brand, int year) {
	
	this.brand = brand;
	this.year = year;
}



public void showcar() {
	System.out.println("Masin( "+ "model: " +  brand + ", " + "il: "+ year + ")");
}
}
