import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class SaveService {
    public static void saveFile(String pName, Facture facture) {
        try (
                FileWriter writer = new FileWriter(pName, true)) {
                    writer.write("FACTURE | " + facture.getDate()
                            + " | Client=" + facture.getClientName()
                    + " | HT=" + facture.getMontantHT()
                    + " | TVA=" + facture.getTva()
                    + " | TTC=" + facture.getTotalTTC() + "\n");

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveFile(String pName, Devis devis) {
        try (
                FileWriter writer = new FileWriter(pName, true)) {
            writer.write("DEVIS | " + devis.getDate()
                    + " | HT=" + devis.getMontantHT()
                    + " | TVA=" + devis.getTva()
                    + " | TTC=" + devis.getTotalTTC()
                    + " | validite=" + devis.getValidite() + "\n");

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
