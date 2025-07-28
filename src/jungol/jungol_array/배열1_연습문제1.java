package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = 0 ; i < 5 ; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i = 0 ; i < 5 ; i++){
            System.out.printf("%d ", numbers[i]);
        }
    }
}
