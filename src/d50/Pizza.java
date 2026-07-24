package d50;

public class Pizza extends Food {
	
	public Pizza(String name, double price) {
		super(name, price);
		
	}

	@Override
	void prepare() {
		 System.out.println("Pizza sobada bişirilir.");
		}
}
