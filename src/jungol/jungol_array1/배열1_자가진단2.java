package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num_array = new int[10];

        for(int i = 0 ; i < num_array.length ; i++){
            num_array[i] = i + 1;
        }

        for(int i = 0 ; i < num_array.length ; i++){
            System.out.printf("%d ", num_array[i]);
        }

    }
}
