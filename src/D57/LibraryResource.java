package D57;

import java.util.Scanner;

public class LibraryResource implements AutoCloseable{
	Book book;
	Scanner sc = new Scanner(System.in);
	 boolean b = sc.nextBoolean();
	 

	
	public LibraryResource(Book book) {
		this.book = book;
	}
  public void borrowBook() throws BookNotAvailableException {
	  
	  try  {
		if (b==false) {
			System.out.println("kitab movcud deyl");
	  throw new BookNotAvailableException("kitab movcud deyl");
		}
		else {
			System.out.println("buyurun kitabi aldiz");
		}
	} catch (BookNotAvailableException e) {
    e.getMessage();
}
  } 
     @Override
	public  void close() {
	System.out.println("Kitabxana resource-u bağlandı");
	}
	
}


