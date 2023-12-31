/**
 * User: Sandeera Jayampathi (DS)
 * Date: 12/17/2023
 * Time: 4:23 PM
 */
public class NotificationService {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
