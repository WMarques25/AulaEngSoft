package com.curso;

public class Aritmetica implements ICalcMedia {

    @Override
    public double calcular(double p1, double p2) {
        return (p1+p2)/2;
    }

    @Override
    public String situacao(double media) {
        if(media < 5.0){
            return "Reprovado!";
        } else {
            return "Aprovado!";
        }
    }
    
}
