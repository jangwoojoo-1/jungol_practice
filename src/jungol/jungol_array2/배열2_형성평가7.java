package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_형성평가7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[2][3];
        int[][] mulMatrix = new int[2][3];

        System.out.println("first array");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("second array");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mulMatrix.length; i++) {
            for (int j = 0; j < mulMatrix[i].length; j++) {
                mulMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
                System.out.print(mulMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
