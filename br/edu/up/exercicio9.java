package br.edu.up;
import java.util.Scanner;
import br.edu.up.classes.LerVariosNum;

public class exercicio9 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        LerVariosNum lerVarios = new LerVariosNum();
        int[] nums = new int[80];

        for(int i = 0; i < 80; i++){
            System.out.printf("Digite o %d numero: ", i + 1);
            nums[i] = leitor.nextInt();
            lerVarios.dizerNums(nums);
        }

        System.out.printf("%s", lerVarios.Resultado());
        
    }
}
