package okt17Java;

public class Sbuffer {

	public static void main(String[] args) {
		String s2 = """
				Salam menim adim ferid .
				men java ni cox xoslayiram 
				ve men  java proqlamlasdirma dilini cox  sevirem;
		""";

		StringBuffer sb2 = new StringBuffer(s2) ;
		int i2 = sb2.indexOf("java");

		while(i2!=-1) {
		 sb2 = sb2.replace(i2, i2+4, "JAVA");
		 i2 = sb2.indexOf("java", i2 + 4);       
		}
				         
		sb2 =  sb2.insert(0, "--Start--");
		sb2 = sb2.append("--End--");
		sb2.reverse();	
		System.out.println(sb2);
	}

}
