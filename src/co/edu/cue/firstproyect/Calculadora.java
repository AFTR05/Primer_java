package co.edu.cue.firstproyect;

public class Calculadora {
    int operando1;
    int operando2;

    public void sumar(int operando1,int operando2){
        System.out.println("La sumas es: "+(operando1+operando2));
    }

    public int restar(int operando1,int operando2){
        return (operando1-operando2);
    }

    public Calculadora(int operando1,int operando2){
        this.operando1=operando1;
        this.operando2=operando2;
    }

    public Calculadora(){

    }
}
