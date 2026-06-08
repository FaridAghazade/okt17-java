package okt17Java;

public class D37pr {

	 int maks(int a,int b) {
		 int max = Math.max(a, b);
		 return max;
	 }
	 int maks3(int a,int b,int c) {
		 int max3 = maks(maks(a,b),c);
		  return max3;
		 
	 }
	 
	 double endirimliQiymet(double qiymet, double faiz) {
		 return qiymet * faiz / 100;
	 }
    
 void cekYaz(String mehsul, double ilkinQiymet, double faiz) {
	 System.out.print("""
	 		            Mehsul: %s,
	 		            Qiymet: %.2f
	 		            Endirim: %.2f
	 		            """.formatted(mehsul,ilkinQiymet,faiz));
	 
	 System.out.println("yekun:  " + endirimliQiymet(1000,15));
 }
 
 int massivCemi(int[] arr) {
	 int sum = 0;
	 for(int i = 0;i < arr.length;i++) {
		sum += arr[i];
	 }
	 
	 return sum;
 }
 
 double massivOrtalama(int[] arr) {
	
	double i5 = massivCemi(arr);
	 int ortalama = (int) (i5/arr.length);
	 
	 return ortalama;
 }
 

}
