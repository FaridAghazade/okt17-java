package d49;

public class Main {

	public static void main(String[] args) {
		CreditCardPayment c = new CreditCardPayment(200);
		c.processPayment();
		CashPayment c2 = new CashPayment(150);
		c2.processPayment();
	}

}
