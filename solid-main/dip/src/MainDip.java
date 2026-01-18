import java.util.Scanner;

public class MainDip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NotificationFactory factory = new NotificationFactory();
        NotificationService service = new NotificationService(factory);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Envoyer un email");
            System.out.println("2. Envoyer un SMS");
            System.out.println("3. Envoyer une notification push");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choix = ScannerReader.lireEntier(scanner);
            if (choix == 0) break;

            System.out.print("Message : ");
            String message = scanner.nextLine();

            service.envoyer(message, choix);
        }

        scanner.close();
    }
}
