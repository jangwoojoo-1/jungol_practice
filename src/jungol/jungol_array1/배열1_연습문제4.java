package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_연습문제4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num_array = new int[100];
        int repeat = 0;

        while(repeat < 100){
            int num = sc.nextInt();
            if(num != 0){
                num_array[repeat] = num;
                repeat++;
            } else {
                break;
            }
        }

        for (int i = 1 ; i < repeat ; i = i + 2){
            System.out.printf("%d ", num_array[i]);
        }
    }
}
