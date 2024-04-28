package br.edu.up;
import java.util.Scanner;

import br.edu.up.classes.MediaSemestre;

public class exercicio8 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        MediaSemestre mediaSemestre = new MediaSemestre();

        System.out.printf("Digite o nome do aluno: ");
        String nome = leitor.next();
        mediaSemestre.dizerNome(nome);

        System.out.printf("Digite a primeira nota do aluno: ");
        Float nota1 = leitor.nextFloat();
        mediaSemestre.dizerNota1(nota1);

        System.out.printf("Digite o nome do aluno: ");
        Float nota2 = leitor.nextFloat();
        mediaSemestre.dizerNota2(nota2);

        System.out.printf("Digite o nome do aluno: ");
        Float nota3 = leitor.nextFloat();
        mediaSemestre.dizerNota3(nota3);

        System.out.printf("%s", mediaSemestre.Resultado());
        
    }
}
