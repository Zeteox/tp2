import java.time.LocalDate;

public class DevisService {
    private final DocumentDisplayer displayer;
    private final FileRepository repository;

    public DevisService(DocumentDisplayer displayer, FileRepository repository) {
        this.displayer = displayer;
        this.repository = repository;
    }

    public void creerDevis(double montantHT) {
        Devis devis = new Devis(LocalDate.now(), montantHT, "30j");
        displayer.displayDevis(devis);
        repository.saveDevis(devis, "devis.txt");
    }
}
