package Solid.Example4.ImprovedCode;

public class PushNotification implements Notification {
    
    @Override
    public void sendMessage(String message) {
        System.out.println("Push notification: " + message);
    }
}
