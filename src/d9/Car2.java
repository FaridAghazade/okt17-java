package d9;

public class Car2  extends Vehicle2{
	int doors;
	
	public Car2(int doors) {
		super("Bmw",20000);
		this.doors = doors;
	}

	public void honk(){
	System.out.println("Beep Beep");
	}
}
