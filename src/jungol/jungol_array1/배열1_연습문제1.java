package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = sc.nextInt();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
