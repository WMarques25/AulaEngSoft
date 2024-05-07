package com.operacao;

public class Calculadora {
    private IOperacao oper;

    private int a;
    private int b;

    public Calculadora(IOperacao oper) {
        this.oper = oper;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    int Calculo(){
        return oper.Operacao(this.a, this.b);
    }

}
