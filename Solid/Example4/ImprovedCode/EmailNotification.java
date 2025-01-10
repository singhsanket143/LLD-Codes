package Solid.Example4.ImprovedCode;

public class EmailNotification implements Notification {
    
    @Override
    public void sendMessage(String message) {
        System.out.println("Email notification: " + message);
    }
}
