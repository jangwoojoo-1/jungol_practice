package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_arr = new int[10];

        while (true){
            int n = sc.nextInt();
            if(n != 0){
                num_arr[n%10]++;
            } else {
                break;
            }
        }

        for (int i = 0; i < num_arr.length; i++) {
            if(num_arr[i] != 0){
                System.out.printf("%d : %d개\n", i, num_arr[i]);
            } else {
              continue;
            }

        }
    }
}
