package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] student_score = new int[4][4];

        for(int i = 0 ; i < student_score.length-1 ; i++){
            System.out.printf("%d번째 학생의 점수 ", i+1);
            for(int j = 0 ; j < student_score[i].length-1 ; j++){
                student_score[i][j] = sc.nextInt();
            }
        }

        System.out.println("     국어 영어 수학 총점");
        for (int i = 0 ; i < student_score.length-1 ; i++){
            System.out.printf(" %d번", i+1);
            int total = 0;
            for (int j = 0 ; j < student_score[i].length-1 ; j++){
                System.out.printf("%4d", student_score[i][j]);
                total += student_score[i][j];
            }

            System.out.printf("%4d\n", total);
        }
        System.out.print("합계");
        for (int i = 0 ; i < student_score[i].length ; i++){
            int total = 0;
            for (int j = 0 ; j < student_score.length ; j++){
                total += student_score[j][i];
            }
            System.out.printf("%4d", total);
        }

    }
}
