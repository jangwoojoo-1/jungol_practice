package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_2 = 0;
        int num_1 = 0;
        for (int i = 0 ; i < 10 ; i++){
            int num = sc.nextInt();
            if ((num%2) == 0){
                num_2++;
            } else {
                num_1++;
            }
        }

        System.out.printf("even : %d\nodd : %d", num_2, num_1);
    }
}
