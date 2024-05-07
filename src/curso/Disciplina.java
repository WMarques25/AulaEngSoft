package com.curso;

public class Disciplina {
    private ICalcMedia CalcMedia;
    private double media, p1, p2;
    private String situacao, nome;

    public Disciplina(ICalcMedia calcMedia) {
        CalcMedia = calcMedia;
    }

    public void CalcularMedia(){
        media = CalcMedia.calcular(p1, p2);
        situacao = CalcMedia.situacao(media);
    }

    public ICalcMedia getCalcMedia() {
        return CalcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        CalcMedia = calcMedia;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    
}
