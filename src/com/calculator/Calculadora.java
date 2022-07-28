package com.calculator;

public class Calculadora {
    private float operando1;
    private float operando2;

    public float sumar(){
        return operando1+operando2;
    }

    public float restar(){
        return operando1-operando2;
    }

    public float dividir(){
        return operando1/operando2;
    }

    public float multiplicar(){
        return operando1*operando2;
    }

    public float getOperando1() {
        return operando1;
    }

    public void setOperando1(float operando1) {
        this.operando1 = operando1;
    }

    public float getOperando2() {
        return operando2;
    }

    public void setOperando2(float operando2) {
        this.operando2 = operando2;
    }

    public void setOperandos(float operando1,float operando2){
        this.operando1=operando1;
        this.operando2=operando2;
    }
}

