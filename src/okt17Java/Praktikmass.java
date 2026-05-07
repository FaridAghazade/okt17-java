package okt17Java;


import java.util.Scanner;

public class Praktikmass {

	public static void main(String[] args) {
//		İstifadəçidən 5 ədəd tam ədəd daxil etməsini istəyən proqram yaz.
//		Daxil edilən ədədləri massivdə saxla və:
//		Bütün ədədlərin cəmini tap
//		Scanner s = new Scanner(System.in);
//		 int[] i6 = new int[4];
//		 int cem  = 0;
//	
//		int s5 = 1;
//     
//	         for (int a= 0;a<i6.length;a++) {
//	        	 
//	        	 System.out.println("%d inci ededi daxil edin".formatted(s5));
//	        	 int d =   i6[a] = s.nextInt();
//	        	  s5++;
//	        	  cem+=d;
//	        	 
//			}
//	      System.out.println("ededlerin cemi: "+cem);
//	      System.out.println("butun massiv:");
//	      for (int a= 0;a<i6.length;a++) {
//		      System.out.print(i6[a]+" "); 
//	      }     
	      
	    int[] in = {1,2,3,4,5} ;
	    int sum = 0;
	    for (int i : in) {
			sum+=i;
			
		}
	    double  g  = sum/in.length;
	    System.out.println("eded orta: " + g);
	     
	    
	}

}
