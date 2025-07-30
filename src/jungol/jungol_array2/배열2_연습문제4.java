package jungol.jungol_array2;

public class 배열2_연습문제4 {
    public static void main(String[] args) {
        Integer[][] matrix = {{3, 5, 4}, {2, 6, 7}, {8, 10, 1}};

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
