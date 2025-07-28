package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("세 수를 입력하세요. ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            int temp1 = Math.max(num1, num2);
            int temp2 = Math.max(num2, num3);

            int maxValue = Math.max(temp1, temp2);
            System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", maxValue);
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
