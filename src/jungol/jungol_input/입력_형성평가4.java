package jungol.jungol_input;

import java.util.Scanner;

public class 입력_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.printf("sum = %d", num1 + num2 + num3);
    }
}
