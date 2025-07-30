package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_count = new int[10];
        int num = 1;

        while(true){
            num = sc.nextInt();
            if(num > 0 || num <= 10){
                num_count[num-1]++;
            } else {
                break;
            }
        }

        for(int i = 0 ; i < 10 ; i++){
            if(num_count[i] != 0){
                System.out.printf("%d : %d개\n", i+1, num_count[i]);
            }
        }
    }
}
