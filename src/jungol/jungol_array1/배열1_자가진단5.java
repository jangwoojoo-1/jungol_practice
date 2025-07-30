package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_자가진단5 {
    public static void main(String[] args) {
        double[] class_avg_score = {85.6, 79.5, 83.1, 80.0, 78.2, 75};

        Scanner sc = new Scanner(System.in);
        int class1 = sc.nextInt() - 1;
        int class2 = sc.nextInt() - 1;

        System.out.printf("%.1f", (class_avg_score[class1]+class_avg_score[class2]));
    }
}
