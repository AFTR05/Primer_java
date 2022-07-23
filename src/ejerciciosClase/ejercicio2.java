package ejerciciosClase;

import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args) {
        int year;      //apartado de año--------------------------------------------------------------------------------
        do {
            year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
            if (year < 0) {
                System.out.println("Huy mano le pegas harto al lol eso no es un año");
            }

        } while (year < 0);
        if (year % 4 == 0) { //mensaje tipo año
            System.out.println("El año es bisciesto");
        }

        int mes; //apartado mes-----------------------------------------------------------------------------------------
        do {
            mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes (el numero)"));
            if (mes > 12 || mes < 1) {
                System.out.println("Huy mano le pegas harto al lol eso no es un mes");
            }
        } while (mes > 12 || mes < 1);

        int dia;         //apartado dia--------------------------------------------------------------------------------
        boolean contd;

        do {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { //si mes tiene 30
                dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
                if (dia < 0 || dia > 30) {
                    System.out.println("Huy mano le pegas harto al lol eso no es un dia de ese mes");
                    contd = false;
                } else {
                    contd = true;
                }
            } else if (mes == 2) {       //si mes tiene 29 o 28 dias
                if (year % 4 == 0) {
                    dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
                    if (dia < 0 || dia > 28) {
                        System.out.println("debido a que el año es bisciesto, eso no es un dia de ese mes");
                        contd = false;
                    } else {
                        contd = true;
                    }
                } else {
                    dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
                    if (dia < 0 || dia > 29) {
                        System.out.println("Huy eso no es un dia de ese mes");
                        contd = false;
                    } else {
                        contd = true;
                    }
                }
            } else {
                dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
                if (dia < 0 || dia > 31) {
                    System.out.println("Huy mano le pegas harto al lol eso no es un dia");
                    contd = false;
                } else {
                    contd = true;
                }
            }
        } while (!contd);
        //Asignacion de nombres mes-------------------------------------------------------------------------------------
        String namem = String.valueOf(mes);
        switch (mes) {
            case 1:
                namem = "Enero";
                break;

            case 2:
                namem = "Febrero";
                break;
            case 3:
                namem = "Marzo";
                break;
            case 4:
                namem = "Abril";
                break;
            case 5:
                namem = "Mayo";
                break;
            case 6:
                namem = "Junio";
                break;
            case 7:
                namem = "Julio";
                break;
            case 8:
                namem = "Agosto";
                break;
            case 9:
                namem = "Septiembre";
                break;
            case 10:
                namem = "Octubre";
                break;
            case 11:
                namem = "Noviembre";
                break;
            case 12:
                namem = "Diciembre";
                break;

        }
        //Impresion final----------------------------------------------------------------------------------------------
        System.out.println("Es el año " + year + " en el mes de " + namem + " en el dia " + dia);
    }
}