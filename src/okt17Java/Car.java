package okt17Java;

public class Car {
  public String Brand;
 public String model;
  public int year;
 public Car(String brand, String model, int year) {

	Brand = brand;
	this.model = model;
	this.year = year;
 }
 
 public void showinfo() {
	 
 }

 @Override
 public String toString() {
	return " Brand=  %s %n model=  %s  %n year=  %d  %n".formatted(Brand,model,year);
 }

 
 
 
}
