package Solid.Example4.BetterCode;

import java.util.List;

public class NotificationSender {
    
    public void sendNotifications(List<String> notificationTypes, String message) {
        for (String notificationType : notificationTypes) {
            switch (notificationType) {
                case "EMAIL":
                    EmailNotification notification = new EmailNotification();
                    notification.sendEmailNotification(message);
                    break;
                case "SMS":
                    SMSNotification smsNotification = new SMSNotification();
                    smsNotification.sendSMSNotification(message);
                    break;
                case "PUSH":
                    PushNotification pushNotification = new PushNotification();
                    pushNotification.sendPushNotification(message);
                    break;
            }
        }
    }

}
