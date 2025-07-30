package jungol.jungol_array1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_행복1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = 2;
        Integer[] student_scores = new Integer[N];

        Arrays.sort(student_scores);

        System.out.println(student_scores[1]-student_scores[0]);

    }
}
