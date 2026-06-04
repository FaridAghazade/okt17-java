package okt17Java;

public class d36 {
public void salam(String ad) {
	System.out.println("Salam, [%s]!".formatted(ad));
}

public void cem(int a,int b) {
	System.out.println("ededlerin  cemi : " + a+b);
	
}

public void daireSahesi(double radius) {
	System.out.println("ededin  radiusu : " + radius*radius*radius);
	
}

public void yasYoxla(int yas) {
	if (yas >= 0 & yas <= 12) {
		System.out.println("Usagdir");
	}
	else if(yas >= 13 & yas <= 17) {
		System.out.println("yeniyetmedir");
	}
	else if(yas >= 18 & yas <= 64) {
		System.out.println("boyukdur");
	}
	else if(yas > 65) {
		System.out.println("yaslidir");
	}
	else {
		System.out.println("lap goca");
	}
	
}

public void  telebeInfo(String ad, int yas, double qiymet, String sinif) {
	System.out.println("""
			           Ad: %s
			           Yas: %d
			           Qiymet: %f
			           Sinf: %s
			           """.formatted(ad,yas,qiymet,sinif));
	
}

public void enkicik(int a , int b) {
	System.out.println("ikisinene kicik eded  : " + Math.min(a, b));
	
}
public void enkicik3(int a , int b,int c) {
	int f = a;	
	if (f>b) {
		b = f;
		if (f > c) {
			c= f;
		}
	}
	System.out.println("ucunnen kicik eded  : "+  f);
}

public void qiymetHesabla(double qiymet, int say, double endirim) {
	int cem = (int) (qiymet * say);
	
	endirim = cem -  cem* endirim / 100;
	
	System.out.println("endirim = "+ endirim);
	
	
}
	
	
}


