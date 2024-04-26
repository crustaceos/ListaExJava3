package br.edu.up.classes;

public class ConsumidorCarro {

    private Float Custo;
    private Float CalculoImpostos;
    private Float CalculoPorcento;

    public void dizerCusto(Float Custo){
        this.Custo = Custo;
    }

    public Float getCalculoImpostos(){
        return this.CalculoImpostos = this.Custo + (this.Custo * 0.45f);
    }

    public Float getCalculoPorcento(){
        return this.CalculoPorcento = this.Custo + (this.CalculoImpostos * 0.28f);
    }

}
