package entities;

import java.util.Random;

public class Dipendente {
    private int matricola;
    private double stipendio;
    private Dipartimenti dipartimento;

    public Dipendente(Dipartimenti dipartimento) {
        Random rand = new Random();
        this.matricola = rand.nextInt(1000);
        switch (dipartimento) {
            case AMMINISTRAZIONE -> this.stipendio = 100000;
            case PRODUZIONE -> this.stipendio = 1000;
            case VENDITE -> this.stipendio = 1500;
        }
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimenti getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimenti dipartimento) {
        this.dipartimento = dipartimento;
    }
}
