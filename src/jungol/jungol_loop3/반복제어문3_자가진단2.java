package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int n = sc.nextInt();
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1; j <= i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }



    }
}
