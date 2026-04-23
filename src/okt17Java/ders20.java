package okt17Java;

public class ders20 {

	public static void main(String[] args) {
		
 String  mehsul = "alma";
 double qiymet =  1.50;
 int Miqdar = 3;
 double Cemi = Miqdar*qiymet;
 String  mehsul2 = "Çörək";
 double qiymet2 =  0.70;
 int Miqdar2 = 2;
 double Cemi2 = Miqdar2*qiymet2;         
 double umumi = Cemi + Cemi2;
 
 System.out.println("\"Market Check\"");
 System.out.println("-------------------------------");
 System.out.printf(" Mehsul:\"%s\"%n",mehsul);
 String s = " Qiymət: %.2f AZN".formatted(qiymet);
 System.out.println(s);
 System.out.printf(" Miqdar: %d%n",Miqdar);
 System.out.printf(" Cəmi: %.2f AZN%n",Cemi);
 System.out.println();
		  
 System.out.printf(" Mehsul:\"%s\"%n",mehsul2);
 String s2 = " Qiymət: %.2f AZN".formatted(qiymet2);
 System.out.println(s2);
 System.out.printf(" Miqdar: %d%n",Miqdar2);
 System.out.printf(" Cəmi: %.2f AZN%n",Cemi2);
 System.out.println("-------------------------------");
 System.out.printf(" Ümumi məbləğ: %.2f AZN%n",umumi);
		  
	}

}
