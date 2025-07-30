package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_연습문제3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num_array = new int[10];

        for(int i = 0 ; i < num_array.length ; i++){
            num_array[i] = sc.nextInt();
        }

        //System.out.printf("%d %d %d", num_array[2], num_array[4], num_array[9]);
        for (int i = 0; i < num_array.length; i++) {
            if(i == 2 || i == 4 || i == 9){
                System.out.printf("%d ", num_array[i]);
            }

        }
    }
}
