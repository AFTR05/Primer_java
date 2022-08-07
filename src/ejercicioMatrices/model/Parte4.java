package ejercicioMatrices.model;
//inverso de matriz

import javax.swing.*;

public class Parte4 {
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

    public void inversoMatriz() {
        String messageInvers="";
        JOptionPane.showMessageDialog(null, "Este sera la matriz inversa de la matriz digitada anteriormente");
        for (int i = 0; i < inversMatriz.length; i++) {
            for (int j = 0; j < inversMatriz[i].length; j++) {
                messageInvers+="|"+inversMatriz[i][j] + "|  ";
                if (j==(inversMatriz[i].length-1)){
                    messageInvers+="\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null,messageInvers);
    }
}
