public class VIPClientPaymentService implements CalculateurRemise {

    @Override
    public double calculerTotal(double montant) {
        return montant * 0.8;
    }
}
