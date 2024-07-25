package entities;

public class Volontario implements Lavoratore {
    private String name;
    private String surname;
    private int age;
    private String cv;

    public Volontario(String name, String surname, int age, String cv) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cv = cv;
    }

    @Override
    public void checkIn(int ora) {
        System.out.println("Il volontario " + this.name + " " + this.surname + " ha iniziato il suo servizio alle ore " + ora);
    }
}
