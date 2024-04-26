package br.edu.up;
import java.util.Scanner;
import br.edu.up.classes.Acrescimo;

public class exercicio6 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        Acrescimo acrescimo = new Acrescimo();

        System.out.printf("Digite o valor do produto: ");
        Float valor = leitor.nextFloat();
        acrescimo.dizerValor(valor);

        System.out.printf("Digite o percentual de acréscimo do produto: ");
        Float porcento = leitor.nextFloat();
        acrescimo.dizerPorcento(porcento);

        System.out.printf("O valor com o acréscimo é de: %.2f", acrescimo.getCalculo());

    }
}
