package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int odd_num = 0;

        try{
            for(int i = 1 ; i <= n ; i= i+2){
                if(n > sum){
                    sum += i;
                    odd_num++;
                } else {
                    break;
                }
            }

            System.out.printf("%d %d", odd_num, sum);
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }
    }
}
