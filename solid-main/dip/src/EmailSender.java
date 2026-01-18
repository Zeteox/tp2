public class EmailSender implements NotificationInterface {
    public void send(String message) {
        System.out.println("Email envoyé : " + message);
    }
}
