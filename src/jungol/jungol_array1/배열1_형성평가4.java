package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_형성평가4 {
    public static void main(String[] args) {
        int[] num_array = new int[100];
        Scanner sc = new Scanner(System.in);
        int last_index = 0;

        for(int i = 0 ; i < num_array.length ; i++){
            int num = sc.nextInt();
            if(num_array[i] == -1){
                last_index = i - 1;
                break;
            } else {
                num_array[i] = num;
                last_index = i;
            }
        }

        if(last_index < 2){
            for(int i = 0 ; i <= last_index ; i++ ){
                System.out.printf("%d ", num_array[i]);
            }
        } else {
            for(int i = last_index-2 ; i <= last_index ; i++){
                System.out.printf("%d ", num_array[i]);
            }
        }
    }
}
