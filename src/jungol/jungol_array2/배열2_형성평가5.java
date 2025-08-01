package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_형성평가5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[][] class_count = new Integer[4][3];

        for (int i = 0; i < class_count.length; i++) {
            System.out.printf("%dclass? ", i+1);
            for (int j = 0; j < class_count[i].length; j++) {
                class_count[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < class_count.length; i++) {
            System.out.printf("%dclass : ", i+1);
            int class_total = 0;
            for (int j = 0; j < class_count[i].length; j++) {
                class_total += class_count[i][j];
            }
            System.out.println(class_total);
        }

    }
}
