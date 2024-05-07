package com.curso;

public class Geometrica implements ICalcMedia {

    @Override
    public double calcular(double p1, double p2) {
        return Math.sqrt(p1*p2);
    }

    @Override
    public String situacao(double media) {
        if(media < 7.0){
            return "Reprovado!";
        } else {
            return "Aprovado!";
        }
    }
    
}
