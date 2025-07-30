package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_자가진단8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int [] num_array = new int[10];
        int even_total = 0;
        double odd_total = 0;

        for(int i = 0 ; i < num_array.length  ; i++){
            int num = sc.nextInt();
            while (num >= 100000000){
                num = sc.nextInt();
            }
            num_array[i] = num;
            if((i+1)%2 == 0){
                even_total += num_array[i];
            } else {
                odd_total += num_array[i];
            }
        }

        System.out.printf("sum = %d \navg = %.1f ", even_total, odd_total/5.0);

    }
}
