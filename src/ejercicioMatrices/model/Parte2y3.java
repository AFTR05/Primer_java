package ejercicioMatrices.model;

import javax.swing.*;

public class Parte2y3 {
    /*Hacer un algoritmo que llene una matriz de 5 * 5 y determine la posición [fila,columna] del número
    mayor almacenado en la matriz. Asuma que todos los números ingresados son diferentes.*/
    int matriz[][] = new int[5][5];

    public void llenarMatriz() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor para la posición (" + i + "," + j + ")"));
            }
        }
    }

    public void numeroMayorPos() {
        int mayor = 0;
        int fiMayor = 0;
        int columnMayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0 && j == 0) {
                    mayor = matriz[i][j];
                    fiMayor = i;
                    columnMayor = j;
                } else if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    fiMayor = i;
                    columnMayor = j;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El numero mayor del arreglo es: " + mayor + " el cual se encuentro en la posicion: (" + fiMayor + "," + columnMayor + ")");
    }

    public void sumaDiagonal() {
        int sumDiagonal=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    sumDiagonal += matriz[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null,"La suma de la diagonal del arreglo es: "+sumDiagonal);
    }
}
