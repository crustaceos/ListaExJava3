package br.edu.up.classes;

public class Vendedor {

    private String nome;
    private Float salarioFixo;
    private Float vendas;

    public void dizerNome(String nome){
        this.nome = nome;
    }

    public void dizerSalario(Float salarioFixo){
        this.salarioFixo = salarioFixo;
    }

    public void dizerVendas(Float vendas){
        this.vendas = vendas;
    }

    
}
