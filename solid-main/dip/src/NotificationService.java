public class NotificationService {
    private final NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public void envoyer(String message, int choix) {
        try {
            NotificationInterface sender = factory.createNotification(choix);
            sender.send(message);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
