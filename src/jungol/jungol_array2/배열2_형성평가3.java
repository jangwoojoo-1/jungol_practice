package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_형성평가3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num_arr = new int[10];

        num_arr[0] = sc.nextInt();
        num_arr[1] = sc.nextInt();

        for(int i = 0 ; i < num_arr.length-2 ; i++){
            num_arr[i+2] = (num_arr[i] + num_arr[i+1])%10;
        }

        for (int i : num_arr) {
            System.out.print(i + " ");
        }

    }
}
