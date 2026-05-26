import carproject.drivers;
import carproject.models;

public class Main {
 public static void main(String[] args) {
	models m = new models("BMW",2026);
	m.showcar();
	models s = new models("mercedes",2025);
	s.showcar();
	
	drivers d = new drivers("Ferid",2013);
	d.showdriver();
	
	drivers d2 = new drivers("Murad",2014);
	d2.showdriver();
}
}
