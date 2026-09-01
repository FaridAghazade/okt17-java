package d9;

public class Main40 {

	public static void main(String[] args) {
		EmailNotification email = new EmailNotification();
		SMSnotificatin  sms =new  SMSnotificatin();
		Pushnotification  push = new Pushnotification();
		email.send("salam");
		sms.send("hi");
		push.send("push");
		
		
	}

}
