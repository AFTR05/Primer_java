package co.edu.cue.agenda;

import javax.swing.*;
import java.util.List;

/*Un contacto está definido por un nombre y un teléfono. Un contacto es igual a otro cuando sus nombres
        son iguales.
        Una agenda de contactos está formada por un conjunto de contactos.
        Se podrá crear de dos formas, indicándoles nosotros el tamaño o con un tamaño por defecto (10)
        Los métodos de la agenda serán los siguientes:
        ● agregarContacto(Contacto c): Añade un contacto a la agenda, sino se pueden meter más a la
        agenda se indicara por pantalla. No se pueden meter contactos que existan, es decir, no podemos
        duplicar nombres, aunque tengan distinto teléfono.
        ● existeContacto(Conctacto c): indica si el contacto pasado existe o no. ∙
        listarContactos(): Lista toda la agenda
        ● buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono. ∙
        eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no por
        pantalla
        ● agendaLlena(): indica si la agenda está llena.
        ● espaciosDisponibles(): indica cuántos contactos más podemos meter.*/
public class Main {
    public static void main(String[] args){
        int contContact=0;
        int option;
        Contacto contacts[];
        int number_contacts=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de contactos que desea tener en la agenda"));
        contacts=new Contacto[number_contacts];
        Lista lista=new Lista(number_contacts);
        System.out.println(String.valueOf(contacts[0])=="Andres");
        do{
            option=JOptionPane.showOptionDialog(
                    null,"Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                    new Object[] { "Agregar contacto", "Buscar contacto", "Espacio disponibles", "Salir" },"Agregar contacto");
            switch (option){
                case 0:
                    creacionContacto(contacts,contContact,lista);
                    if (String.valueOf(contacts[contContact])!="null"){
                        contContact+=1;
                    }
                    break;
                case 1:
                    buscarContacto(contacts);
                    break;
                case 2:
                    espacioDisponible(contacts);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Muchas gracias por usar su agenda :)");
                    break;
            }
        }while(option!=3);
    }

    static void creacionContacto(Contacto contacts[],int cont,Lista lista){
        String name=JOptionPane.showInputDialog("Digite el nombre del contacto");
        boolean confirm=false;
        for (int x = 0; x < contacts.length; x++) {
            if (String.valueOf(contacts[x])=="null"){
                break;
            } else if (contacts[x].getName() == name) {
                confirm=true;
                JOptionPane.showMessageDialog(null,"lamento informarle que ya hay un contacto con este nombre");
                break;
            }
        }
       if (!confirm) {
            double number = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero de telefono del contacto"));
            Contacto contact = new Contacto(name, number);
            contacts[cont] = contact;
            lista.setContacts(contacts);
           System.out.println(contacts[0]);
        }

    }


    static void buscarContacto(Contacto contacts[]){
        String name=JOptionPane.showInputDialog("Digite el nombre del contacto a buscar");
        boolean confirm=false;
        for (int x = 0; x < contacts.length; x++) {
            if (String.valueOf(contacts[x])=="null") {
                break;
            }else if (String.valueOf(contacts[x].getName()) == name) {
                confirm=true;
                JOptionPane.showMessageDialog(null,"El contacto "+name+ " si se encuentra en la agenda");
                break;
            } else {
                confirm=false;
            }
        }
        if (!confirm){
            JOptionPane.showMessageDialog(null,"El contacto"+name+" No se encuentra en la agenda");
        }
    }

    static void espacioDisponible(Contacto contacts[]){
        int cantidad=0;
        for(int x=0;x<contacts.length; x++){
            if (String.valueOf(contacts[x])=="null"){
                cantidad+=1;
            }
        }
        JOptionPane.showMessageDialog(null,"El espacio disponible en la agenda es: "+cantidad);

    }

    static void eliminarContact(Contacto contacts[]){

    }
}
