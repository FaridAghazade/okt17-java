package ClassPractice;

public class Rectangle extends Shape{
double width;
double height;


public Rectangle(double width, double height) {
	this.width = width;
	this.height = height;
}


@Override
void area() {
	System.out.println("rectanglin sahesi: "+ width * height);
}


}
