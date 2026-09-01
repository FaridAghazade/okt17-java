package d9;

public class EmailNotification implements Notification {

	@Override
	public void send(String message) {
		System.out.println("email sent: " +message);		
	}

}
