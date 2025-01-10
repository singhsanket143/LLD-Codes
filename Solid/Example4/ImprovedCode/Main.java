package Solid.Example4.ImprovedCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Notification> li = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i < 5) {
            String notificationType = scanner.next();
            if(notificationType == "SMS") {
                li.add(new SMSNotification());
            } else  if(notificationType == "EMAIL"){
                li.add(new EmailNotification());
            } else if(notificationType == "PUSH") {
                li.add(new PushNotification());
            }
        }

    }
}
