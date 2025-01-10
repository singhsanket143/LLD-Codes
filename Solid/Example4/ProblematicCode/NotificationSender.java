package Solid.Example4.ProblematicCode;

import java.util.List;

public class NotificationSender {
    
    public void sendNotifications(List<NotificationType> notificationTypes, String message) {
        for (NotificationType notificationType : notificationTypes) {
            switch (notificationType) {
                case SMS:
                    notificationType.sendSMSNotification(message);
                    break;
                case EMAIL:
                    notificationType.sendEmailNotification(message);
                    break;
                case PUSH:
                    notificationType.sendPushNotification(message);
                    break;
                case WHATSAPP:
                    notificationType.sendWhatsAppNotification(message);
                    break;
            }
        }
    }

}
