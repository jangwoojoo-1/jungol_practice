package jungol.jungol_array2;

public class 배열2_자가진단4 {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 8, 10, 6, 4},
                {11, 20, 1, 13, 2},
                {7, 9, 14, 22, 3}
        };

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                System.out.printf("%2d   ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
