package jungol.jungol_operator;

import java.util.Scanner;

public class 연산자_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b){
            System.out.print(1);
        } else {
            System.out.print(0);
        }

        System.out.print((b==c) ? " " + 1 : " " + 0);

        if (a != b){
            System.out.print(" " + 1);
        } else {
            System.out.print(" " + 0);
        }

        System.out.print((b!=c)? " " + 1 : " " + 0);
    }
}
