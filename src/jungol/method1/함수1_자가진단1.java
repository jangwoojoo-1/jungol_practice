package jungol.method1;

import java.util.Scanner;

public class 함수1_자가진단1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        printString(n);
    }

    public static void printString(int n){
        for(int i = 0 ; i < n ; i++){
            System.out.println("~!@#$^&*()_+|");
        }
    }
}
