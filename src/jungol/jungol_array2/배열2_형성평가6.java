package jungol.jungol_array2;

public class 배열2_형성평가6 {

    public static void main(String[] args) {
        //배열 선언
        int[][] matrix = new int[5][5];

        //초기화
        for (int i = 0 ; i < matrix[0].length ; i = i+2){
            matrix[0][i] = 1;
        }

        //값 채우기 연산
        for(int i = 1 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                if(j == 0){
                    matrix[i][j] = matrix[i-1][j+1];
                } else if(j == matrix[i].length-1){
                    matrix[i][j] = matrix[i-1][j-1];
                } else {
                    matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j+1];
                }
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
