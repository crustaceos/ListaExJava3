package br.edu.up.classes;

public class MamaoAcucar {
    private Float Valor;
    private Float Calculo;

    public void dizerValor(Float Valor){
        this.Valor = Valor;
    }

    public void valorPrestacao(Float Valor){
        this.Calculo = this.Valor / 5;
    }

    public Float getCalculo() {
        return Calculo;
    }
}
