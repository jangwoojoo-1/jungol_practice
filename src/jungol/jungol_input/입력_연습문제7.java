package jungol.jungol_input;

import java.util.Scanner;

public class 입력_연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하시오. ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("%d + %d = %d\n%d * %d = %d", num1, num2, num1+num2, num1, num2, num1*num2);
    }
}
