package jungol.select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int num = sc.nextInt();

            if (num == 0){
                System.out.println("zero");
            } else if (num > 1) {
                System.out.println("plus");
            } else {
                System.out.println("minus");
            }
        }catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
