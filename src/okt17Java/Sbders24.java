package okt17Java;

public class Sbders24 {

	public static void main(String[] args) {
String s = """
		   Salam menim adim ferid .
		   men java ni cox xoslayiram 
		   ve men  java proqlamlasdirma dilini cox  sevirem;
		   """;

StringBuilder sb = new StringBuilder(s) ;
 int i = s.indexOf("java");
 System.out.println(i);

	while(i!=-1) {
		 sb = sb.replace(i, i+4, "JAVA");
		 i = sb.indexOf("java", i + 4);       
		}
				         
		sb =  sb.insert(0, "--Start--");
		sb = sb.append("--End--");
		sb.reverse();	
		System.out.println(sb);
    
		for (int elem :) { System.out.println(elem); }
	
	}
	}



        

