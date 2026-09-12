package d44;

public class BankAccount {
public static void main(String[] args) {
	BankAccount b = new BankAccount(120);
	try {
		
		b.withdraw(70);
		b.withdraw(-70);
	} catch (IllegalArgumentException e) {
		System.out.println(e.getMessage());
		}
	try {
		b.withdraw(130);
	} catch (IllegalArgumentException e) {
		System.out.println(e.getMessage());
		}
	
}
double balans;
public BankAccount(double balans) {
	
	this.balans = balans;
}

public void withdraw(double amount) throws IllegalArgumentException {
	if ( amount < 0) {
		
		System.out.println("musbet eded daxil edin");
	}
		else if (amount>balans) {
	throw new  IllegalArgumentException("zehmet olmasa balans dan daha kicik bir miqdarda pul cixin!!!");

}
	
	else {
		double qalanpul = balans-amount;
		System.out.println("balansda bu geder pul galib: "+ qalanpul);
	}
	
 }
}


