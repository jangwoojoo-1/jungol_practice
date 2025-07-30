package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_연습문제6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[][] student_score = new Integer[3][3];

        for(int i = 0 ; i < student_score.length ; i++){
            System.out.printf("%d번째 학생의 점수 ", i+1);
            for(int j = 0 ; j < student_score[i].length ; j++){
                student_score[i][j] = sc.nextInt();
            }
        }

        int total = 0;
        int[] subject_total = new int[3];

        System.out.println("     국어 영어 수학 총점");
        for (int i = 0 ; i < student_score.length ; i++){
            System.out.printf(" %d번", i+1);
            int student_total = 0;
            for (int j = 0 ; j < student_score[i].length ; j++){
                System.out.printf("%4d", student_score[i][j]);
                student_total += student_score[i][j];
                subject_total[j] += student_score[i][j];
            }
            System.out.printf("%4d\n", student_total);
            total += student_total;
        }

        System.out.print("합계");
        for (int i = 0 ; i < subject_total.length ; i++){
            System.out.printf("%4d", subject_total[i]);
        }
        System.out.printf("%4d", total);

    }
}
