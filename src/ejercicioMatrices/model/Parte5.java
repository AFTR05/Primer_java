package ejercicioMatrices.model;

import javax.swing.*;

public class Parte5 {
    int matriz[][];
    int inversMatriz[][];

    public void llenarMatrizInverso() {
        int fi = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de filas de la matriz"));
        int column = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de columnas de la matriz"));
        matriz = new int[fi][column];
        inversMatriz = new int[column][fi];
        System.out.println("columnas: " + matriz[0].length);
        System.out.println("filas: " + matriz.length);
        for (int i = 0; i < fi; i++) {
            for (int j = 0; j < column; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor para la posición (" + i + "," + j + ")"));
                inversMatriz[j][i] = matriz[i][j];
            }
        }
    }

    public void hallarSimetria() {
        boolean simetria=true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j]!=inversMatriz[j][i]){
                    simetria=false;
                }
            }
        }
        if (simetria){
            JOptionPane.showMessageDialog(null,"El arreglo es simetrico");
        } else {
            JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
        }


    }
}