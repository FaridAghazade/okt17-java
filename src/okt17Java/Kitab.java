package okt17Java;

public record Kitab(String bashlig, String muellif,int sehife) {

    boolean uzun(){
    	return sehife>=200;
    }
}
