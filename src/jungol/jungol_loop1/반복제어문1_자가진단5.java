package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문1_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        try{
            while(num != -1){
                System.out.print("(입력)");
                num = sc.nextInt();
                if(num%3 == 0){
                    System.out.println("(출력)" + num);
                }
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
