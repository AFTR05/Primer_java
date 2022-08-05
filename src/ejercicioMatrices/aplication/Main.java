package ejercicioMatrices.aplication;

import ejercicioMatrices.model.Parte1;
import ejercicioMatrices.model.Parte2;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        int menu=JOptionPane.showOptionDialog(
                null,"Seleccione opcion de ejercicio", "Selector de ejercicio", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                new Object[] { "Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Salir" },null);
        switch (menu){
            case 0:
                Parte1 parte1=new Parte1();
                parte1.llenarMatriz();
                parte1.hallarMayor();
              break;
            case 1:
                Parte2 parte2=new Parte2();
                parte2.llenarMatriz();
                parte2.numeroMayorPos();
        }

    }
}
