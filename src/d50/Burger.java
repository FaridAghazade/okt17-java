package d50;

public class Burger extends Food {
	
	
	public Burger(String name, double price) {
		super(name, price);
		
	}

	@Override
	void prepare() {
		 System.out.println("Burger hazirlanir.");
		}
}
