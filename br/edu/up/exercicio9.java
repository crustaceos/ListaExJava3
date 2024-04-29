package br.edu.up;
import java.util.Scanner;
import br.edu.up.classes.LerVariosNum;

public class exercicio9 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        LerVariosNum lerVarios = new LerVariosNum();
        int[] nums = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o %d numer0: ", i + 1);
            nums[i] = leitor.nextInt();
            lerVarios.dizerNums(nums);
        }
        
    }
}
