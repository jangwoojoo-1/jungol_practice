package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_형성평가9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        while(n <= 0 || n > 10){
            n = sc.nextInt();
        }

        int[][] pascal = new int[n][n];

        pascal[n-1][0] = 1;

        for(int i = n-2 ; i >= 0 ; i--){
            for (int j = 0; j < pascal[i].length; j++) {
                if(j == 0){
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i+1][j] + pascal[i+1][j-1];
                }
            }
        }

        for (int[] ints : pascal) {
            for (int anInt : ints) {
                if(anInt != 0 ){
                    System.out.print(anInt + " ");
                }
            }
            System.out.println();
        }
    }
}
