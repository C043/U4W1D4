package entities;

public class Main {
    public static void main(String[] args) {
        /*
        // Es1.
        Dipendente[] dipendenti = {new Dipendente(Dipartimenti.VENDITE, "Aldo", "Baglio"), new Dipendente(Dipartimenti.PRODUZIONE, "Giovanni", "Storti"), new Dipendente(Dipartimenti.AMMINISTRAZIONE, "Giacomo", "Poretti")};
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente.getMatricola());
        }
        */
        Dipendente[] dipendenti = {new DipendentePartTime(Dipartimenti.PRODUZIONE, "Aldo", "Baglio", 120), new DipendenteFullTime(Dipartimenti.VENDITE, "Giacomo", "Poretti"), new Dirigente(Dipartimenti.AMMINISTRAZIONE, "Giovanni", "Storti")};
        for (Dipendente dipendente : dipendenti) {
            dipendente.calculateSalary();
        }
    }
}
