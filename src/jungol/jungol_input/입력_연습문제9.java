package jungol.jungol_input;

import java.util.Scanner;

public class 입력_연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 실수를 입력하시오.");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.printf("x = %.2f\ny = %.2f", num1, num2);
    }
}
