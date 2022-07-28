package com.calculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int continuar;
        do {
            Calculadora operacion=new Calculadora();
            operacion.setOperandos(Integer.parseInt(JOptionPane.showInputDialog("Digite el primer operando")),Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo operando")));
            int oper;
            oper=JOptionPane.showOptionDialog(
                    null,"Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                    new Object[] { "Sumar", "Restar", "Multiplicar","Dividir" },"Sumar");
            switch (oper){
                case 0:
                    JOptionPane.showMessageDialog(null,"El resultado es: "+operacion.sumar());
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,"El resultado es: "+operacion.restar());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"El resultado es: "+operacion.multiplicar());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"El resultado es: "+operacion.dividir());
                    break;
                default:
                    System.out.println("Operacion invalida");
                    break;
            }

            continuar=JOptionPane.showConfirmDialog(null, "Quieres continuar?", "Continuacion",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        }while (continuar==0);
    }
}
