public class StandardClientPaymentService implements CalculateurRemise {

    @Override
    public double calculerTotal(double montant) {
        return montant;
    }
}
