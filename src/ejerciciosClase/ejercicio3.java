package ejerciciosClase;

import javax.swing.*;

public class ejercicio3 {
    public static void main(String[] args) {
        /*Cree un programa en JAVA, solicite números al usuario y calcule su cuadrado
                (Math.pow), hasta que el usuario ingrese un número negativo.*/
        float number;
        do {
            number = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero"));
            if (number < 0) {
                break;
            }
            double expnumber = Math.pow(number, 2);
            System.out.println(expnumber);
        } while (number >= 0);
        System.out.println("Muchas gracias por usar el programa, tenga un lindo dia");
    }
}
