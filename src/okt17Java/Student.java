package okt17Java;

public class Student {
//	public int age;
//	public String name;
//
//	Student(String name, int age) {
//          this.name = name;
//          this.age = age;
//          
//       
//	
//	}
//	 public void getInfo(){
//     	System.out.println("ad = " + this.name + " " + "age = " + this.age); 
//     }
	public int age;
	public String name;
    public String schoolname;
    
    public void printStudentInfo() {
    	System.out.println("age: "+ age);
    	System.out.println("name: "+ name);
    	System.out.println("school: "+ schoolname);
    }    
    
    public static void changeSchoolName(String newName) {
      String  schoolname = newName;

      System.out.println(schoolname);
    }
    

}
