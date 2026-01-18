import java.io.FileWriter;
import java.io.IOException;

class FileRepository {
    public void saveFacture(Facture facture, String filename) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write("FACTURE | " + facture.getDate() +
                    " | Client=" + facture.getClientName() +
                    " | HT=" + facture.getMontantHT() +
                    " | TVA=" + facture.getTva() +
                    " | TTC=" + facture.getTotalTTC() + "\n");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde : " + e.getMessage());
        }
    }

    public void saveDevis(Devis devis, String filename) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write("DEVIS | " + devis.getDate() +
                    " | HT=" + devis.getMontantHT() +
                    " | TVA=" + devis.getTva() +
                    " | TTC=" + devis.getTotalTTC() +
                    " | validite=" + devis.getValidite() + "\n");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde : " + e.getMessage());
        }
    }
}
