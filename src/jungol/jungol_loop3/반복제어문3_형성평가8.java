package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int first_num = 1;

        try{
            while (n < 1){
                n = sc.nextInt();
            }

            for (int i = n ; i >= 1 ; i--){
                for(int j = 1 ; j <= (n-i)*2 ; j++){
                    System.out.print(" ");
                }
                for(int z = 1 ; z <= i; z++){
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
