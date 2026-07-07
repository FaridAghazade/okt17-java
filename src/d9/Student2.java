package d9;

public class Student2 {
private String ad;
private int age;

public  void  setName(String name) {
	this.ad = name;
}

public  String  getName() {
 return  ad;
}

public  void  setAge(int age) {
	if (age < 0 & age > 150) {
		System.out.println("Yanlış yaş!");
	}
	else {
		this.age = age;
	}
	
}

public  int  getAge() {
 return  age;
}





}
