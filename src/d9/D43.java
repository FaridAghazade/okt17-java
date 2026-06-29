package d9;

import java.util.Scanner;

public class D43 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Məhsulun qiyməti:");
	 int qiy = 	scan.nextInt();
		System.out.println("Endirim faizi");
		double faiz = scan.nextDouble();
		
		System.out.println("Məhsulun qiyməti: " + Math.round(qiy));
		System.out.println("Endirim faizi: "+ Math.round(faiz));
		System.out.println();
		int umumi =  (int) (qiy - qiy*faiz/100);
		System.out.println("Endirim Mebleqi: ("+ qiy*faiz/100  + ")");
		System.out.println("Ödəniləcək məbləğ: (" + umumi+ ")");
		
		
		
		
		
	}




}
