package jungol.jungol_loop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 반복제어문3_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        try{
            for(int i = 0 ; i < 20 ; i++){
                int num = sc.nextInt();
                if (num != 0){
                    sum += num;
                    count++;
                } else {
                    break;
                }
            }

            System.out.printf("%d %d", sum, sum/count);

        } catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }
    }
}
