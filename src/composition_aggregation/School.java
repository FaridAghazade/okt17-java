package composition_aggregation;

public class School {
String schoolName;
Teacher teacher;


public School(String schoolName, Teacher teacher) {
    this.schoolName = schoolName;
	this.teacher = teacher;
}
	public void showInfo() {
		System.out.println("School: "+ schoolName);
		System.out.println("Teacher: "+ teacher.name);
		System.out.println("Subject: "+ teacher.subject);
	
}
}



