package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_자가진단9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_array = new int[10];

        for(int i = 0 ; i < 10 ; i++){
            num_array[i] = sc.nextInt();
        }

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9-i ; j++){
                if(num_array[j] < num_array[j+1]){
                    int temp = num_array[j];
                    num_array[j] = num_array[j+1];
                    num_array[j+1] = temp;
                }
            }
        }

        for(int i = 0 ; i < 10 ; i++){
            System.out.print(num_array[i] + " ");
        }
    }
}
