package br.edu.up;
import java.util.Scanner;
import br.edu.up.classes.ConsumidorCarro;

public class exercicio7 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        ConsumidorCarro consumidorCarro = new ConsumidorCarro();

        System.out.printf("Digite o valor de fabrica do veículo: ");
        Float custo = leitor.nextFloat();
        consumidorCarro.dizerCusto(custo);

        System.out.printf("O valor final do veículo fica de: %.2f", consumidorCarro.getCalculoPorcento());
        
    }
}
