package ders8;

import java.util.Scanner;

public class tap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
      
		System.out.println("temperatur daxil edir");
		String st = s.nextLine();
		int i = s.nextInt();
		if (i > 30) {
			System.out.println("Hava istidir");
		} else if (i > 15 && i < 30) {

			System.out.println("hava mulayimdir");
		} else if (i < 15) {
			System.out.println("hava soyug dir");
		}
		String st3 = s.nextLine();
		System.out.println("balivi daxil ed!");

		String st2 = s.nextLine();

		int i2 = s.nextInt();

		if (i2 >= 90 && i2 <= 100) {
			System.out.println("ela");
		} else if (i2 >= 70 && i2 <= 89) {
			System.out.println("yaxsi");

		} else if (i2 >= 50 && i2 <= 69) {
			System.out.println("kafi");

		} else if (i2 >= 0 && i2 <= 49) {
			System.out.println("zeif");

		}

		s.close();

		// kecen dersin tapshirigi

		int i3 = 55;
		byte b = (byte) i3;
		short sh = 636;
		byte b2 = (byte) sh;
		long l = 458;
		short shor = (short) i3;
		long lon = 925236355;
		int lon2 = (int) lon;
		double d = 65787.3d;
		int in = (int) d;
		char c = 'q';
		int in09 = (int) c;
		int in1 = 266;
		char c2 = (char) in1;

	}

}
