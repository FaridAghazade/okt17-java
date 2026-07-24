package d50;

public class Salad extends Food {

	public Salad(String name, double price) {
		super(name, price);
	}
	@Override
	void prepare() {
	 System.out.println("Salat qarışdırılır.");
	}

}
