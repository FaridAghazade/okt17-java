package ClassPractice;

public class Clothing extends Product{
	public Clothing(double price) {
		super(price);
	}

	@Override
	public double getDiscountedPrice() {
		double d =  price * 20 / 100;
		double son = price - d;
		return son;
	}
}
