package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_연습문제3 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i <= 3 ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 3 ; i >= 1 ; i--){
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
