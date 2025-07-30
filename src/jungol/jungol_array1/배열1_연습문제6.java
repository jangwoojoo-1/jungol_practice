package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_연습문제6 {
    public static void main(String[] args) {
        int[] num_array = new int[10];
        Scanner sc = new Scanner(System.in);
        int maxValue = 0;

        for(int i = 0 ; i < num_array.length ; i++){
            num_array[i] = sc.nextInt();
            if(num_array[i] <= 0){
                while(num_array[i] <= 0){
                    num_array[i] = sc.nextInt();
                }
            }
            if(maxValue < num_array[i]){
                maxValue = num_array[i];
            }
        }

        System.out.println(maxValue);
    }
}
