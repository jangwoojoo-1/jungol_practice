package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int year = sc.nextInt();

            if (year%400 == 0){
                System.out.println("leap year");
            } else if (year%100 != 0 && year%4 == 0){
                System.out.println("leap year");
            } else {
                System.out.println("common year");
            }
        }catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
