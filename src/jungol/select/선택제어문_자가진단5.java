package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            if (num1 >= 4.0 && num2 >= 4.0) {
                System.out.println("A");
            } else if (num1 >= 3.0 && num2 >= 3.0) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
