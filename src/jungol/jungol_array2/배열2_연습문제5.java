package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_연습문제5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[][] matrix1 = new Integer[3][3];
        Integer[][] matrix2 = new Integer[3][3];
        
        for(int i = 0 ; i < matrix1.length ; i++){
            System.out.printf("첫 번째 배열 %d행 ", i+1);
            for(int j = 0 ; j < matrix1[i].length ; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < matrix2.length ; i++){
            System.out.printf("두 번째 배열 %d행 ", i+1);
            for(int j = 0 ; j < matrix2[i].length ; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i < matrix1.length ; i++){
            for(int j = 0 ; j < matrix1[i].length ; j++){
                System.out.printf("%d ", matrix1[i][j]+matrix2[i][j]);
            }
            System.out.println();
        }
    }
}
