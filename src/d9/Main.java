package d9;

public class Main {

	public static void main(String[] args) {
d39tap d = new d39tap("ferid",13);
d.goster(true);
d.goster(4.5);
d.goster(6);
d.goster("Ferid");
System.out.println("ededin ortalamasi: "+ d.ortalama(5, 7));

System.out.println("ededin ortalamasi: "+ d.ortalama(5, 7,4));

int[] arr = {1,2,3,4,5};
d.ortalama(arr);
System.out.println("sahe:"+ d.sahe(6,8,12));
System.out.println("sahe:"+ d.sahe(5,7));
System.out.println("sahe:"+ d.sahe(28.2));
d.salam("ferid");
d.salam("ferid", "ingilis");
d.topla(arr);
System.out.println("ededlerin cemi: "+ d.topla(6, 12));
System.out.println("ededlerin cemi: "+ d.topla(66, 77));
System.out.println("ededlerin cemi: "+ d.topla(5,6, 7));
System.out.println("ededlerin cemi: "+ d.topla(arr));


}

}
