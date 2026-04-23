package okt17Java;

import java.util.Iterator;
import java.util.Scanner;



//import scanneded2;

public class primitiveTypeConversation {

	public static void main(String[] args) {
		short s = 69;
		byte b = (byte) s;
		short num = 589;
		byte allbyte = (byte) num;
		long l = 458;
		int longdeyer = (int) l;
		long uzun = 525236354;
		int uzunint = (int) uzun;
		double d = 5632.6d;
		char c = 'D';
		int charint = (int) c;
		int i = 123;
		int ichar = (char) i;
		System.out.println(allbyte);
		System.out.println(longdeyer);
		System.out.println(uzunint);
		System.out.println(d);
		System.out.println(charint);
		System.out.println(ichar);
		System.out.println(b);

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		Scanner scann = new Scanner(System.in);
		System.out.println("eded daxil ed");
		String scanneded = scann.next();
		Scanner scann2 = new Scanner(System.in);
		System.out.println(" 2kinci ededi daxil ed");
		String scanneded2 = scann.next();

		System.out.println((parseInt(scanneded)) + parseInt(scanneded2));
		int a = 12;// 001100
		a ^= 34;// 100010
		// 101110
		System.out.println(a);

	}

	private static String parseInt(String scanneded) {
	
		return null;
	}

}
