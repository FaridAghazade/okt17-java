package d49;

public class CreditCardPayment extends Payment{

	public CreditCardPayment(double amount) {
		super(amount);
	}

	@Override
	void processPayment() {
		System.out.println("kartı ilə ["+ amount + " AZN] məbləğində ödəniş uğurla keçdi");
	}

}
