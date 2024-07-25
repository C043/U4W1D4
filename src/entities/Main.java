package entities;

public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = {new Dipendente(Dipartimenti.VENDITE), new Dipendente(Dipartimenti.PRODUZIONE), new Dipendente(Dipartimenti.AMMINISTRAZIONE)};
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente.getMatricola());
        }
    }
}
