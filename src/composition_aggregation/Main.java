package composition_aggregation;

public class Main {

	public static void main(String[] args) {
		
          Phone  P = new Phone("Samsung",2000,"s24",10000);
          P.showInfo();
          Teacher t = new Teacher("Ferid","geography");
          School sc = new School("Landau",t);
          System.out.println();
          sc.showInfo();
	}

}
