package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문1_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int many = 0;

        try{
            while(num != 0){
                num = sc.nextInt();

                if(num%3 != 0 && num%5 != 0){
                    many++;
                }
            }
            System.out.println(many);
        } catch(InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }
    }
}
