package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        try{
            while (n < 1){
                n = sc.nextInt();
            }

            for (int i = n ; i >= 1 ; i--){
                for(int j = n-i ; j >= 1 ; j--){
                    System.out.print(" ");
                }
                for(int z = 1 ; z <= i*2-1 ; z++){
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 2 ; i <= n ; i++){
                for(int j = n-i ; j >= 1 ; j--){
                    System.out.print(" ");
                }
                for(int z = 1 ; z <= i*2-1 ; z++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }
    }
}
