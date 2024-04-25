package br.edu.up;
import java.util.Scanner;

import br.edu.up.classes.ConsumoCarro;
import br.edu.up.classes.MediaAluno;

public class exercicio2 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);
        ConsumoCarro Carro = new ConsumoCarro();




        System.out.printf("Digite a distância percorrida em KM pelo carro: ");
        float distanciaCarro = leitor.nextFloat();
        Carro.dizerDistancia(distanciaCarro);

        System.out.printf("Digite quando de combustível foi gasto para percorrer essa distância: ");
        float consumoCarro = leitor.nextFloat();
        Carro.dizerCombustivel(consumoCarro);

        float mediaConsumo = distanciaCarro / consumoCarro;

        System.out.printf("A quantidade de combustível gasta por KM é de: %f", mediaConsumo);





    }
    
}
