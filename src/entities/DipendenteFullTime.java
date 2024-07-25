package entities;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(Dipartimenti dipartimento, String name, String surname) {
        super(dipartimento, name, surname);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Il salario di " + this.getName() + " " + this.getSurname() + ", dipendente full time, è: 2.000€");
    }
}
