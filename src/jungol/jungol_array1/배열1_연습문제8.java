package jungol.jungol_array1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_연습문제8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] computer_score = new Integer[10];

        for(int i = 0 ; i < computer_score.length  ; i++){
            computer_score[i] = sc.nextInt();
        }

        int total = 0;
        for (Integer i : computer_score) {
            total += i;
        }

        System.out.printf("총점 = %d \n평균 = %.1f ", total, (double)total/computer_score.length);

    }
}
