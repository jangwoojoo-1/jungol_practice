package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_형성평가8 {
    public static void main(String[] args) {
        int[] num_array = new int[100];
        Scanner sc = new Scanner(System.in);
        int mul_5 = 0;
        int sum = 0;

        for(int i = 0 ; i < num_array.length ; i++){
            num_array[i] = sc.nextInt();
            if(num_array[i] == 0){
                break;
            } else if (num_array[i]%5 == 0 && num_array[i] != 0) {
                mul_5++;
                sum += num_array[i];
            } else {
                continue;
            }
        }

        System.out.printf("Multiples of 5 : %d \nsum : %d \navg : %.1f", mul_5, sum, (double)sum/mul_5);
    }
}
