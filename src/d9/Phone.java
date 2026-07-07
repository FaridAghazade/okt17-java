package d9;

public class Phone {
private String marka;
private String model;
private double qiymet;


public Phone(String marka, String model, double qiymet) {
	this.marka = marka;
	this.model = model;
	this.qiymet = qiymet;
}


 public void setQiymet(double qiymet) {
	 if (qiymet< 0) {
		System.out.println("xeta!!!");
	}
	 else {
		 this.qiymet = qiymet;
	 }
	 
	 
	 
 }
 
 public  void melumatGoster() {
	 System.out.println("marka:" + marka);
	 System.out.println("model: " + model);
	 System.out.println("qiymet: " + qiymet);
 }
 


}
