package co.edu.cue.agenda;

public class Contacto {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Contacto(String name, int number) {
        this.name = name;
        this.number=number;
    }
}
