package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_자가진단6 {
    public static void main(String[] args) {
        int[] num_array = new int[10];
        Scanner sc = new Scanner(System.in);
        int minValue = 1000;

        for(int i = 0 ; i < num_array.length ; i++){
            num_array[i] = sc.nextInt();
        }

        for(int i = 0 ; i < num_array.length ; i++){
            if(num_array[i] < minValue){
                minValue = num_array[i];
            }
        }

        System.out.println(minValue);
    }
}
