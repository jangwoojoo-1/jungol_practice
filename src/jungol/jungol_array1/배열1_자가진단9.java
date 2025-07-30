package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_자가진단9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_array = new int[10];

        for(int i = 0 ; i < num_array.length ; i++){
            num_array[i] = sc.nextInt();
        }

        for(int i = 0 ; i < num_array.length-1 ; i++){
            for(int j = 0 ; j < num_array.length-i-1 ; j++){
                if(num_array[j] < num_array[j+1]){
                    int temp = num_array[j];
                    num_array[j] = num_array[j+1];
                    num_array[j+1] = temp;
                }
            }
        }

        for(int i = 0 ; i < num_array.length ; i++){
            System.out.print(num_array[i] + " ");
        }
    }
}
