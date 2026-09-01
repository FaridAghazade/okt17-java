package ClassPractice;

public class Student extends Person {
	protected String name = "Vəli";

	@Override
	public void showInfo() {
	super.showInfo();
	System.out.println("Ad: "+ name);
	System.out.println("super Ad: "+ super.name);
	System.out.println("olke: "+ super.country);
	} 
	

	
}
