package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try{
            while(n < 1){
                n = sc.nextInt();
            }
            for (int i = 1 ; i <= n ; i++){
                for (int j = 1 ; j <= i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n-1 ; i >= 1 ; i--){
                for (int j = 1 ; j <= i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }


        } catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }
    }
}
