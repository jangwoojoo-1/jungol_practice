package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_형성평가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int total = 0;
        int time = 0;
        if (num1 > num2){
            for(int i = num2 ; i <= num1 ; i++){
                if((i%3)==0 || (i%5) == 0){
                    total += i;
                    time++;
                }
            }
        } else if (num2 > num1){
            for(int i = num1 ; i <= num2 ; i++){
                if((i%3)==0 || (i%5) == 0){
                    total += i;
                    time++;
                }
            }
        } else {
            System.out.println("같은 숫자입니다.");
        }

        System.out.printf("sum : %d\navg : %.1f", total, (double)total/time);
    }
}
