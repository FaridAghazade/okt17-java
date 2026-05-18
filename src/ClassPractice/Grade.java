package ClassPractice;

public class Grade {
String subject;
int grade;
Grade(String f,int qiy) {
	this.subject = f;
	this.grade = qiy;
}

@Override
public String toString() {
	return "Subject: " + subject + " grade:" + grade + " tersine";
}
}

