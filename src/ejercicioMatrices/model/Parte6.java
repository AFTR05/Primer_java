package ejercicioMatrices.model;

import javax.swing.*;

public class Parte6 {
    Funciones funcion1=new Funciones();
    int matriz1[][]= funcion1.llenarMatriz();
    Funciones funcion2=new Funciones();
    int matriz2[][]= funcion2.llenarMatriz();

    int matriz3[][]=new int[matriz1.length][matriz1[0].length];


    public void sumaMatriz(){
        String message="";
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz3[i][j]=(matriz1[i][j]+matriz2[i][j]);
            }
        }
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                message+="|"+matriz3[i][j] + "|  ";
                if (j==(matriz3[i].length-1)){
                    message+="\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null,message);
    }

}
