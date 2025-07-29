package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_형성평가5 {
    public static void main(String[] args) {
        double[] weights = new double[6];
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        for (int i = 0 ; i < 6 ; i++){
            weights[i] = sc.nextDouble();
        }

        for (int i = 0 ; i < 6 ; i++){
            total += weights[i];
        }

        System.out.printf("%.1f ", total/6);
    }
}
