package okt17Java;

import java.util.Iterator;
import java.util.Scanner;

public class praktika {

	public static void main(String[] args) {

		Scanner fetch = new Scanner(System.in);
		System.out.println("eded daxil ed");

		int i = fetch.nextInt();

		if (i % 2 == 0) {
			System.out.println("eded cut dir");
		}
		System.out.println("3 eded daxil ed");
		String s2 = fetch.nextLine();
		int i2 = fetch.nextInt();
		fetch.nextLine();
		int i3 = fetch.nextInt();
		fetch.nextLine();
		int i4 = fetch.nextInt();

		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);

		Math.max(i2, i3);
		Math.max(i3, i4);
		Math.max(i2, i4);
		
		fetch.close();
	        
		

	}

}
