package ders8;

public class D40pr {
	String name;
	static int studentcount;
	
	D40pr(String name){
	this.name = name;
	studentcount++;
	}
	
	void showInfo() {
		System.out.println("Ad: "+ name);
		
	}
	static void showCount() {
		System.out.println(	"Ümumi şagird sayı:"+ studentcount);
	}

}
