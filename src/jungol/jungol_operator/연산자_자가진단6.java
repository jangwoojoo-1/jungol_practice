package jungol.jungol_operator;

import java.util.Scanner;

public class 연산자_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%d > %d --- %b\n", num1, num2, num1>num2);
        System.out.printf("%d < %d --- %b\n", num1, num2, num1<num2);
        System.out.printf("%d >= %d --- %b\n", num1, num2, num1>=num2);
        System.out.printf("%d <= %d --- %b", num1, num2, num1<=num2);
    }
}
