package D57;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Book b = new Book("ferid", "ferid aghazada");
		System.out.println("true ve ya false daxil edin");
		try (LibraryResource r = new LibraryResource(b)) {
		
			r.borrowBook();
		} catch (BookNotAvailableException e) {
			e.getMessage(); 
		}
	}

}
