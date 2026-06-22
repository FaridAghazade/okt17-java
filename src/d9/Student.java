package d9;

public class Student {
	String name;
	int score;
	static int highestScore;
   


	Student(String name,int score){
	this.name = name;
	this.score = score;
	highestScore =  this.score  ;
    }

	void displayInfo(){
	System.out.println("name : " + name + " , " + "score : "+ score);
	
	}

        

	static void printHighestScore() {
	    System.out.println("en yuksek qiymet : "+ highestScore );
	}
}
