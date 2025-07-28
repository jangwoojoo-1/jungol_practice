package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("주사위를 2번 던진 결과를 입력하세요. ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            while(num1 > 6 && num2 > 6 && num1 < 0 && num2 < 0){
                System.out.println("주사위 결과를 제대로 입력해주세요.(1~6) ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
            }

            if (num1 >=4 && num2 >= 4){
                System.out.println("이겼습니다.");
            } else if (num1 >= 4 || num2 >= 4){
                System.out.println("비겼습니다.");
            } else {
                System.out.println("졌습니다.");
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력 가능합니다.");
        }
    }
}
