package br.edu.up.classes;

public class LerVariosNum {
    private int[] nums = new int[5];

    public void dizerNums(int[] nums){
        this.nums = nums;
    }

    public String Resultado(){
        int n = 0;
        for (int num : nums) {
            if ((num < 10) && (num > 150)) {
                n++;
            }
        }
        return String.format("A quantidade de numeros fora do intervalo 10 a 150 é de %d", n);
    }
}
