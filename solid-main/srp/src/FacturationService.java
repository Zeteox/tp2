import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class FacturationService {
    private final DocumentDisplayer displayer;
    private final FileRepository repository;

    public FacturationService(DocumentDisplayer displayer, FileRepository repository) {
        this.displayer = displayer;
        this.repository = repository;
    }

    public void creerFacture(double montantHT, String clientName) {
        Facture facture = new Facture(LocalDate.now(), clientName, montantHT);
        displayer.displayFacture(facture);
        repository.saveFacture(facture, "factures.txt");
    }
}
