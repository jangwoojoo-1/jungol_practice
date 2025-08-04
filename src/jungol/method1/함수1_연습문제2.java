package jungol.method1;

import java.util.Scanner;

public class 함수1_연습문제2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();

        printUpDown(str);
    }

    public static void printUpDown(String s){
        int n = Integer.parseInt(s);
        System.out.println("10큰수 : " + (n+10));
        System.out.println("10작은수 : " + (n-10));
    }
}
