package co.edu.cue.agenda;

public class Contacto {
    private String name;
    private double number;

    public String getName() {
        return name;
    }

    public double getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Contacto(String name, double number) {
        this.name = name;
        this.number=number;
    }
}
