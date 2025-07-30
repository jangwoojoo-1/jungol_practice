package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_자가진단7 {

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[5][5];

        for(int i = 0 ; i < matrix[0].length ; i++){
            matrix[0][i] = 1;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == 0){
                    continue;
                } else if (j == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
                }
            }
        }

        for (Integer[] ints : matrix) {
            for (int anInt : ints){
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }
    }
}
