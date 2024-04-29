package br.edu.up.classes;

public class Idades {
    private int Quant;

    public void dizerQuant(int Quant){
        this.Quant = Quant;
    }

    private int[] Idades = new int[Quant];

    public void dizerIdades(int idades[]){
        this.Idades = idades;
    }


    public String Resultado(){
        for(int idade : Idades){
            if(idade >= 18){
                return String.format("A pessoa é maior de idade\n");
            }
            else if (idade < 18){
                return String.format("A pessoa é menor de idade\n");
            }
        }
        return null;
        
    }
    
}
