package okt17Java;

public class construct {

	public static void main(String[] args) {
		ClassAndObjectAndConstructorsHome  construct = new ClassAndObjectAndConstructorsHome();
		ClassAndObjectAndConstructorsHome construct2 = new ClassAndObjectAndConstructorsHome();
		ClassAndObjectAndConstructorsHome construct3 = new ClassAndObjectAndConstructorsHome();
		ClassAndObjectAndConstructorsHome construct4 = new ClassAndObjectAndConstructorsHome();
		construct.all();
		construct.d();
		construct2.n("ferid");
		construct3.ns("ferid", "aghazada");
		construct4.nsf("ferid", 1246436, 23);
		
		System.out.println( "adress"+construct.adress);
		System.out.println( "phone"+construct.Phone);
		System.out.println( "name"+construct.Name);
		System.out.println( "surname"+construct.surname);
		System.out.println( "salary"+construct.salary);
}
}
