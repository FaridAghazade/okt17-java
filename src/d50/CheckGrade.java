package d50;

import MyException.GradeExeption;

public class CheckGrade {
	
public void checkGrade2(int grade) {
	try {
		if (grade>100) {
			throw new GradeExeption("zehmet olmasa 100 den daha kicik eded daxil edin");
		}
		else if(grade<0) {
			throw new GradeExeption("zehmet olmasa musbet eded daxil edin");
		}
		else if(grade<51) {
			throw new GradeExeption("telebe imtahannan kesildi");
		}
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
}
public static void main(String[] args) {
CheckGrade c = new CheckGrade();
c.checkGrade2(-10);
c.checkGrade2(120);
c.checkGrade2(23);
}
}
