package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int maxValue = Math.max(num1, num2);
            System.out.println(maxValue);

         }catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
         }
    }
}
