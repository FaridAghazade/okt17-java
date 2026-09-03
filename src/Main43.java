
public class Main43 {
public static void main(String[] args) {
	OnlinePayment o = new OnlinePayment();
	o.pay();
	CardPayment c = new CardPayment();
	c.pay();
	CashPayment cash = new CashPayment();
	cash.pay();
	PayPalPayment p = new PayPalPayment();
	p.pay("PayPal");
}
}
