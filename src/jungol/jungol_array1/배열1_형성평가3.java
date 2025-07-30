package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_array = new int[10];
        int even_sum = 0;
        int odd_sum = 0;

        for(int i = 0 ; i < num_array.length ; i++){
            num_array[i] = sc.nextInt();
            if(i%2==0){
                odd_sum += num_array[i];
            } else {
                even_sum += num_array[i];
            }
        }

        System.out.printf("odd : %d \neven : %d", odd_sum, even_sum);
    }
}
