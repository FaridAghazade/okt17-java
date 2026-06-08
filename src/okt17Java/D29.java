package okt17Java;

import java.util.Arrays;
import java.util.Scanner;

public class D29 {

	public static void main(String[] args) {
		int[] grades = { 78, 45, 90, 62, 55, 100, 81 };

		Arrays.sort(grades);
		System.out.println(Arrays.toString(grades));

		System.out.println("sort olunmus massivde indexi: " + Arrays.binarySearch(grades, 78));

		int[] f = Arrays.copyOf(grades, grades.length - 1);
		Arrays.fill(f, 78);
		System.out.println(Arrays.toString(f));
		System.out.println("BERABER DILER ? :" + Arrays.equals(f, grades));

		int[] g = new int[8];
		Arrays.fill(g, 50);
		Arrays.fill(g, 1, 5, 100);
		System.out.println(Arrays.toString(g));
		int elli = 0;
		int yuz = 0;
		int sum = 0;
		for (int i = 0; i < g.length; i++) {
			sum += g[i];
			if (g[i] == 50) {
				elli++;
			} else {
				yuz++;
			}
		}
		double ortalama = sum/g.length;
         System.out.println("yuzlerin sayi = "+ yuz);
         System.out.println("elli nin sayi = "+ elli);
         System.out.println("umumi hamisinin ortalama qiymet: "+ ortalama);
	}

}
