package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num_array = new int[10];

        for(int i = 0 ; i < num_array.length ; i++){
            num_array[i] = sc.nextInt();
        }

        System.out.printf("%d %d %d", num_array[2], num_array[4], num_array[9]);

    }
}
