package jungol.jungol_input;

import java.util.Scanner;

public class 입력_자가진단8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        String ch1 = sc.next();

        System.out.printf("%.2f\n%.2f\n%s", num1, num2, ch1);
    }
}
