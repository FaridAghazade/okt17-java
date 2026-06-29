package d9;

public class Main2 {

	public static void main(String[] args) {
       Student s = new Student("Ferid",100);
       Student s2 = new Student("Leyla",78);
       Student s3 = new Student("Eli",89);
       Student s4 = new Student("Nazim",90);
       
       s.displayInfo();
       s2.displayInfo();
       s3.displayInfo();
       s4.displayInfo();
       
       s.printHighestScore();
		
		Pr p = new Pr("Nicat",2000);
		Pr p2 = new Pr("Elcin",2500);
		
		p.displayAccount();
		p2.displayAccount();
		
		
		
//	System.out.println(D42pr.sum(27, 23));
	

	
	System.out.println(D42pr.count);
	System.out.println("Program basladi");
		
	System.out.println("Mektebin adi : " + School.schoolName);

       
       
        }

}
