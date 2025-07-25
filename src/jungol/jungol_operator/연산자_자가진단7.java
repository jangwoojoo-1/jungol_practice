package jungol.jungol_operator;

import java.util.Scanner;

public class 연산자_자가진단7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        boolean tf1 = (num1!=0);
        boolean tf2 = (num2!=0);
        System.out.printf("%b %b", tf1 && tf2, tf1 || tf2);
    }
}
