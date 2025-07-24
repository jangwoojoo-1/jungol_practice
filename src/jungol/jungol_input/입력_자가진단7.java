package jungol.jungol_input;

import java.util.Scanner;

public class 입력_자가진단7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("%d * %d = %d\n%d / %d = %d", num1, num2, num1*num2, num1, num2, num1/num2);
    }
}
