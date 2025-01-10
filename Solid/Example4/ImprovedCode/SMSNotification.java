package Solid.Example4.ImprovedCode;

public class SMSNotification implements Notification {
    
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS notification: " + message);
    }   
}
