package jungol.jungol_loop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문1_연습문제4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int many = 0;
        int sum = 0;

        try{
            while(num != 0){
                num = sc.nextInt();
                if(num != 0){
                    many++;
                    sum += num;
                } else {
                    continue;
                }
            }

            System.out.printf("입력된 자료의 개수 = %d\n", many);
            System.out.printf("입력된 자료의 합계 = %d\n", sum);
            System.out.printf("입력된 자료의 평균 = %.2f",(double)sum/many);
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
