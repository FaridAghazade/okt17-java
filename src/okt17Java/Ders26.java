package okt17Java;

public class Ders26 {
	public static void main(String[] args) {
		System.out.println("butun elemntler:");
		int[] grades = { 8, 10, 6, 9, 7, 10 };
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("massivin uzunlugu: " + grades.length);

		System.out.println();

		System.out.print("maksimum : ");
		int b = grades[0];
		for (int i = 0; i < grades.length; i++) {
			if (b < grades[i]) {
				b = grades[i];
			}
		}
		System.out.println(b);
		int a = grades[0];
		for (int i = 0; i < grades.length; i++) {
			if (a > grades[i]) {
				a = grades[i];
			}
		}
		System.out.println("minimum: " + a);
		int d = 0;
		for (int i = 0; i < grades.length; i++) {
			d += grades[i];
		}

		System.out.println("cem: " + d);
		int d2 = 0;
		for (int i = 0; i < grades.length; i++) {
			d2 += grades[i];
		}

		double c4 = d2 / grades.length;

		System.out.println("Orta: " + c4);

		System.out.println();
		int[] grades2 = { 8, 10, 6, 9, 7, 10, 5 };
		System.out.print("10 alanlar: ");
		int on = 0;
		for (int i = 0; i < grades2.length; i++) {

			if (grades2[i] == 10) {
				on += 1;
			}

		}
		System.out.println(on + " ");
		System.out.print("7-den asagi: ");
		int yet = 0;
		for (int i = 0; i < grades2.length; i++) {

			if (grades2[i] < 7) {
				yet += 1;
			}

		}
		System.out.print(yet + " ");
		System.out.println();
		System.out.print("yeni massiv: ");
		for (int i = 0; i < grades2.length; i++) {
			System.out.print(grades2[i] + " ");

		}
	}
}
