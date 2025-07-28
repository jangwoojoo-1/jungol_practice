package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문1_자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int many = 0;
        int sum = 0;

        try{
            while(num < 100){
                num = sc.nextInt();
                many++;
                sum += num;
            }

            System.out.printf("%d \n%.1f", sum, (double)sum/many);
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
