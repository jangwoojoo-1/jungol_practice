package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_3 = 0;
        int total_5 = 0;
        for(int i = 0; i< 10; i++){
            int num1 = sc.nextInt();
            if ((num1 % 3) == 0) {
                total_3 += 1;
            }
            if ((num1%5) == 0){
                total_5 += 1;
            }
        }
        System.out.printf("Multiples of 3 : %d\nMultiples of 5 : %d", total_3, total_5);
    }
}
