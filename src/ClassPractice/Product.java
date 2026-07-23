package ClassPractice;

public class Product {
	double price;
	
	public Product(double price) {
		this.price = price;
	}

	double getDiscountedPrice() {
		double d =  price * 5 / 100;
		double son = price - d;
		return son;
	};
}
