package jungol.jungol_operator;

import java.util.Scanner;

public class 연산자_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        System.out.println((num1!=num2)? 1 : 0);
    }
}
