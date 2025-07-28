package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int first_num = 1;

        try{
            while(n < 1){
                System.out.println("자연수를 입력해주세요. ");
                n = sc.nextInt();
            }

            for (int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(first_num + " ");
                    first_num++;
                }
                System.out.println();
            }

        } catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }
    }
}
