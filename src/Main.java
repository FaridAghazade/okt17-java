import carproject.drivers;
import carproject.Models;

public class Main {
 public static void main(String[] args) {
	Models m = new Models("BMW",2026);
	m.showcar();
	Models s = new Models("mercedes",2025);
	s.showcar();
	
	drivers d = new drivers("Ferid",2013);
	d.showdriver();
	
	drivers d2 = new drivers("Murad",2014);
	d2.showdriver();
}
}
