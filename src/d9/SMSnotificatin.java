package d9;

public class SMSnotificatin implements Notification{

	@Override
	public void send(String message) {
		System.out.println("SMS sent: " +message);
		
	}

}
