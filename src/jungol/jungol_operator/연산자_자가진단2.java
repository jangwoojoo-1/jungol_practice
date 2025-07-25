package jungol.jungol_operator;

import java.util.Scanner;

public class 연산자_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        num1 += 100;
        num2 %= 10;

        System.out.printf("%d %d", num1, num2);
    }
}
