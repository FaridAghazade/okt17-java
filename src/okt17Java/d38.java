package okt17Java;

public class d38 {
public static void main(String[] args) {
	D37pr i = new D37pr();
	System.out.println("Ededlerin maximumu: "+i.maks3(45,66,98));
	i.cekYaz("iphone", 1000, 15);
	System.out.println();
	int[] arr = {1,2,3,4,5};
	
	System.out.println("Massivin cemi: "+ i.massivCemi(arr));
	
	System.out.println("massivin ortalamasi: " + i.massivOrtalama(arr));
}
}
