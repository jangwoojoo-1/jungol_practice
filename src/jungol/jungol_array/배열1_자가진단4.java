package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_array = new int[100];
        int i = 0;

        while(true){
            int num = sc.nextInt();
            if(num != 0){
                num_array[i] = num;
                i++;
            } else {
                break;
            }
        }

        for(int j = 0 ; j < 100 ; j++){
            if(num_array[j] != 0){
                System.out.print(num_array[j]);
            } else {
                break;
            }
        }


    }
}
