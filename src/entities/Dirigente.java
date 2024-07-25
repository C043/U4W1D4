package entities;

public class Dirigente extends Dipendente {
    public Dirigente(Dipartimenti dipartimento, String name, String surname) {
        super(dipartimento, name, surname);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Il salario di " + this.getName() + " " + this.getSurname() + ", dirigente, è: 1.000.000.000 €");
    }
}
