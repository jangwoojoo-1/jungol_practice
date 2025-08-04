package jungol.method1;

import java.util.Scanner;

public class 함수1_자가진단2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();

        calculateArea(str);
    }

    public static void calculateArea(String s){
        int n = Integer.parseInt(s);
        double pi = 3.14;

        System.out.printf("%.2f", Math.pow(n,2)*pi);
    }
}
