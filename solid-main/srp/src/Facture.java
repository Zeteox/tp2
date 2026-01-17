import java.time.LocalDate;
import java.util.Date;

public class Facture {
    private final LocalDate date;
    private final String clientName;
    private final double montantHT;
    private final double tva;
    private final double totalTTC;

    public Facture(LocalDate pDate, String pClientName, double pMontantHT) {
        this.date = pDate;
        this.clientName = pClientName;
        this.montantHT = pMontantHT;
        this.tva = this.montantHT*0.2;
        this.totalTTC = this.montantHT+this.tva;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getMontantHT() {
        return montantHT;
    }

    public String getClientName() {
        return clientName;
    }

    public  double getTva() {
        return tva;
    }

    public double getTotalTTC() {
        return totalTTC;
    }
}
