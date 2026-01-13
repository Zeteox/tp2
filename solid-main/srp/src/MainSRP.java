import java.util.Scanner;

public class MainSRP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FacturationService facturationService = new FacturationService();
        DevisService devisService = new DevisService();

        boolean quitter = false;

        while (!quitter) {
            afficherMenu();

            int choix = ScannerReader.lireEntier(scanner, "Choix : ");

            switch (choix) {
                case 1:
                    FileTreatmentService.traiterDocument(scanner, facturationService);
                    break;
                case 2:
                    FileTreatmentService.traiterDocument(scanner, devisService);
                    break;
                case 0:
                    quitter = true;
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }

        scanner.close();
    }

    private static void afficherMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Créer une facture");
        System.out.println("2. Créer un devis");
        System.out.println("0. Quitter");
    }
}
