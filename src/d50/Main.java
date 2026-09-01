package d50;

public class Main {

	public static void main(String[] args) {
		
		Burger b = new Burger("Burger",12);
		b.prepare();
		Pizza p = new Pizza("pizza",9);
		p.prepare();
		Salad s = new Salad("Caesar",6);
		s.prepare();
		Order o = new Order();
		o.order(s);
		o.order(p, 1);
		o.order(b, 3, true);
		
	
		
		
	}

}
