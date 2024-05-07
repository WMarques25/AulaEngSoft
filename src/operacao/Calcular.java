package com.operacao;

public class Calcular {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora(new Subtracao());

        calculadora.setA(10);
        calculadora.setB(5);

        System.out.println("\nResultado: " + calculadora.Calculo());
    }
}
