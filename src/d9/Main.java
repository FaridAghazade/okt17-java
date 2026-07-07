package d9;

public class Main {

	public static void main(String[] args) {
 Phone p = new Phone("Bmw","x7",2900);
 p.setQiymet(3000);
 p.melumatGoster();
 System.out.println();
 Book b = new Book();
 b.setBaslik("feridin seyaheti");
System.out.println("Baslik: "+  b.getBaslik());
 b.setMuellif("Ferid");
System.out.println("Muellif: " +  b.getMuellif());
 b.setSehifeSayi(212);
System.out.println("Sehifesayi: "+  b.getSehifeSayi());
 System.out.println();
 BankAccount ba = new BankAccount();
System.out.println("Balansa pul qoyulanlan sonra balans: "+  ba.deposit(34443));
System.out.println("Balansdan pul cixilanda sonra balans: "+   ba.withdraw(2000));
System.out.println();

User u = new User();
u.setParol("1234567");
System.out.print("parol: ");
u.getParol();

 
 



}

}
