package okt17Java;

public class Calculator {

	static int operationCount;

	public static void add(int a, int b) {
		System.out.println(a + b);
		operationCount++;
	}

	public static void subtract(int a, int b) {
		System.out.println(a - b);
		operationCount++;
	}

	public static void multiply(int a, int b) {
		System.out.println(a * b);
		operationCount++;
	}

	public static void divide(int a, int b) {
		System.out.println(a / b);
		operationCount++;
	}
}
