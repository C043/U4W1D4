package entities;

import java.util.Random;

public abstract class Dipendente implements Lavoratore {
    private int matricola;
    private double stipendio;
    private Dipartimenti dipartimento;
    private String name;
    private String surname;

    public Dipendente(Dipartimenti dipartimento, String name, String surname) {
        Random rand = new Random();
        this.matricola = rand.nextInt(1000);
        this.name = name;
        this.surname = surname;
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Dipartimenti getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimenti dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract void calculateSalary();

    @Override
    public void checkIn(int ora) {
        System.out.println("Il dipendente " + this.name + " " + this.surname + " ha iniziato a lavorare alle ore " + ora);
    }
}
