package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_형성평가5 {
    public static void main(String[] args) {
        double[] weights = new double[6];
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        for (int i = 0 ; i < weights.length ; i++){
            weights[i] = sc.nextDouble();
        }

        for (int i = 0 ; i < weights.length ; i++){
            total += weights[i];
        }

        System.out.printf("%.1f ", total/6);
    }
}
