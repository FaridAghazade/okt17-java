package okt17Java;

import java.util.Arrays;
import java.util.Iterator;

public class Main3 {
public static void main(String[] args) {

	     Car a = new Car("Bmw","x7",2026);
			Car b = new Car("mercedes","classic",2008);
			Car c = new Car("Audi","Q3",2023);
			Car e = new Car("Opel","g4",2012);


Car[] c2 = {a,b,c,e};


for(int i = 0;i < c2.length;i++) {
	System.out.println(c2[i]);
	System.out.println();
}



}
}
