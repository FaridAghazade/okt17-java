package d9;

public class User {
private String istfadeciAdi;
private String parol;


public void setParol(String parol) {
	if (parol.length() >= 6) {
		 this.parol = parol;
	}
	else {
		System.out.println("xeta , zehmet olmasa 6 simvollug ve ya daha boyuk bir parol yazin");
	}
	
	
} 

public void getParol() {
	if (this.parol.length() >= 6) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}


