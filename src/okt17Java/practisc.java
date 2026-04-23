package okt17Java;

public class practisc {

	public static void main(String[] args) {	
		String s = """
				{
				\"ad\":\"%s\",
				\"yas\":%d,
				}
				""".formatted("Ferid",12);
		System.out.println(s);
		String s2 = """	
				SELECT * FROM users
				WHERE yas > %d	
				""".formatted(12);
		
		 System.out.println(s2);
	}
     

}
