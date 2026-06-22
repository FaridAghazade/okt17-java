package d9;

public class D40 {
	String memberName;
	static double totalBankBalance;
	
	 
	public D40(String memberName) {
	this.memberName = memberName;
	}


	public void deposit(double amount) {
		totalBankBalance += amount;
		System.out.println("Ad: "+ memberName + " , "+ "hesaba: "+ amount + " AZN qoyuldu!!!");
	}
	
	static void showTotalBalance() {
		System.out.println("Bankin Hesabina umumi : "+ totalBankBalance + " qoyuldu");
		
	}
}
