package br.edu.up.classes;

public class MediaSemestre {
    private String Nome;
    private Float Nota1;
    private Float Nota2;
    private Float Nota3;

    public void dizerNome(String Nome){
        this.Nome = Nome;
    }
    
    public void dizerNota1(Float Nota1){
        this.Nota1 = Nota1;
    }
    
    public void dizerNota2(Float Nota2){
        this.Nota2 = Nota2;
    }

    public void dizerNota3(Float Nota3){
        this.Nota3 = Nota3;
    }

    public String Resultado(){
        Float Calculo = (this.Nota1 + this.Nota2 + this.Nota3) / 3;

        if(Calculo >= 7){
            return String.format("O aluno %s está dentro da média com a média %.2f", this.Nome, Calculo);
        }
        else if((Calculo >= 5.1f) && (Calculo <= 6.9f)){
            return String.format("O aluno %s está em recuperação com a média %.2f", this.Nome, Calculo);
        }
        else{
            return String.format("O aluno %s está reprovado com a média %.2f", this.Nome, Calculo);
        }
    }
}
