package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_자가진단6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[][] student_scores = new Integer[5][4];
        Double[] student_avg = new Double[5];

        for (int i = 0; i < student_scores.length; i++) {
            int total = 0;
            for (int j = 0; j < student_scores[i].length; j++) {
                student_scores[i][j] = sc.nextInt();
                total += student_scores[i][j];
            }
            student_avg[i] = total/4.0;
        }

        int count = 0;
        for (double v : student_avg) {
            if(v >= 80){
                System.out.println("pass");
                count++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.printf("Successful : %d", count);
    }
}
