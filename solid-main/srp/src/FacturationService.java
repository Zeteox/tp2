import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class FacturationService {

    public void creerFacture(double montantHT, String clientName) {
        Facture facture = new Facture(LocalDate.now(), clientName, montantHT);

        // Affichage
        System.out.println("\n--- FACTURE ---");
        System.out.println("Date : " + facture.getDate());
        System.out.println("Client : " + facture.getClientName());
        System.out.println("Montant HT : " + facture.getMontantHT());
        System.out.println("TVA : " + facture.getTva());
        System.out.println("Total TTC : " + facture.getTotalTTC());

        // Sauvegarde fichier
        SaveService.saveFile(
            "factures.txt",
            facture
        );
    }
}
