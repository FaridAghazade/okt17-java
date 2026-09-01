package ClassPractice;

public class Cat extends Animal2 {
    String breed;
	public Cat(String name , String breed) {
		super(name);
		this.breed = breed;
	
	}
	
	public void showinfo() {
		System.out.println("pisikin adi : "+ super.name);
		System.out.println("cins: "+ breed);
	}

}
