package jungol.jungol_array1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_행복3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] student_scores = new int[N];

        for (int i = 0 ; i < N ; i++){
            student_scores[i] = sc.nextInt();
        }

        Arrays.sort(student_scores);

        System.out.println(student_scores[N-1]-student_scores[0]);

    }
}
