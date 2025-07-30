package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_형성평가2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] student_score = new Integer[100];
        int[] score_distribution = new int[11];

        for(int i = 0 ; i < student_score.length ; i++){
            int n = sc.nextInt();

            if (n == 0 ){
                break;
            } else if (n>100 || n<0) {
                while(n>100 || n<0){
                    n = sc.nextInt();
                }
            } else {
                score_distribution[n/10]++;
            }
        }

        for(int i = score_distribution.length-1 ; i >= 0 ; i--){
            if(score_distribution[i] != 0) System.out.printf("%d : %d person\n", i*10, score_distribution[i]);
            else continue;
        }
    }
}
