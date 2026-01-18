public class SmsSender implements NotificationInterface {
    public void send(String message) {
        System.out.println("SMS envoyé : " + message);
    }
}
