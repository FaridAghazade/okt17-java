import java.util.Scanner;

public class d45pr {

	public static void main(String[] args) {
double balans = 100;
Scanner s = new Scanner(System.in);
System.out.println("Balansdan negeder pul cixmag ileyirsiniz?");
s.nextLine();
 int i = s.nextInt();
 
 try {
//	if (balans<i) {
//		System.out.println("zehmet olmasa balansdan daha kicik bir eded yazin");
//	}
//	if() {
	 double a = balans -= i;
	 System.out.println("balansda bu geder pul qalib :" + a);
	 System.out.println("cixilan pul  :" + i);
//	}
} catch (Exeption e) {
      e.getMessage();
}
}

}
