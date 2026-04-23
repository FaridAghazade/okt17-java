package okt17Java;

import java.util.Iterator;

public class Masstap {

	public static void main(String[] args) {
  int[]	arr = {5,10,15};
  for (int i = 0;i<arr.length;i++) {
  System.out.println(arr[i]);
 }

  int[]	arr2 = {1,2,3,4};
  int d = 0;
  for (int i2 = 0;i2<arr2.length;i2++) {
	
	d += arr2[i2];
 }
  System.out.println("Massivin cemi: "+d);
  
  int[] arr3 = {7, 2, 9, 4};
  
  int max = arr3[0];
  for (int i2 = 1;i2<arr3.length;i2++) {
	if(arr3[i2] > max) {
		max = arr3[i2];
	}
  }
  
  System.out.println(max);
  
 int[] arr4 = {7, 2, 9, 4};
  
  int min = arr3[0];
  for (int i2 = 1;i2<arr3.length;i2++) {
	if(arr3[i2] < min) {
		min = arr3[i2];
	}
  }
  
  System.out.println(min);
    
  int[] arr5 = {7, 2, 9, 4};
  System.out.println(arr5.length);

  

		  }

}
