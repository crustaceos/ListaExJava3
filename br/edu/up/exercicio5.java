package br.edu.up;
import java.util.Scanner;
import br.edu.up.classes.MamaoAcucar;


public class exercicio5 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        MamaoAcucar mamao = new MamaoAcucar();

        System.out.printf("Digite o valor a ser pago: ");
        Float valor = leitor.nextFloat();
        mamao.dizerValor(valor);

        mamao.valorPrestacao(valor);

        System.out.printf("O valor divido em 5 prestações fica: %.2f", mamao.getCalculo());
    }
    
}
