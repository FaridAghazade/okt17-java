package d9;

public class Student {
	String name;
	int score;
	static int highestScore =0;
   
    

	Student(String name,int score){
	this.name = name;
	this.score = score;
	if (score > highestScore) {
		highestScore = score;
	}
    }

	void displayInfo(){
	System.out.println("name : " + name + " , " + "score : "+ score);
	
	}

        

	static void printHighestScore() {
	    System.out.println("en yuksek qiymet : " + highestScore);
	}
}
