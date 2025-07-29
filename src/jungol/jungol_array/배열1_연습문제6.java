package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_연습문제6 {
    public static void main(String[] args) {
        int[] num_array = new int[10];
        Scanner sc = new Scanner(System.in);
        int maxValue = 0;

        for(int i = 0 ; i < 10 ; i++){
            num_array[i] = sc.nextInt();
        }

        for(int i = 0 ; i < 10 ; i++){
            if(num_array[i] > maxValue){
                maxValue = num_array[i];
            }
        }

        System.out.println(maxValue);
    }
}
