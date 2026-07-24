package d50;

public class Order {

 void order(Food food){
	System.out.println( food.name + "niz hazirdi" );
 }

 void order(Food food, int quantity){
	 System.out.println(quantity +  " "+  food.name + "niz hazirdi" );
 }

 void order(Food food, int quantity, boolean takeaway){
	 System.out.println(quantity +  " "+  food.name + "niz hazirdi , takeaway dir:  "+ takeaway);
 }
}
