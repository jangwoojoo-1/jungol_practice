package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num1 > num2){
                System.out.println(num1-num2);
            } else if (num2 > num1){
                System.out.println(num2 - num1);
            } else {
                System.out.println("같은 숫자입니다.");
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
