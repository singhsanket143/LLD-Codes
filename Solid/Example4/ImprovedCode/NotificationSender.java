package Solid.Example4.ImprovedCode;

import java.util.List;

public class NotificationSender {
    
    public void sendNotifications(List<Notification> notifications, String message) {
        for (Notification notification : notifications) {
            notification.sendMessage(message);
        }
    }

}
