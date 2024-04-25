package br.edu.up;
import java.util.Scanner;
import br.edu.up.classes.Conversao;

public class exercicio4 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        Conversao conversao = new Conversao();

        System.out.printf("Digite a cotação atual do dólar: ");
        Float cotacao = leitor.nextFloat();
        conversao.dizerCotacao(cotacao);

        System.out.printf("Digite a quantidade que voce possui em dólares: ");
        Float quantidade = leitor.nextFloat();
        conversao.dizerQuantidade(quantidade);

        Float calculo = cotacao * quantidade;

        System.out.printf("O valor em dólares convertido para real é de: %.2f", calculo);


    }
    
}
