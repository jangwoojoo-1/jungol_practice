package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문1_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int many = 0;
        int sum = 0;

        try{
            while(num >= 0 && num <= 100){
                num = sc.nextInt();
                if(num <= 100 && num >= 0){
                    sum += num;
                    many++;
                } else {
                    continue;
                }
            }

            System.out.printf("sum : %d\n", sum);
            System.out.printf("avg : %.1f", (double)sum/many);
        } catch(InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
