package entities;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;

    public DipendentePartTime(Dipartimenti dipartimento, String name, String surname, int oreLavorate) {
        super(dipartimento, name, surname);
        this.oreLavorate = oreLavorate;
    }

    @Override
    public void calculateSalary() {
        int total = 10 * this.oreLavorate;
        System.out.println("Il salario di " + this.getName() + " " + this.getSurname() + ", dipendente part time, è: " + total + "€");
    }
}
