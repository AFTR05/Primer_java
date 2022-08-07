package ejercicioMatrices.model;

import javax.swing.*;

public class Funciones {
    int matriz[][];
    int filas;
    int columnas;

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int[][] llenarMatriz(){
        int filas= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de filas de la matriz"));
        int columnas=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de columnas de la matriz"));
        matriz= new int[filas][columnas];
        System.out.println("columnas: "+matriz[0].length);
        System.out.println("filas: "+matriz.length);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor para la posición ("+i+","+j+")"));
            }
        }
        return matriz;
    }


}
