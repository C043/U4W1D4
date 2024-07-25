package entities;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        // Es1.
        System.out.println("---------Es1.-----------");
        Dipendente[] dipendenti = {new Dipendente(Dipartimenti.VENDITE, "Aldo", "Baglio"), new Dipendente(Dipartimenti.PRODUZIONE, "Giovanni", "Storti"), new Dipendente(Dipartimenti.AMMINISTRAZIONE, "Giacomo", "Poretti")};
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente.getMatricola());
        }
        */

        // Es2.
        System.out.println("---------Es2.-----------");
        DipendentePartTime aldo = new DipendentePartTime(Dipartimenti.PRODUZIONE, "Aldo", "Baglio", 120);
        DipendenteFullTime giacomo = new DipendenteFullTime(Dipartimenti.VENDITE, "Giacomo", "Poretti");
        Dirigente giovanni = new Dirigente(Dipartimenti.AMMINISTRAZIONE, "Giovanni", "Storti");
        Dipendente[] dipendenti = {aldo, giacomo, giovanni};
        for (Dipendente dipendente : dipendenti) {
            dipendente.calculateSalary();
        }

        // Es3.
        System.out.println("---------Es3.-----------");
        Volontario Sandro = new Volontario("Sandro", "Betti", 57, "Comico");
        Lavoratore[] lavoratori = {aldo, giovanni, giacomo, Sandro};

        for (Lavoratore lavoratore : lavoratori) {
            Random rand = new Random();
            lavoratore.checkIn(rand.nextInt(6, 14));
        }
    }
}
