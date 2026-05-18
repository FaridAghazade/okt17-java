package ClassPractice;

public class Student {
  String name;
int age;
Grade[] grades;

public Student(String name, int age, Grade[] grades) {
	this.name = name;
	this.age = age;
	this.grades = grades;
}



void printf(){
	 for(Grade g : this.grades) {
 System.out.println(this.name + ", " + g.toString());
	 }


}

}

