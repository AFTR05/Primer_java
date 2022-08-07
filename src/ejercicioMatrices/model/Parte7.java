package ejercicioMatrices.model;

import javax.swing.*;

public class Parte7{
    Funciones funciones=new Funciones();
    int matriz[][]=funciones.llenarMatriz();
    public void hallarCeros(){
        int contadorcerosColumnas[]=new int[matriz[0].length];
        int contadorcerosFilas[]=new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                contadorcerosColumnas[j] = 0;
                contadorcerosFilas[i] = 0;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]==0){
                    contadorcerosColumnas[j]+=1;
                    contadorcerosFilas[i]+=1;
                }
            }
        }
        String messageFilas="";
        String messageColumnas="";
        for (int i = 0; i < matriz.length; i++) {
            messageColumnas+="En la columna "+ i +" hay : "+contadorcerosColumnas[i]+" ceros \n";
            messageFilas+="En la fila "+i+" hay: "+contadorcerosFilas[i]+" ceros \n";
        }
        JOptionPane.showMessageDialog(null,"Filas \n \n"+messageFilas);
        JOptionPane.showMessageDialog(null,"Columnas \n \n"+messageColumnas);
    }

}
