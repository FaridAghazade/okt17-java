package okt17Java;

 public class ClassAndObjectAndConstructorsHome {
       int id;
       String Name;
       String surname;
       String Phone;
       String adress;
       int salary;
       
                 void all() {
                	 this.id = 12; 
                	 this.surname = "aghazda"; 
                	 this.Name = "Ferid"; 
                	 this.salary = 1200; 
                	 this.adress = "gotha"; 
                	 this.Phone = "25363456357636"; 
                 }
                 
       
       
          void d() {
        	  System.out.println("bu default constructordu burda parametr yoxdu");
        	  
          }
          
          void n(String name) {
        	  System.out.println(name);
          }
          void ns(String name ,String surname) {
        	  System.out.println("Name: "+ name + " " + "Surname: " + surname);
          }
          void nsf(String name ,int phone , int Salary) {
        	  System.out.println("Name: "+ name + " " + "Salary: " + Salary + " " + "phone: " + phone);
          }
          
          
	
	
}
