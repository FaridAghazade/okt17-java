package okt17Java;

public class Recclass {
	public static void main(String[] args) {
		 Kitab b = new Kitab("Java eserleri","Ferid",120);
               System.out.println("bashlig: " + b.bashlig());
               System.out.println("muellif: " + b.muellif());
               System.out.println("sehife sayi: " + b.sehife());
               System.out.println("kitab sehifesi 200 den cox du : " + b.uzun());
               
	}

}
