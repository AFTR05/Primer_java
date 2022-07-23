package co.edu.cue.firstproyect;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora= new Calculadora();
        calculadora.sumar(2,2);
        int resultado=calculadora.restar(0,2);
        System.out.println("el resultado es: "+resultado );

    }
}