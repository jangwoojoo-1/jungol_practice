package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] computer_score = new int[10];
        int total = 0;

        for(int i = 0 ; i < computer_score.length  ; i++){
            computer_score[i] = sc.nextInt();
            total += computer_score[i];
        }

        System.out.printf("총점 = %d \n평균 = %.1f ", total, total/10.0);

    }
}
