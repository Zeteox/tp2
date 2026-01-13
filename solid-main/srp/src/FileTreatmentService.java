import java.util.Scanner;

public class FileTreatmentService {
    public static void traiterDocument(Scanner scanner, FacturationService service) {
        double montantHT = ScannerReader.lireDoublePositif(scanner, "Montant HT : ");
        System.out.print("Nom du client : ");
        String client = scanner.nextLine().trim();
        service.creerFacture(montantHT, client);
    }

    public static void traiterDocument(Scanner scanner, DevisService service) {
        double montantHT = ScannerReader.lireDoublePositif(scanner, "Montant HT : ");
        service.creerDevis(montantHT);
    }
}
