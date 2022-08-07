package ejercicioMatrices.aplication;

import ejercicioMatrices.model.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        int menu=JOptionPane.showOptionDialog(
                null,"Seleccione opcion de ejercicio", "Selector de ejercicio", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                new Object[] { "Retornar el número mayor", "matriz de 5 * 5 y diagonal", "Matriz inversa","Simetria","Suma matriz","Hallar ceros", "Salir" },null);
        switch (menu){
            case 0:
                Parte1 parte1=new Parte1();
                parte1.hallarMayor();
              break;
            case 1:
                Parte2y3 parte2=new Parte2y3();
                parte2.llenarMatriz();
                parte2.numeroMayorPos();
                parte2.sumaDiagonal();
                break;
            case 2:
                Parte4 parte4=new Parte4();
                parte4.llenarMatrizInverso();
                parte4.inversoMatriz();
                break;
            case 3:
                Parte5 parte5=new Parte5();
                parte5.llenarMatrizInverso();
                parte5.hallarSimetria();
                break;
            case 4:
                Parte6 parte6=new Parte6();
                parte6.sumaMatriz();
                break;
            case 5:
                Parte7 parte7=new Parte7();
                parte7.hallarCeros();
        }

    }
}
