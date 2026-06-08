package ClassPractice;

import com.company.modelcom.company.servicecom.company.main.Student;

public class Main {
public static void main(String[] args) {
	Grade g = new Grade("proqlamlasdirma",8 );
	Grade g1 = new Grade("riyyaziyat",8);
	
	Grade[] grades1 = {g,g1};
	
	Student s = new Student("ferid",13,grades1);
	
	s.printf();
	

}
}
