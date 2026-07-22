package d49;

public class CashPayment extends Payment{

	public CashPayment(double amount) {
		super(amount);
	}

	@Override
	void processPayment() {
		System.out.println("Nağd şəkildə ["+amount+" AZN] məbləğində ödəniş qəbul edildi");
	}
	
	

}
