package jungol.jungol_operator;

import java.util.Scanner;

public class 연산자_자가진단8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean result1 = (num1 > num2 && num1 > num3);
        boolean result2 = (num1 == num2 && num1 == num3);

        System.out.printf("%b %b", result1, result2);
    }
}
