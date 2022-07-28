package co.edu.cue.agenda;

public class Lista {
    private Contacto contacts[];

    public Lista(int number_contact) {
        contacts = new Contacto[number_contact];
    }

    public Contacto[] getContacts() {
        return contacts;
    }

    public void setContacts(Contacto[] contacts) {
        this.contacts = contacts;
    }
}
