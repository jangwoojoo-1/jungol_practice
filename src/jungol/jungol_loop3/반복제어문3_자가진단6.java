package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int first_ch = 65;

        try{
            while(n < 1 || n > 6){
                System.out.print("자연수를 입력해주세요. (1에서 6 사이) ");
                n = sc.nextInt();
            }

            for (int i = n ; i >= 1 ; i--){
                for(int j = 1 ; j <= i ; j++){
                    System.out.printf("%c", first_ch);
                    first_ch++;
                }
                System.out.println();
            }

        } catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }
    }
}
