package br.edu.up;
import java.util.Scanner;
import br.edu.up.classes.MediaAluno;

public class exercicio1 {

    public static void executar(){

    Scanner leitor = new Scanner(System.in);
    MediaAluno mediaAluno = new MediaAluno();

    System.out.printf("Digite o nome do aluno: ");
    String nome = leitor.next();

    mediaAluno.nomeAluno(nome);

    float media = 0;

    for(int i = 0; i < 3; i++){
        System.out.printf("Digite a nota %d do aluno: ", i + 1);
        Float notas = leitor.nextFloat();
        mediaAluno.calculo(notas);

        media += notas;
    }

    System.out.printf("O aluno %s obteve a média %.2f", nome, media/3);

   

    



    }
}
