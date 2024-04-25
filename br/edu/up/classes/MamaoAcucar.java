package br.edu.up.classes;

public class MamaoAcucar {
    private Float Valor;
    private Float Calculo;

    public void dizerValor(Float Valor){
        this.Valor = Valor;
    }

    public Float getCalculo(){
        return this.Calculo = this.Valor / 5;
    }

    
}
