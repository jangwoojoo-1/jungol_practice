package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_행복2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] student_scores = new int[N];
        //int min = 100;
        //int max = 0;


        for (int i = 0 ; i < N ; i++){
            student_scores[i] = sc.nextInt();
        }

        for (int i = 0 ; i < N-1 ; i++){
            for (int j = 0 ; j < N-1-i ; j++){
                if(student_scores[j]>student_scores[j+1]){
                    int temp = student_scores[j];
                    student_scores[j] = student_scores[j+1];
                    student_scores[j+1] = temp;
                }
            }
        }

        System.out.println(student_scores[N-1]-student_scores[0]);

    }
}
