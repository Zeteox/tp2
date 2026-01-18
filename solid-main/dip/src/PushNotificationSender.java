public class PushNotificationSender implements NotificationInterface {
    public void send(String message) {
        System.out.println("Notification push envoyée : " + message);
    }
}
