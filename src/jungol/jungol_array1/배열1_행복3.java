package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_행복3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] student_scores = new int[N];
        int min = 100;
        int max = 0;


        for (int i = 0 ; i < N ; i++){
            student_scores[i] = sc.nextInt();
            if (student_scores[i] < min){
                min = student_scores[i];
            } else if (student_scores[i] > max) {
                max = student_scores[i];
            } else {
                continue;
            }
        }

        System.out.println(max-min);

    }
}
