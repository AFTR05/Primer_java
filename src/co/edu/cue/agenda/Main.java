package co.edu.cue.agenda;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Contacto contacts[];
        int number_contacts=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de contactos que desea tener en la agenda"));
        contacts=new Contacto[number_contacts];
        Lista Lista=new Lista(number_contacts);




    }
}
