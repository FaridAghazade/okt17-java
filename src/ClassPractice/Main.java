package ClassPractice;



public class Main {
public static void main(String[] args) {
	
	Product p = new Product(500);
	System.out.println("Productlara 5% endirimden sonra qiymet : " + p.getDiscountedPrice());
	

	Electronics e = new Electronics(2000);
	System.out.println("Elektronikere 20% endirimden sonra qiymet: " + e.getDiscountedPrice());
	Clothing c = new Clothing(1000);
	System.out.println("paltarlara 10% endirimden sonra qiymet: " + c.getDiscountedPrice());
}
}
