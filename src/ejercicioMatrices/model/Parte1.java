package ejercicioMatrices.model;

import javax.swing.*;

public class Parte1 {
    int matriz[][];


    public void llenarMatriz() {
        int fi= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de filas de la matriz"));
        int column=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de columnas de la matriz"));
        matriz= new int[fi][column];
        System.out.println("columnas: "+matriz[0].length);
        System.out.println("filas: "+matriz.length);

        for (int i = 0; i < fi; i++) {
            for (int j = 0; j < column; j++) {
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor para la posición ("+i+","+j+")"));
            }
        }
    }

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
