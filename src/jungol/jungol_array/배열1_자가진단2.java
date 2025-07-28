package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num_array = new int[10];

        for(int i = 0 ; i < 10 ; i++){
            num_array[i] = i + 1;
        }

        for(int i = 0 ; i < 10 ; i++){
            System.out.printf("%d ", num_array[i]);
        }

    }
}
