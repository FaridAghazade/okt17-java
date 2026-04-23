package okt17Java;

public class Ders21 {

	public static void main(String[] args) {
		 
		 String s = "FERID";
		 int i = 12;
		 String s1 = "harward scholarship";
		 double  qiymet = 99.d;
		 
		 //String.format() və ya printf() metodundan istifadə edin.
//		 Çıxış aşağıdakı kimi olmalıdır:
//			 Salam, mən Aysel. Mən 15 yaşındayam və Xəzər Liseyində oxuyuram.
//			 Mən imtahanda 95.5 bal topladım.
//			 İkinci cümlədə %.1f format specifier-dən istifadə edərək balı bir onluq rəqəmlə göstərməyə çalışın.
//			 Bonus: İstəsəniz, ad və məktəb adını dəyişən kimi qəbul edib, proqramı ümumiləşdirə bilərsiniz.
		 
		 String s3 = String.format(" Salam, mən %s. Mən %d yaşındayam və %s qazanmisam.",s,i,s1);
		 String s4 = String.format("Mən imtahanda %.1f bal topladim",qiymet);
		 String s5 = String.format("Mən harwardi bitirdim : %b",true);
      System.out.println(s3);
      System.out.println(s4);
      System.out.println(s5);
          
      String s11 = String.format("|%-10s|", "ferid");
      System.out.println(s11);
      System.out.printf("|%-5d|",444);
//      
	}

}
