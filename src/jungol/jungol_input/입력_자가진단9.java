package jungol.jungol_input;

import java.util.Scanner;

public class 입력_자가진단9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        System.out.printf("%.3f\n%.3f\n%.3f", num1, num2, num3);
    }
}
