package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[2][4];
        int[][] matrix2 = new int[2][4];

        System.out.println("first array");
        for(int i = 0 ; i < matrix1.length ; i++){
            for(int j = 0 ; j < matrix1[i].length ; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("second array");
        for(int i = 0 ; i < matrix2.length ; i++){
            for(int j = 0 ; j < matrix2[i].length ; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i < matrix1.length ; i++){
            for(int j = 0 ; j < matrix1[i].length ; j++){
                System.out.printf("%d ", matrix1[i][j]*matrix2[i][j]);
            }
            System.out.println();
        }
    }
}
