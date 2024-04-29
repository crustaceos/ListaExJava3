package br.edu.up;
import java.util.Scanner;
import br.edu.up.classes.Idades;

public class exercicio10 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        Idades idades = new Idades();

        System.out.printf("Digite a quantidade de pessoas: ");
        int quant = leitor.nextInt();
        idades.dizerQuant(quant);

        int [] idade = new int [quant];

        for(int i = 0; i < quant; i++){
            System.out.printf("Digite a idade: ");
            idade[i] = leitor.nextInt();
            idades.dizerIdades(idade);

            System.out.printf("%s", idades.Resultado());
        }

    }
}
