package jungol.jungol_loop3;

import java.util.Scanner;

public class 반복제어문3_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int z = 1 ; z <= n-i;z++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
