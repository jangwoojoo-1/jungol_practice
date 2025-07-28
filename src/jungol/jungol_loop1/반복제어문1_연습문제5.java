package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문1_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int odd_num = 0;
        int odd_sum = 0;

        try{
            while(num != 0){
                num = sc.nextInt();
                if(num%2 == 1){
                    odd_num++;
                    odd_sum += num;
                } else {
                    continue;
                }
            }
            System.out.printf("홀수의 합 = %d\n", odd_sum);
            System.out.printf("홀수의 평균 = %d", odd_sum/odd_num);
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }

    }
}
