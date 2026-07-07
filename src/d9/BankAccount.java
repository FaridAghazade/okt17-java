package d9;

public class BankAccount {
	private double balans;
	
	
	public double deposit( double pul) {
		if (pul < 0) {
			System.out.println("Yanlış pul!");
		}
		else {
			this.balans += pul;
			
		}
		return balans;
		}
		
		public double withdraw( double pul) {
			if (pul > 0 & pul < balans) {
				this.balans -= pul;
				
			}
			else {
				System.out.println("Balansdan pul cixila bilmedi!!!");
			}
			
			return balans;
		
	}
}
