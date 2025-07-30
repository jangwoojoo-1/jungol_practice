package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_array = new int[100];
        int num = 1;
        int finish_index = 0;

        for (int i = 0 ; i < num_array.length ; i++){
            if(num != 0){
                num = sc.nextInt();
                num_array[i] = num;
            } else {
                finish_index = i;
                break;
            }
        }

        for (int i = 1 ; i <= finish_index ; i = i + 2){
            System.out.printf("%d ", num_array[i]);
        }
    }
}
