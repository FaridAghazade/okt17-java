package d9;

public class d39tap {
	String ad;
	int yas;
	
void salam() {
	System.out.println("salam!");
}

void salam(String ad) {
	System.out.println("salam " + ad + " !");
}
void salam(String ad , String dil) {
	System.out.println("salam " + ad + " " + "dil" + " : " + dil ); 
}
	 int topla(int a, int b) {
		 int cem = a + b;
		 return cem;
	 }
	  int topla(int a, int b, int c) {
		  int cem = a + b + c;
		  return cem;
	  }
	  double topla(double a, double b) {
		  int cem = (int) (a + b);
		  return cem;
	  }
	  
	  int topla(int[] arr) {
		  int cem = 0;
		  for(int i = 0;i< arr.length;i++) {
			  cem += arr[i];
		  }
		  
		  return cem;
	  }
	  
	  void goster(int eded) {
		  System.out.println("tam eded: "+ eded);
	  }      
	  void goster(double eded) {
		  System.out.println("onluq eded: "+ eded);
	  }   
	  void goster(String metn) {
		  System.out.println("metn: "+ metn);
	  }  
	  void goster(boolean deger) {
		  System.out.println("boolean: "+ deger);  
	  }
	  
	  double sahe(double radius) {
		  return radius;
	  }         
	  double sahe(double en, double uzun)    {
		  double sahe = en*uzun;
		  return sahe;
	  } 
	  double sahe(double a, double b, double c) {
		  double sahe = a*b*c;
		  return sahe;
	  }
	  double ortalama(int a, int b) {
		  double ort = a + b/2;
		  return ort;
	  }
	  
	  double ortalama(int a, int b, int c) {
		  double ort = a + b+c/2;
		  return ort;
	  }
	  double ortalama(int[] arr) {
		  int cem = 0;
		  for(int i = 0;i< arr.length;i++) {
			  cem += arr[i];
		  }
		  
		  return cem/arr.length;

	  }
	  
	  d39tap(){
		  System.out.println("ad=\"Naməlum\", yas=0");
		  
	  }
	  d39tap(String ad){
		  this.ad = ad;
	  }
	  d39tap(String ad,int yas){
		  this.ad = ad;
		  this.yas = yas;
	  }
	  //Muellime tap6 mene tam aydin deyl tap 7 ni de
	  
}
	 
	  
	  


