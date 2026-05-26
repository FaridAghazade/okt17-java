package carproject;

public class drivers {
String name;
int experienceyear;



public drivers(String name, int experienceyear) {
	super();
	this.name = name;
	this.experienceyear = experienceyear;
}
public void showdriver() {
	System.out.println("Surucu: ( "+ "ad: " +  name + ", " + "tecrubeili: "+ experienceyear + ")" );
}
}
