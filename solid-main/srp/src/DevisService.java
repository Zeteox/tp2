import java.time.LocalDate;

public class DevisService {
    public void creerDevis(double montantHT) {
        Devis devis = new Devis(LocalDate.now(), montantHT, "30j");

        // Affichage
        System.out.println("\n--- DEVIS ---");
        System.out.println("Date : " + devis.getDate());
        System.out.println("Montant HT : " + devis.getMontantHT());
        System.out.println("TVA : " + devis.getTva());
        System.out.println("Total TTC : " + devis.getTotalTTC());
        System.out.println("Valable " + devis.getValidite());

        // Sauvegarde fichier
        SaveService.saveFile(
                "devis.txt",
                devis
        );
    }
}
