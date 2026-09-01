package d9;

public class Pushnotification implements Notification{

	@Override
	public void send(String message) {
		System.out.println("Push sent: " +message);
		
	}

}
