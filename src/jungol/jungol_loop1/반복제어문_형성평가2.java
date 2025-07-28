package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int odd_num = 0;
        int even_num = 0;
        try{
            while(num != 0){
                num = sc.nextInt();
                if(num < 0){
                    System.out.println("0 이상의 정수를 입력하세요.");
                    odd_num = 0;
                    even_num = 0;
                    continue;
                }
                if(num%2 == 0 && num != 0){
                    even_num++;
                } else if(num%2 == 1) {
                    odd_num++;
                } else {
                    continue;
                }
            }

            System.out.printf("odd : %d\n", odd_num);
            System.out.printf("even : %d", even_num);
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }

    }
}
