package jungol.jungol_operator;

import java.util.Scanner;

public class 연산자_연습문제2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("5개의 수를 입력하시오. ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        num1 += 3;
        num2 -= 3;
        num3 *= 3;
        num4 /= 3;
        num5 %= 3;

        System.out.printf("%d %d %d %d %d", num1, num2, num3, num4, num5);
    }
}
