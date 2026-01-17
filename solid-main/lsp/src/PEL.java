import java.util.Date;
import java.util.Scanner;

public class PEL extends CompteBancaire {
    private final double tauxInteret = 0.03;
    // Date 2020-01-01 pour tester le retrait apres échéance
    private final Date dateDebut = Date.from(java.time.LocalDate.of(2020, 1, 1).atStartOfDay().toInstant(java.time.ZoneOffset.UTC));

    // Date actuelle pour tester le retrait avant échéance
    //private final Date dateDebut = new Date();

    private final Date dateFin = new Date(dateDebut.getTime() + (4L * 365 * 24 * 60 * 60 * 1000)); // 4 ans plus tard

    public PEL() {
        super();
        // Calcul des interets annuels
        byte nbAnnees = (byte) (new Date().getYear() - dateDebut.getYear());
        for (int i = 0; i < nbAnnees; i++) {
            solde += solde * tauxInteret;
        }
    }

    @Override
    public void retirer(double montant) {
        System.out.println("solde PEL : " + solde);
        if (!(new Date().before(dateFin))) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("voulez-vous retirer [y/N]: ");
            String choix = scanner.nextLine();

            if (choix.equals("y")) {
                System.out.println("Retrait accepté. Vous avez retiré : " + this.solde);
                super.retirer(this.solde);
            }   else {
                System.out.println("Retrait annulé.");
            }

            scanner.close();
            return;
        }
        System.out.println("Impossible de retirer d'un PEL avant la date d'échéance.");
    }
}
