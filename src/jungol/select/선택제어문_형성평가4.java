package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_형성평가4 {
    public static void main(String[] args) {
        System.out.println("1. 개 \n2. 고양이 \n3. 병아리");
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Number? ");
            int num = sc.nextInt();

            switch(num){
                case 1:
                    System.out.println("dog");
                    break;
                case 2:
                    System.out.println("cat");
                    break;
                case 3:
                    System.out.println("chick");
                default:
                    System.out.println("I don't know.");
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
