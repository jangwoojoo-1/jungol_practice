package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_형성평가8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[][] num_arr = new Integer[4][2];
        int[] length_total = new int[2];

        for (int i = 0; i < num_arr.length; i++) {
            for (int j = 0; j < num_arr[i].length; j++) {
                num_arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < num_arr.length; i++) {
            int width_total = 0;
            for (int j = 0; j < num_arr[i].length; j++) {
                width_total += num_arr[i][j];
                length_total[j] += num_arr[i][j];
            }
            System.out.print((int)width_total/num_arr[i].length + " ");
        }
        System.out.println();

        for (int i : length_total) {
            System.out.print(i/num_arr.length + " ");
        }
        System.out.println();

        int total = 0;
        for (int i : length_total) {
            total += i;
        }
        System.out.println(total/(num_arr.length * num_arr[0].length));

    }
}
