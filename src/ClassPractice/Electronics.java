package ClassPractice;

public class Electronics extends Product {

	public Electronics(double price) {
		super(price);
		
		
	}

	@Override
	public double getDiscountedPrice() {
		double d =  price * 10 / 100;
		double son = price - d;
		return son;
	}
	
	

}
