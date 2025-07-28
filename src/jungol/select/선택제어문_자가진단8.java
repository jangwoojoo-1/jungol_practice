package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_자가진단8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            double grade = sc.nextDouble();

            switch((int)grade){
                case 4:
                    System.out.println("scholarship");
                    break;
                case 3:
                    System.out.println("next semester");
                    break;
                case 2:
                    System.out.println("seasonal semester");
                    break;
                default:
                    System.out.println("retake");
            }
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }

    }
}
