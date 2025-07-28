package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문1_자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;

        try{
            while (num != 0){
                System.out.print("number? ");
                num = sc.nextInt();
                if(num > 0){
                    System.out.println("positive integer");
                } else if (num < 0) {
                    System.out.println("negative integer");
                } else {
                    continue;
                }
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }
    }
}
