package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_array = new int[100];
        int max = -1000;
        int min = 1000;

        for (int i = 0 ; i < num_array.length ; i++){
            int n = sc.nextInt();
            while(n > 1000 || n <-1000){
                n = sc.nextInt();
            }
            if(n == 999){
                break;
            } else{
                num_array[i] = n;
                if(num_array[i]>max){
                    max = num_array[i];
                } else if(num_array[i]<min){
                    min = num_array[i];
                }else {
                    continue;
                }
            }
        }
        System.out.printf("max : %d \nmin : %d ", max, min);
    }
}
