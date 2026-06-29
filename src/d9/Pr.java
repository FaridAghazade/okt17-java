package d9;

public class Pr {
String owner;
double balance;
static double inetrestRate = 5.0;


public Pr(String owner, int balance) {
	this.owner = owner;
	this.balance = balance;
}

public  double applyInterest() {
	balance =  (balance + (balance * inetrestRate / 100));
	return balance;
	
}

public void displayAccount() {
	System.out.println(owner + ":"+ balance);
	System.out.print("Faiz derecesi deyisdirildikden sonra : ");
	System.out.println(owner + ":"+ Pr.this.applyInterest());
	System.out.println();
}





   
}
