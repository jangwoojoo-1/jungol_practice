package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int A_ascii = 65;
        int first_num = 0;

        try{
            while (n < 1 || n > 6){
                n = sc.nextInt();
            }

            for (int i = 1 ; i <= n ; i++){
                for(int j = n-i+1 ; j >= 1 ; j--){
                    System.out.printf("%c ", A_ascii);
                    A_ascii++;
                }
                for(int z = 1 ; z < i; z++){
                    System.out.printf("%-2d", first_num);
                    first_num++;
                }
                System.out.println();
            }

        }catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }
    }
}
