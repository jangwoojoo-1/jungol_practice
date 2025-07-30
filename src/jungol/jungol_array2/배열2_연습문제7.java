package jungol.jungol_array2;

public class 배열2_연습문제7 {
    public static void main(String[] args) {
        int[][] pascal_triangle = new int[5][5];
        pascal_triangle[0][0] = 1;

        for(int i = 0 ; i < pascal_triangle.length ; i++){
            for(int j = 0 ; j <= i ; j++){
                if(i == 0){
                    continue;
                } else if (j == 0) {
                    pascal_triangle[i][j] = 1;
                } else {
                        pascal_triangle[i][j] = pascal_triangle[i-1][j] + pascal_triangle[i-1][j-1];
                }
            }
        }

        for (int[] ints : pascal_triangle) {
            for (int anInt : ints) {
                if(anInt != 0){
                    System.out.printf("%d ", anInt);
                } else {
                    continue;
                }
            }
            System.out.println();
        }
    }
}
