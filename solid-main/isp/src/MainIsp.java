import java.util.List;
import java.util.Scanner;

public class MainIsp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Imprimer");
            System.out.println("2. Scanner");
            System.out.println("3. Faxer");
            System.out.println("0. Quitter");
            System.out.print("Choix fonctionnalité : ");

            int fonction = ScannerReader.lireEntier(scanner);
            if (fonction == 0) break;

            System.out.println("\nChoisir la machine :");
            System.out.println("1. Imprimante simple");
            System.out.println("2. Imprimante multifonction");
            System.out.print("Choix machine : ");

            int machineChoisie = ScannerReader.lireEntier(scanner);

            Machine machine;
            if (machineChoisie == 2) {
                machine = new ImprimanteMultifonction();
            } else {
                machine = new ImprimanteSimple();
            }

            try {
                machine.executerFonction(fonction);
            } catch (UnsupportedOperationException e) {
                System.out.println("Fonctionnalité non supportée par cette machine");
            }
        }

        scanner.close();
    }
}
