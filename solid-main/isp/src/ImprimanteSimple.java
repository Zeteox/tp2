public class ImprimanteSimple implements MachinePrint, Machine {
    public void print() {
        System.out.println("Impression en cours...");
    }

    public void executerFonction(int fonction) {
        switch (fonction) {
            case 1: this.print(); break;
            default: throw  new UnsupportedOperationException("Fonction non supporté.");
        }
    }
}
