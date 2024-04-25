package br.edu.up;
import java.util.Scanner;
import br.edu.up.classes.Vendedor;

public class exercicio3 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);
        Vendedor vendedor = new Vendedor();

        System.out.printf("DIgite o nome do vendedor: ");
        String nome = leitor.next();
        vendedor.dizerNome(nome);

        System.out.printf("Digite o salario do vendedor: ");
        Float salario = leitor.nextFloat();
        vendedor.dizerSalario(salario);

        System.out.printf("Digite a quantidade de vendas do vendedor: ");
        Float vendas = leitor.nextFloat();
        vendedor.dizerVendas(vendas);

        Float porcento =  (vendas * 0.15f);

        System.out.printf("O vendedor %s com o salario fixo %.2f recebeu %.2f esse mes", nome, salario, salario + porcento);




    }
    
}
