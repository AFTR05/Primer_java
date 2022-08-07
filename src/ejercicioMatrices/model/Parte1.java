package ejercicioMatrices.model;

import javax.swing.*;

public class Parte1 {

    Funciones funciones=new Funciones();
    int matriz[][]= funciones.llenarMatriz();
    public void hallarMayor() {
        int mayor=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i==0 && j==0){
                    mayor=matriz[i][j];
                } else if (matriz[i][j]>mayor){
                    mayor=matriz[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null,"El numero mayor de la matriz es: "+mayor);

    }
}
