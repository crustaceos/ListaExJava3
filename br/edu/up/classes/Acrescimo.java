package br.edu.up.classes;

public class Acrescimo {
    
    private Float Valor;
    private Float Porcento;
    private Float Calculo;


    public void dizerValor(Float Valor){
        this.Valor = Valor;
    }

    public void dizerPorcento(Float Porcento){
        this.Porcento = Porcento;
    }

    public Float getCalculo(){
        return this.Calculo = Valor + (this.Valor *(this.Porcento / 100));
    }
}
