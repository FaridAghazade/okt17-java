package d9;

import java.util.Scanner;

public class CircleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("radiusu daxil edin~!!");
		double radius = sc.nextDouble();
		System.out.println("elave bir Radius daxil edin!!!");

		double radius2 = sc.nextDouble();
		
		double radius3 = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Radius: " + Math.round(radius3) + ",(bu birincisinin yuvarlaglasdirilmis radius du!!!)");
		
		double radius4 = Math.PI * Math.pow(radius2, 2);
		
		System.out.println("Radius: " + Math.round(radius4) + ",(bu ikincisinin yuvarlaglasdirilmis radius du!!!)");
		
		double max = Math.max(radius3, radius4);
		double min = Math.min(radius3, radius4);
		System.out.println();
		System.out.println("iki Radius-lardan maximumu: " + Math.round(max));
		System.out.println();
		System.out.println("iki Radius-lardan minimumu: " + Math.round(min));
	}

}
