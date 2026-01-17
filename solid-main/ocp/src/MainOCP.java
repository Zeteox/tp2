import java.util.ArrayList;
import java.util.Scanner;

public class MainOCP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CalculateurRemise> calculateurs = new ArrayList<>();
        calculateurs.add(new StandardClientPaymentService());
        calculateurs.add(new StudentClientPaymentService());
        calculateurs.add(new VIPClientPaymentService());

        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Client standard");
            System.out.println("2. Client étudiant");
            System.out.println("3. Client VIP");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choix = ScannerReader.lireEntier(scanner);

            if (choix == 0) {
                quitter = true;
                continue;
            }
            if (choix < 1 || choix > calculateurs.size()) {
                System.out.println("Choix invalide -> client standard.");
                choix = 1;
            }

            System.out.print("Montant HT : ");
            double montant = ScannerReader.lireDouble(scanner);

            double total = calculateurs.get(choix-1).calculerTotal(montant);
            System.out.println("Montant après remise : " + total);
        }

        scanner.close();
    }

}
