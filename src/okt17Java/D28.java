package okt17Java;

public class D28 {

	public static void main(String[] args) {
		   int[][] a = {
				   {85, 90, 78, 92},
				   {88, 76, 95, 89},
				   {70, 80, 85, 75}
				               };
		   
		      int ac = a[0][0];
		     int  r = 0;
		         int e = 1;
		         int sa = 1;
				 int Sum = 0; 
				 for(int i = 0;i<a.length;i++){
				    for(int b = 0;b<a[i].length;b++){
				      Sum+=a[i][b];
				      if(ac<a[i][b]) {  	
				    	 ac = a[i][b];
				    	 r++;
				    	 sa = i;
				    	 
				      }   
				 } 
				 System.out.print("%d ci sagirdin ortalama qiymeti :".formatted(e));
				 System.out.println(Sum/a[i].length);
				 Sum = 0;
				 e++;
				 sa = i;
				 }
				 
				 System.out.println("Maksim eded %d  , %d  ci sagirde %d ci fende".formatted(ac,sa,r));
	}

}
