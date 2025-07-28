package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_자가진단9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            if (num1 <= num2 && num1 <= num3){
                System.out.println(num1);
            } else if (num2 <= num1 && num2 <= num3){
                System.out.println(num2);
            } else {
                System.out.println(num3);
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
