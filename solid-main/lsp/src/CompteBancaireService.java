import java.awt.*;
import java.util.Scanner;

public class CompteBancaireService {
    public void Menu() {
        Scanner scanner = new Scanner(System.in);

        CompteBancaire compte = CompteBancaireService.choisirCompte(scanner);

        if (!(compte instanceof PEL)) {
            System.out.print("Montant à retirer : ");
            double montant = ScannerReader.lireDouble(scanner);
            compte.retirer(montant);
        } else {
            compte.retirer(0); // Le montant n'a pas d'importance pour un PEL
        }

        scanner.close();
    }

    static CompteBancaire choisirCompte(Scanner scanner) {
        System.out.println("\n--- TYPE DE COMPTE ---");
        System.out.println("1. Compte courant");
        System.out.println("2. PEL");
        System.out.print("Choix : ");

        int choix = ScannerReader.lireEntier(scanner);

        if (choix == 2) {
            return new PEL();
        }
        return new CompteBancaire();
    }
}
