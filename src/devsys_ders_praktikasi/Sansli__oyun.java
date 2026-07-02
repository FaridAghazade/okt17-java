package devsys_ders_praktikasi;

import java.util.Random;
import java.util.Scanner;

public class Sansli__oyun {

	public static void main(String[] args) {
Random r = new Random();
int a = r.nextInt(1,4);

Scanner sc= new Scanner(System.in);
System.out.println("Salam , eded texminetmek oyununa xos gelmisiz , siteme ok daxil edin ve oyuna baslayag");
sc.next();
System.out.println("bir deyer texmin edin !!!");
  for(int i = 0;i<=5;i++) {
	 
	  int c = sc.nextInt();
	  if (c != a) {
		  System.out.println("sehv,yene bir deyer texmin edin!!");
	}
	  if (c >5) {
			 System.out.println("zehmet olmasa biraz daha kicik eded daxil edin!!!");
		}
	  if (c == a) {
		System.out.println("Təbriklər! Şanslı rəqəmi tapdınız!");
		return;
	}
	  if (i == 5) {
	
		System.out.println("Meqlub oldunuz!!!");
	}
  }
  
 
	}

}
