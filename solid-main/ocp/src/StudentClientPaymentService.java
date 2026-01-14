public class StudentClientPaymentService implements CalculateurRemise {

    @Override
    public double calculerTotal(double montant) {
        return montant * 0.9;
    }
}
