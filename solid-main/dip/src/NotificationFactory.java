public class NotificationFactory {

    public NotificationInterface createNotification(int type) {
        switch (type) {
            case 1:
                return new EmailSender();
            case 2:
                return new SmsSender();
            case 3:
                return new PushNotificationSender();
            default:
                throw new IllegalArgumentException("Type de notification invalide : " + type);
        }
    }
}
