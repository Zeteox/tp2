import java.time.LocalDate;

public class Devis {
    private final LocalDate date;
    private final double montantHT;
    private final double tva;
    private final double totalTTC;
    private final String validite;

    public Devis(LocalDate pDate, double pMontantHT, String validite) {
        this.date = pDate;
        this.montantHT = pMontantHT;
        this.validite = validite;
        this.tva = this.montantHT*0.2;
        this.totalTTC = this.montantHT+this.tva;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getMontantHT() {
        return montantHT;
    }

    public  double getTva() {
        return tva;
    }

    public double getTotalTTC() {
        return totalTTC;
    }

    public String getValidite() {
        return validite;
    }
}
