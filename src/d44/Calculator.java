package d44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("ilk ededi daxil edin sonra ( + - * /) isarelerini daxil edin ve sonda ise ikinci reqemi daxil edin !!!");
int a = s.nextInt();
s.nextLine();
String s2 = s.next();
s.nextLine();
int b = s.nextInt();

try {
	if (s2.equals("-") & a >= b) {
		System.out.println(a - b);
	}
	else if (s2.equals("+")) {
		System.out.println(a + b);
	}
	else if (s2.equals("*")) {
		System.out.println(a * b);
	}
	else if (s2.equals("/")) {
		System.out.println(a / b);
	}
	else {
		System.out.println("xeta");
	}
} catch (InputMismatchException e) {
	System.out.println("eded dail edin");
}
catch (ArithmeticException e) {
	System.out.println("Xəta: 0-a bölmək olmaz!");
}}}

