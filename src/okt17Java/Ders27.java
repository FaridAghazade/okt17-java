package okt17Java;

import java.util.Scanner;

public class Ders27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 1;
		int d = 0;
		int[][] n = {{0,0},{0,0}};
		for(int i2  = 0;i2<n[0].length;i2++) {
			System.out.println("%dci eded daxil edin".formatted(i));
			n[0][i2]  =   s.nextInt() ;
			i++;
		  d +=  n[0][i2];
		}
		int a = 3;
		for(int i2  = 0;i2<n[1].length;i2++) {
			System.out.println("%dci eded daxil edin".formatted(a));
			n[1][i2]  =   s.nextInt() ;
			a++;
			 d +=	n[1][i2] ;
		}
	
		 System.out.println("butun massiv : {{%d,%d},{%d,%d}}".formatted(n[0][0],n[0][1],n[1][0],n[1][1]));
		 
		 System.out.println("Massivdeki ededlerin cemi:"+ d);
		 int a10 = n[0][0];
		 for (int i6 = 0;i6<n.length;i6++) {
			if (a10<n[0][i6]) {
				a10 = n[0][i6];
			}
		 }
		
		 for (int i6 = 0;i6<n.length;i6++) {
				if (a10<n[01][i6]) {
					a10 = n[1][i6];
				}
			 }
		
		 System.out.println("maksimum: "+ a10);
		
	}

}
