public class ImprimanteMultifonction implements MachinePrint, MachineScan, MachineFax, Machine {

    public void print() {
        System.out.println("Impression en cours...");
    }

    public void scan() {
        System.out.println("Scan en cours...");
    }

    public void fax() {
        System.out.println("Fax envoyé...");
    }

    @Override
    public void executerFonction(int fonction) {
        switch (fonction) {
            case 1: this.print(); break;
            case 2: this.scan(); break;
            case 3: this.fax(); break;
            default: System.out.println("Fonction inconnue");
        }
    }
}
