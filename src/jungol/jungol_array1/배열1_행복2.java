package jungol.jungol_array1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_행복2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        Integer[] student_scores = new Integer[N];

        for (int i = 0 ; i < N ; i++){
            student_scores[i] = sc.nextInt();
        }

        Arrays.sort(student_scores);

        for (Integer studentScore : student_scores) {
            System.out.print(studentScore + " ");
        }
    }
}
