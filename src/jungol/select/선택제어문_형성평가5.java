package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int month = sc.nextInt();

            switch(month){
                case 1:
                    System.out.println(31);
                    break;
                case 2:
                    System.out.println(28);
                    break;
                case 3:
                    System.out.println(31);
                    break;
                case 4:
                    System.out.println(30);
                    break;
                case 5:
                    System.out.println(31);
                    break;
                case 6:
                    System.out.println(30);
                    break;
                case 7:
                    System.out.println(31);
                    break;
                case 8:
                    System.out.println(31);
                    break;
                case 9:
                    System.out.println(30);
                    break;
                case 10:
                    System.out.println(31);
                    break;
                case 11:
                    System.out.println(30);
                    break;
                case 12:
                    System.out.println(31);
                    break;
                default:
                    System.out.println("1~12 사이의 숫자를 입력하세요.");
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }

    }
}
